package com.sh.shop.initializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sh.shop.config.MyBatisConfig;
import com.sh.shop.config.WebConfig;

@Order(1)
public class WebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	// {!begin addToRootContext}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { MyBatisConfig.class };
	}

	// {!end addToRootContext}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		return new Filter[] { characterEncodingFilter };
	}

}
