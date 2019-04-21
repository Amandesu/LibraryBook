package springboot.librarybook.entity.book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNull() {
            addCriterion("categoryName is null");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNotNull() {
            addCriterion("categoryName is not null");
            return (Criteria) this;
        }

        public Criteria andCategorynameEqualTo(String value) {
            addCriterion("categoryName =", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotEqualTo(String value) {
            addCriterion("categoryName <>", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThan(String value) {
            addCriterion("categoryName >", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("categoryName >=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThan(String value) {
            addCriterion("categoryName <", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThanOrEqualTo(String value) {
            addCriterion("categoryName <=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLike(String value) {
            addCriterion("categoryName like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotLike(String value) {
            addCriterion("categoryName not like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameIn(List<String> values) {
            addCriterion("categoryName in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotIn(List<String> values) {
            addCriterion("categoryName not in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameBetween(String value1, String value2) {
            addCriterion("categoryName between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotBetween(String value1, String value2) {
            addCriterion("categoryName not between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCollectcountIsNull() {
            addCriterion("collectCount is null");
            return (Criteria) this;
        }

        public Criteria andCollectcountIsNotNull() {
            addCriterion("collectCount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectcountEqualTo(Integer value) {
            addCriterion("collectCount =", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotEqualTo(Integer value) {
            addCriterion("collectCount <>", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountGreaterThan(Integer value) {
            addCriterion("collectCount >", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectCount >=", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountLessThan(Integer value) {
            addCriterion("collectCount <", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountLessThanOrEqualTo(Integer value) {
            addCriterion("collectCount <=", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountIn(List<Integer> values) {
            addCriterion("collectCount in", values, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotIn(List<Integer> values) {
            addCriterion("collectCount not in", values, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountBetween(Integer value1, Integer value2) {
            addCriterion("collectCount between", value1, value2, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotBetween(Integer value1, Integer value2) {
            addCriterion("collectCount not between", value1, value2, "collectcount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountIsNull() {
            addCriterion("favoriteCount is null");
            return (Criteria) this;
        }

        public Criteria andFavoritecountIsNotNull() {
            addCriterion("favoriteCount is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritecountEqualTo(Integer value) {
            addCriterion("favoriteCount =", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotEqualTo(Integer value) {
            addCriterion("favoriteCount <>", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountGreaterThan(Integer value) {
            addCriterion("favoriteCount >", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("favoriteCount >=", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountLessThan(Integer value) {
            addCriterion("favoriteCount <", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountLessThanOrEqualTo(Integer value) {
            addCriterion("favoriteCount <=", value, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountIn(List<Integer> values) {
            addCriterion("favoriteCount in", values, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotIn(List<Integer> values) {
            addCriterion("favoriteCount not in", values, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountBetween(Integer value1, Integer value2) {
            addCriterion("favoriteCount between", value1, value2, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andFavoritecountNotBetween(Integer value1, Integer value2) {
            addCriterion("favoriteCount not between", value1, value2, "favoritecount");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIsNull() {
            addCriterion("downloadLink is null");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIsNotNull() {
            addCriterion("downloadLink is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkEqualTo(String value) {
            addCriterion("downloadLink =", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotEqualTo(String value) {
            addCriterion("downloadLink <>", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkGreaterThan(String value) {
            addCriterion("downloadLink >", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkGreaterThanOrEqualTo(String value) {
            addCriterion("downloadLink >=", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLessThan(String value) {
            addCriterion("downloadLink <", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLessThanOrEqualTo(String value) {
            addCriterion("downloadLink <=", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLike(String value) {
            addCriterion("downloadLink like", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotLike(String value) {
            addCriterion("downloadLink not like", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIn(List<String> values) {
            addCriterion("downloadLink in", values, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotIn(List<String> values) {
            addCriterion("downloadLink not in", values, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkBetween(String value1, String value2) {
            addCriterion("downloadLink between", value1, value2, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotBetween(String value1, String value2) {
            addCriterion("downloadLink not between", value1, value2, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameIsNull() {
            addCriterion("secondCatName is null");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameIsNotNull() {
            addCriterion("secondCatName is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameEqualTo(String value) {
            addCriterion("secondCatName =", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameNotEqualTo(String value) {
            addCriterion("secondCatName <>", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameGreaterThan(String value) {
            addCriterion("secondCatName >", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameGreaterThanOrEqualTo(String value) {
            addCriterion("secondCatName >=", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameLessThan(String value) {
            addCriterion("secondCatName <", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameLessThanOrEqualTo(String value) {
            addCriterion("secondCatName <=", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameLike(String value) {
            addCriterion("secondCatName like", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameNotLike(String value) {
            addCriterion("secondCatName not like", value, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameIn(List<String> values) {
            addCriterion("secondCatName in", values, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameNotIn(List<String> values) {
            addCriterion("secondCatName not in", values, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameBetween(String value1, String value2) {
            addCriterion("secondCatName between", value1, value2, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatnameNotBetween(String value1, String value2) {
            addCriterion("secondCatName not between", value1, value2, "secondcatname");
            return (Criteria) this;
        }

        public Criteria andSecondcatidIsNull() {
            addCriterion("secondCatId is null");
            return (Criteria) this;
        }

        public Criteria andSecondcatidIsNotNull() {
            addCriterion("secondCatId is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcatidEqualTo(Integer value) {
            addCriterion("secondCatId =", value, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidNotEqualTo(Integer value) {
            addCriterion("secondCatId <>", value, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidGreaterThan(Integer value) {
            addCriterion("secondCatId >", value, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondCatId >=", value, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidLessThan(Integer value) {
            addCriterion("secondCatId <", value, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidLessThanOrEqualTo(Integer value) {
            addCriterion("secondCatId <=", value, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidIn(List<Integer> values) {
            addCriterion("secondCatId in", values, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidNotIn(List<Integer> values) {
            addCriterion("secondCatId not in", values, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidBetween(Integer value1, Integer value2) {
            addCriterion("secondCatId between", value1, value2, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andSecondcatidNotBetween(Integer value1, Integer value2) {
            addCriterion("secondCatId not between", value1, value2, "secondcatid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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