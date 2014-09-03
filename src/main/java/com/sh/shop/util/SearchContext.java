package com.sh.shop.util;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class SearchContext {
	
	/**
	 * 로그인 아이디
	 */
	private String userId;
	
	/**
	 * 공개 여부
	 */
	private String useyn;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUseyn() {
		return useyn;
	}

	public void setUseyn(String useyn) {
		this.useyn = useyn;
	}


	/**
	 * 검색타입
	 */
	private String s_type;

	/**
	 * 키워드
	 */
	private String s_keyword;

	/**
	 * 카테고리
	 */
	private String s_category;

	public String getS_type() {
		return s_type;
	}

	public void setS_type(String s_type) {
		this.s_type = s_type;
	}

	public String getS_keyword() {
		return s_keyword;
	}

	public void setS_keyword(String s_keyword) {
		this.s_keyword = s_keyword;
	}

	public String getS_category() {
		return s_category;
	}

	public void setS_category(String s_category) {
		this.s_category = s_category;
	}
	
	/**
	 * 현재 페이지
	 */
	private int p_page = 1;

	/**
	 * 게시판에 출력될 게시물의 수
	 */
	private int p_rowsize = 10;

	/**
	 * 페이지 네비게이터의 사이즈
	 */
	private int p_pagesize = 10;

	/**
	 * 쿼리된 아이템의 총 수
	 */
	private long p_totalcount;
	
	private int p_totalpage;

	private int start_row_num;
	private int end_row_num;
	
	private int p_prevpage;
	private int p_nextpage;

	public void calculateRowNum() {
		this.end_row_num = this.p_page * this.p_rowsize;
		this.start_row_num = this.end_row_num - (this.p_rowsize - 1);
		this.p_totalpage = (int) Math.ceil((double) p_totalcount / (double) p_rowsize);
		if (this.p_totalpage == 0) {
			this.p_totalpage = 1;
		}
		
		this.p_prevpage = this.p_page - 1 < 1 ? 1 : this.p_page - 1;
		this.p_nextpage = this.p_page + 1 > this.p_totalpage ? this.p_page : this.p_page + 1;
	}

	public int getP_page() {
		return p_page;
	}

	public void setP_page(int p_page) {
		this.p_page = p_page;
		calculateRowNum();
	}

	public int getP_rowsize() {
		return p_rowsize;
	}

	public void setP_rowsize(int p_rowsize) {
		this.p_rowsize = p_rowsize;
		calculateRowNum();
	}

	public int getP_pagesize() {
		return p_pagesize;
	}

	public void setP_pagesize(int p_pagesize) {
		this.p_pagesize = p_pagesize;
		calculateRowNum();
	}

	public long getP_totalcount() {
		return p_totalcount;
	}

	public void setP_totalcount(long p_totalcount) {
		this.p_totalcount = p_totalcount;
		calculateRowNum();
	}

	public int getStart_row_num() {
		return start_row_num;
	}

	public int getEnd_row_num() {
		return end_row_num;
	}
	
	public int getP_totalpage() {
		return p_totalpage;
	}

	public int getP_prevpage() {
		return p_prevpage;
	}

	public int getP_nextpage() {
		return p_nextpage;
	}
	
	/**
	 * 정렬 필드
	 */
	private String o_field;


	/**
	 * 정렬 방향
	 */
	private String o_direction;
	
	public String getO_field() {
		return o_field;
	}

	public void setO_field(String o_field) {
		this.o_field = o_field;
	}

	public String getO_direction() {
		return o_direction;
	}

	public void setO_direction(String o_direction) {
		this.o_direction = o_direction;
	}

	public String getOrderParam() {
		URLBuilder builder = new URLBuilder();
		builder.addParameter("o_field", o_field, "");
		builder.addParameter("o_direction", o_direction, "");
		return builder.toString();
	}
	
	public String getPagingParam() {
		URLBuilder builder = new URLBuilder();
		builder.addParameter("p_page", p_page, "");
		builder.addParameter("p_pagesize", p_pagesize, "");
		return builder.toString();
	}

	public String getSearchParam() {
		URLBuilder builder = new URLBuilder();
		builder.addParameter("s_type", s_type, "");
		builder.addParameter("s_keyword", s_keyword, "");
		builder.addParameter("s_category", s_category, "");
		return builder.toString();
	}
	
	public String getAllParam() {
		return getPagingParam() + "&" + getOrderParam() + "&" + getSearchParam();
//		return getPagingParam() + "&" + getSearchParam();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
