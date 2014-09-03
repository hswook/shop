package com.sh.shop.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLBuilder {

	private StringBuilder builder;
	private String encoding;

	public URLBuilder() {
		builder = new StringBuilder();
		this.encoding = "UTF-8";
	}

	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public void addParameter(String parameterName, Object value, String defaultValue) {
		StringBuilder localBuilder = makeForehead(parameterName);

		if (ValidationUtils.isNotNull(value))
			localBuilder.append(encode(String.valueOf(value)));
		else if (ValidationUtils.isNotNull(defaultValue))
			localBuilder.append(encode(defaultValue));
		else
			return;
		builder.append(localBuilder.toString());
	}

	private String encode(String string) {
		try {
			return URLEncoder.encode(string, encoding);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	private StringBuilder makeForehead(String parameterName) {
		StringBuilder localBuilder = new StringBuilder();

		if (builder.length() > 0)
			localBuilder.append("&");

		localBuilder.append(parameterName);
		localBuilder.append("=");
		return localBuilder;
	}

	@Override
	public String toString() {
		return builder.toString();
	}

}