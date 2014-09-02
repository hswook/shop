package com.sh.shop.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("BoardConfigExample")
public class BoardConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoardConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`NAME` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`NAME` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`NAME` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`NAME` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`NAME` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`NAME` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`NAME` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`NAME` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`NAME` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`NAME` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`NAME` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`NAME` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`NAME` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDesciptionIsNull() {
            addCriterion("DESCIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDesciptionIsNotNull() {
            addCriterion("DESCIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDesciptionEqualTo(String value) {
            addCriterion("DESCIPTION =", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionNotEqualTo(String value) {
            addCriterion("DESCIPTION <>", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionGreaterThan(String value) {
            addCriterion("DESCIPTION >", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCIPTION >=", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionLessThan(String value) {
            addCriterion("DESCIPTION <", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionLessThanOrEqualTo(String value) {
            addCriterion("DESCIPTION <=", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionLike(String value) {
            addCriterion("DESCIPTION like", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionNotLike(String value) {
            addCriterion("DESCIPTION not like", value, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionIn(List<String> values) {
            addCriterion("DESCIPTION in", values, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionNotIn(List<String> values) {
            addCriterion("DESCIPTION not in", values, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionBetween(String value1, String value2) {
            addCriterion("DESCIPTION between", value1, value2, "desciption");
            return (Criteria) this;
        }

        public Criteria andDesciptionNotBetween(String value1, String value2) {
            addCriterion("DESCIPTION not between", value1, value2, "desciption");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNull() {
            addCriterion("`HEADER` is null");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNotNull() {
            addCriterion("`HEADER` is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderEqualTo(String value) {
            addCriterion("`HEADER` =", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotEqualTo(String value) {
            addCriterion("`HEADER` <>", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThan(String value) {
            addCriterion("`HEADER` >", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("`HEADER` >=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThan(String value) {
            addCriterion("`HEADER` <", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThanOrEqualTo(String value) {
            addCriterion("`HEADER` <=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLike(String value) {
            addCriterion("`HEADER` like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotLike(String value) {
            addCriterion("`HEADER` not like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderIn(List<String> values) {
            addCriterion("`HEADER` in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotIn(List<String> values) {
            addCriterion("`HEADER` not in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderBetween(String value1, String value2) {
            addCriterion("`HEADER` between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotBetween(String value1, String value2) {
            addCriterion("`HEADER` not between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNull() {
            addCriterion("VIEW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNotNull() {
            addCriterion("VIEW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andViewTypeEqualTo(String value) {
            addCriterion("VIEW_TYPE =", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotEqualTo(String value) {
            addCriterion("VIEW_TYPE <>", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThan(String value) {
            addCriterion("VIEW_TYPE >", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_TYPE >=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThan(String value) {
            addCriterion("VIEW_TYPE <", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThanOrEqualTo(String value) {
            addCriterion("VIEW_TYPE <=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLike(String value) {
            addCriterion("VIEW_TYPE like", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotLike(String value) {
            addCriterion("VIEW_TYPE not like", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeIn(List<String> values) {
            addCriterion("VIEW_TYPE in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotIn(List<String> values) {
            addCriterion("VIEW_TYPE not in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeBetween(String value1, String value2) {
            addCriterion("VIEW_TYPE between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotBetween(String value1, String value2) {
            addCriterion("VIEW_TYPE not between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(BigDecimal value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(BigDecimal value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(BigDecimal value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<BigDecimal> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andUseSecurityIsNull() {
            addCriterion("USE_SECURITY is null");
            return (Criteria) this;
        }

        public Criteria andUseSecurityIsNotNull() {
            addCriterion("USE_SECURITY is not null");
            return (Criteria) this;
        }

        public Criteria andUseSecurityEqualTo(Short value) {
            addCriterion("USE_SECURITY =", value, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityNotEqualTo(Short value) {
            addCriterion("USE_SECURITY <>", value, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityGreaterThan(Short value) {
            addCriterion("USE_SECURITY >", value, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityGreaterThanOrEqualTo(Short value) {
            addCriterion("USE_SECURITY >=", value, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityLessThan(Short value) {
            addCriterion("USE_SECURITY <", value, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityLessThanOrEqualTo(Short value) {
            addCriterion("USE_SECURITY <=", value, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityIn(List<Short> values) {
            addCriterion("USE_SECURITY in", values, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityNotIn(List<Short> values) {
            addCriterion("USE_SECURITY not in", values, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityBetween(Short value1, Short value2) {
            addCriterion("USE_SECURITY between", value1, value2, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseSecurityNotBetween(Short value1, Short value2) {
            addCriterion("USE_SECURITY not between", value1, value2, "useSecurity");
            return (Criteria) this;
        }

        public Criteria andUseUploadIsNull() {
            addCriterion("USE_UPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andUseUploadIsNotNull() {
            addCriterion("USE_UPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andUseUploadEqualTo(Short value) {
            addCriterion("USE_UPLOAD =", value, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadNotEqualTo(Short value) {
            addCriterion("USE_UPLOAD <>", value, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadGreaterThan(Short value) {
            addCriterion("USE_UPLOAD >", value, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadGreaterThanOrEqualTo(Short value) {
            addCriterion("USE_UPLOAD >=", value, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadLessThan(Short value) {
            addCriterion("USE_UPLOAD <", value, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadLessThanOrEqualTo(Short value) {
            addCriterion("USE_UPLOAD <=", value, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadIn(List<Short> values) {
            addCriterion("USE_UPLOAD in", values, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadNotIn(List<Short> values) {
            addCriterion("USE_UPLOAD not in", values, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadBetween(Short value1, Short value2) {
            addCriterion("USE_UPLOAD between", value1, value2, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseUploadNotBetween(Short value1, Short value2) {
            addCriterion("USE_UPLOAD not between", value1, value2, "useUpload");
            return (Criteria) this;
        }

        public Criteria andUseCommentIsNull() {
            addCriterion("USE_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andUseCommentIsNotNull() {
            addCriterion("USE_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andUseCommentEqualTo(Short value) {
            addCriterion("USE_COMMENT =", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotEqualTo(Short value) {
            addCriterion("USE_COMMENT <>", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentGreaterThan(Short value) {
            addCriterion("USE_COMMENT >", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentGreaterThanOrEqualTo(Short value) {
            addCriterion("USE_COMMENT >=", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentLessThan(Short value) {
            addCriterion("USE_COMMENT <", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentLessThanOrEqualTo(Short value) {
            addCriterion("USE_COMMENT <=", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentIn(List<Short> values) {
            addCriterion("USE_COMMENT in", values, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotIn(List<Short> values) {
            addCriterion("USE_COMMENT not in", values, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentBetween(Short value1, Short value2) {
            addCriterion("USE_COMMENT between", value1, value2, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotBetween(Short value1, Short value2) {
            addCriterion("USE_COMMENT not between", value1, value2, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseReplyIsNull() {
            addCriterion("USE_REPLY is null");
            return (Criteria) this;
        }

        public Criteria andUseReplyIsNotNull() {
            addCriterion("USE_REPLY is not null");
            return (Criteria) this;
        }

        public Criteria andUseReplyEqualTo(Short value) {
            addCriterion("USE_REPLY =", value, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyNotEqualTo(Short value) {
            addCriterion("USE_REPLY <>", value, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyGreaterThan(Short value) {
            addCriterion("USE_REPLY >", value, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyGreaterThanOrEqualTo(Short value) {
            addCriterion("USE_REPLY >=", value, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyLessThan(Short value) {
            addCriterion("USE_REPLY <", value, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyLessThanOrEqualTo(Short value) {
            addCriterion("USE_REPLY <=", value, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyIn(List<Short> values) {
            addCriterion("USE_REPLY in", values, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyNotIn(List<Short> values) {
            addCriterion("USE_REPLY not in", values, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyBetween(Short value1, Short value2) {
            addCriterion("USE_REPLY between", value1, value2, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseReplyNotBetween(Short value1, Short value2) {
            addCriterion("USE_REPLY not between", value1, value2, "useReply");
            return (Criteria) this;
        }

        public Criteria andUseScheduleIsNull() {
            addCriterion("USE_SCHEDULE is null");
            return (Criteria) this;
        }

        public Criteria andUseScheduleIsNotNull() {
            addCriterion("USE_SCHEDULE is not null");
            return (Criteria) this;
        }

        public Criteria andUseScheduleEqualTo(Short value) {
            addCriterion("USE_SCHEDULE =", value, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleNotEqualTo(Short value) {
            addCriterion("USE_SCHEDULE <>", value, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleGreaterThan(Short value) {
            addCriterion("USE_SCHEDULE >", value, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleGreaterThanOrEqualTo(Short value) {
            addCriterion("USE_SCHEDULE >=", value, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleLessThan(Short value) {
            addCriterion("USE_SCHEDULE <", value, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleLessThanOrEqualTo(Short value) {
            addCriterion("USE_SCHEDULE <=", value, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleIn(List<Short> values) {
            addCriterion("USE_SCHEDULE in", values, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleNotIn(List<Short> values) {
            addCriterion("USE_SCHEDULE not in", values, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleBetween(Short value1, Short value2) {
            addCriterion("USE_SCHEDULE between", value1, value2, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUseScheduleNotBetween(Short value1, Short value2) {
            addCriterion("USE_SCHEDULE not between", value1, value2, "useSchedule");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryIsNull() {
            addCriterion("USE_POST_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryIsNotNull() {
            addCriterion("USE_POST_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryEqualTo(Short value) {
            addCriterion("USE_POST_CATEGORY =", value, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryNotEqualTo(Short value) {
            addCriterion("USE_POST_CATEGORY <>", value, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryGreaterThan(Short value) {
            addCriterion("USE_POST_CATEGORY >", value, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryGreaterThanOrEqualTo(Short value) {
            addCriterion("USE_POST_CATEGORY >=", value, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryLessThan(Short value) {
            addCriterion("USE_POST_CATEGORY <", value, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryLessThanOrEqualTo(Short value) {
            addCriterion("USE_POST_CATEGORY <=", value, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryIn(List<Short> values) {
            addCriterion("USE_POST_CATEGORY in", values, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryNotIn(List<Short> values) {
            addCriterion("USE_POST_CATEGORY not in", values, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryBetween(Short value1, Short value2) {
            addCriterion("USE_POST_CATEGORY between", value1, value2, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andUsePostCategoryNotBetween(Short value1, Short value2) {
            addCriterion("USE_POST_CATEGORY not between", value1, value2, "usePostCategory");
            return (Criteria) this;
        }

        public Criteria andAutholityReadIsNull() {
            addCriterion("AUTHOLITY_READ is null");
            return (Criteria) this;
        }

        public Criteria andAutholityReadIsNotNull() {
            addCriterion("AUTHOLITY_READ is not null");
            return (Criteria) this;
        }

        public Criteria andAutholityReadEqualTo(String value) {
            addCriterion("AUTHOLITY_READ =", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadNotEqualTo(String value) {
            addCriterion("AUTHOLITY_READ <>", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadGreaterThan(String value) {
            addCriterion("AUTHOLITY_READ >", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOLITY_READ >=", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadLessThan(String value) {
            addCriterion("AUTHOLITY_READ <", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadLessThanOrEqualTo(String value) {
            addCriterion("AUTHOLITY_READ <=", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadLike(String value) {
            addCriterion("AUTHOLITY_READ like", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadNotLike(String value) {
            addCriterion("AUTHOLITY_READ not like", value, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadIn(List<String> values) {
            addCriterion("AUTHOLITY_READ in", values, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadNotIn(List<String> values) {
            addCriterion("AUTHOLITY_READ not in", values, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadBetween(String value1, String value2) {
            addCriterion("AUTHOLITY_READ between", value1, value2, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityReadNotBetween(String value1, String value2) {
            addCriterion("AUTHOLITY_READ not between", value1, value2, "autholityRead");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteIsNull() {
            addCriterion("AUTHOLITY_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteIsNotNull() {
            addCriterion("AUTHOLITY_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteEqualTo(String value) {
            addCriterion("AUTHOLITY_WRITE =", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteNotEqualTo(String value) {
            addCriterion("AUTHOLITY_WRITE <>", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteGreaterThan(String value) {
            addCriterion("AUTHOLITY_WRITE >", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOLITY_WRITE >=", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteLessThan(String value) {
            addCriterion("AUTHOLITY_WRITE <", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteLessThanOrEqualTo(String value) {
            addCriterion("AUTHOLITY_WRITE <=", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteLike(String value) {
            addCriterion("AUTHOLITY_WRITE like", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteNotLike(String value) {
            addCriterion("AUTHOLITY_WRITE not like", value, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteIn(List<String> values) {
            addCriterion("AUTHOLITY_WRITE in", values, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteNotIn(List<String> values) {
            addCriterion("AUTHOLITY_WRITE not in", values, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteBetween(String value1, String value2) {
            addCriterion("AUTHOLITY_WRITE between", value1, value2, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andAutholityWriteNotBetween(String value1, String value2) {
            addCriterion("AUTHOLITY_WRITE not between", value1, value2, "autholityWrite");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}