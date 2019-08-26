package com.hensu.javapractise.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarkerExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCityNoIsNull() {
            addCriterion("city_no is null");
            return (Criteria) this;
        }

        public Criteria andCityNoIsNotNull() {
            addCriterion("city_no is not null");
            return (Criteria) this;
        }

        public Criteria andCityNoEqualTo(String value) {
            addCriterion("city_no =", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoNotEqualTo(String value) {
            addCriterion("city_no <>", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoGreaterThan(String value) {
            addCriterion("city_no >", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoGreaterThanOrEqualTo(String value) {
            addCriterion("city_no >=", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoLessThan(String value) {
            addCriterion("city_no <", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoLessThanOrEqualTo(String value) {
            addCriterion("city_no <=", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoLike(String value) {
            addCriterion("city_no like", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoNotLike(String value) {
            addCriterion("city_no not like", value, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoIn(List<String> values) {
            addCriterion("city_no in", values, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoNotIn(List<String> values) {
            addCriterion("city_no not in", values, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoBetween(String value1, String value2) {
            addCriterion("city_no between", value1, value2, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCityNoNotBetween(String value1, String value2) {
            addCriterion("city_no not between", value1, value2, "cityNo");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNull() {
            addCriterion("delete_date is null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNotNull() {
            addCriterion("delete_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateEqualTo(Date value) {
            addCriterion("delete_date =", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotEqualTo(Date value) {
            addCriterion("delete_date <>", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThan(Date value) {
            addCriterion("delete_date >", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_date >=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThan(Date value) {
            addCriterion("delete_date <", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThanOrEqualTo(Date value) {
            addCriterion("delete_date <=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIn(List<Date> values) {
            addCriterion("delete_date in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotIn(List<Date> values) {
            addCriterion("delete_date not in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateBetween(Date value1, Date value2) {
            addCriterion("delete_date between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotBetween(Date value1, Date value2) {
            addCriterion("delete_date not between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNull() {
            addCriterion("delete_name is null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNotNull() {
            addCriterion("delete_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameEqualTo(String value) {
            addCriterion("delete_name =", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotEqualTo(String value) {
            addCriterion("delete_name <>", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThan(String value) {
            addCriterion("delete_name >", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThanOrEqualTo(String value) {
            addCriterion("delete_name >=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThan(String value) {
            addCriterion("delete_name <", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThanOrEqualTo(String value) {
            addCriterion("delete_name <=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLike(String value) {
            addCriterion("delete_name like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotLike(String value) {
            addCriterion("delete_name not like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIn(List<String> values) {
            addCriterion("delete_name in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotIn(List<String> values) {
            addCriterion("delete_name not in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameBetween(String value1, String value2) {
            addCriterion("delete_name between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotBetween(String value1, String value2) {
            addCriterion("delete_name not between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNull() {
            addCriterion("district_name is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("district_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("district_name =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("district_name <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("district_name >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("district_name >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("district_name <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("district_name <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("district_name like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("district_name not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("district_name in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("district_name not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("district_name between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("district_name not between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNoIsNull() {
            addCriterion("district_no is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNoIsNotNull() {
            addCriterion("district_no is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNoEqualTo(String value) {
            addCriterion("district_no =", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoNotEqualTo(String value) {
            addCriterion("district_no <>", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoGreaterThan(String value) {
            addCriterion("district_no >", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoGreaterThanOrEqualTo(String value) {
            addCriterion("district_no >=", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoLessThan(String value) {
            addCriterion("district_no <", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoLessThanOrEqualTo(String value) {
            addCriterion("district_no <=", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoLike(String value) {
            addCriterion("district_no like", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoNotLike(String value) {
            addCriterion("district_no not like", value, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoIn(List<String> values) {
            addCriterion("district_no in", values, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoNotIn(List<String> values) {
            addCriterion("district_no not in", values, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoBetween(String value1, String value2) {
            addCriterion("district_no between", value1, value2, "districtNo");
            return (Criteria) this;
        }

        public Criteria andDistrictNoNotBetween(String value1, String value2) {
            addCriterion("district_no not between", value1, value2, "districtNo");
            return (Criteria) this;
        }

        public Criteria andErrorMesIsNull() {
            addCriterion("error_mes is null");
            return (Criteria) this;
        }

        public Criteria andErrorMesIsNotNull() {
            addCriterion("error_mes is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMesEqualTo(String value) {
            addCriterion("error_mes =", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesNotEqualTo(String value) {
            addCriterion("error_mes <>", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesGreaterThan(String value) {
            addCriterion("error_mes >", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesGreaterThanOrEqualTo(String value) {
            addCriterion("error_mes >=", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesLessThan(String value) {
            addCriterion("error_mes <", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesLessThanOrEqualTo(String value) {
            addCriterion("error_mes <=", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesLike(String value) {
            addCriterion("error_mes like", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesNotLike(String value) {
            addCriterion("error_mes not like", value, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesIn(List<String> values) {
            addCriterion("error_mes in", values, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesNotIn(List<String> values) {
            addCriterion("error_mes not in", values, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesBetween(String value1, String value2) {
            addCriterion("error_mes between", value1, value2, "errorMes");
            return (Criteria) this;
        }

        public Criteria andErrorMesNotBetween(String value1, String value2) {
            addCriterion("error_mes not between", value1, value2, "errorMes");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("in_date =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("in_date <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("in_date >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("in_date >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("in_date <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("in_date <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("in_date in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("in_date not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("in_date between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("in_date not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIsNull() {
            addCriterion("operator_type is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIsNotNull() {
            addCriterion("operator_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeEqualTo(String value) {
            addCriterion("operator_type =", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotEqualTo(String value) {
            addCriterion("operator_type <>", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeGreaterThan(String value) {
            addCriterion("operator_type >", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operator_type >=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLessThan(String value) {
            addCriterion("operator_type <", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLessThanOrEqualTo(String value) {
            addCriterion("operator_type <=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLike(String value) {
            addCriterion("operator_type like", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotLike(String value) {
            addCriterion("operator_type not like", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIn(List<String> values) {
            addCriterion("operator_type in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotIn(List<String> values) {
            addCriterion("operator_type not in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeBetween(String value1, String value2) {
            addCriterion("operator_type between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotBetween(String value1, String value2) {
            addCriterion("operator_type not between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andProvinceNoIsNull() {
            addCriterion("province_no is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNoIsNotNull() {
            addCriterion("province_no is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNoEqualTo(String value) {
            addCriterion("province_no =", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoNotEqualTo(String value) {
            addCriterion("province_no <>", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoGreaterThan(String value) {
            addCriterion("province_no >", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoGreaterThanOrEqualTo(String value) {
            addCriterion("province_no >=", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoLessThan(String value) {
            addCriterion("province_no <", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoLessThanOrEqualTo(String value) {
            addCriterion("province_no <=", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoLike(String value) {
            addCriterion("province_no like", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoNotLike(String value) {
            addCriterion("province_no not like", value, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoIn(List<String> values) {
            addCriterion("province_no in", values, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoNotIn(List<String> values) {
            addCriterion("province_no not in", values, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoBetween(String value1, String value2) {
            addCriterion("province_no between", value1, value2, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andProvinceNoNotBetween(String value1, String value2) {
            addCriterion("province_no not between", value1, value2, "provinceNo");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNull() {
            addCriterion("time_stamp is null");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNotNull() {
            addCriterion("time_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStampEqualTo(String value) {
            addCriterion("time_stamp =", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotEqualTo(String value) {
            addCriterion("time_stamp <>", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThan(String value) {
            addCriterion("time_stamp >", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThanOrEqualTo(String value) {
            addCriterion("time_stamp >=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThan(String value) {
            addCriterion("time_stamp <", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThanOrEqualTo(String value) {
            addCriterion("time_stamp <=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLike(String value) {
            addCriterion("time_stamp like", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotLike(String value) {
            addCriterion("time_stamp not like", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampIn(List<String> values) {
            addCriterion("time_stamp in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotIn(List<String> values) {
            addCriterion("time_stamp not in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampBetween(String value1, String value2) {
            addCriterion("time_stamp between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotBetween(String value1, String value2) {
            addCriterion("time_stamp not between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIsNull() {
            addCriterion("approval_name is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIsNotNull() {
            addCriterion("approval_name is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNameEqualTo(String value) {
            addCriterion("approval_name =", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotEqualTo(String value) {
            addCriterion("approval_name <>", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameGreaterThan(String value) {
            addCriterion("approval_name >", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameGreaterThanOrEqualTo(String value) {
            addCriterion("approval_name >=", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLessThan(String value) {
            addCriterion("approval_name <", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLessThanOrEqualTo(String value) {
            addCriterion("approval_name <=", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLike(String value) {
            addCriterion("approval_name like", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotLike(String value) {
            addCriterion("approval_name not like", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIn(List<String> values) {
            addCriterion("approval_name in", values, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotIn(List<String> values) {
            addCriterion("approval_name not in", values, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameBetween(String value1, String value2) {
            addCriterion("approval_name between", value1, value2, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotBetween(String value1, String value2) {
            addCriterion("approval_name not between", value1, value2, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNoIsNull() {
            addCriterion("approval_no is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNoIsNotNull() {
            addCriterion("approval_no is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNoEqualTo(String value) {
            addCriterion("approval_no =", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotEqualTo(String value) {
            addCriterion("approval_no <>", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoGreaterThan(String value) {
            addCriterion("approval_no >", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoGreaterThanOrEqualTo(String value) {
            addCriterion("approval_no >=", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoLessThan(String value) {
            addCriterion("approval_no <", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoLessThanOrEqualTo(String value) {
            addCriterion("approval_no <=", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoLike(String value) {
            addCriterion("approval_no like", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotLike(String value) {
            addCriterion("approval_no not like", value, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoIn(List<String> values) {
            addCriterion("approval_no in", values, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotIn(List<String> values) {
            addCriterion("approval_no not in", values, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoBetween(String value1, String value2) {
            addCriterion("approval_no between", value1, value2, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalNoNotBetween(String value1, String value2) {
            addCriterion("approval_no not between", value1, value2, "approvalNo");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameIsNull() {
            addCriterion("approval_user_name is null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameIsNotNull() {
            addCriterion("approval_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameEqualTo(String value) {
            addCriterion("approval_user_name =", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameNotEqualTo(String value) {
            addCriterion("approval_user_name <>", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameGreaterThan(String value) {
            addCriterion("approval_user_name >", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("approval_user_name >=", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameLessThan(String value) {
            addCriterion("approval_user_name <", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameLessThanOrEqualTo(String value) {
            addCriterion("approval_user_name <=", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameLike(String value) {
            addCriterion("approval_user_name like", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameNotLike(String value) {
            addCriterion("approval_user_name not like", value, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameIn(List<String> values) {
            addCriterion("approval_user_name in", values, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameNotIn(List<String> values) {
            addCriterion("approval_user_name not in", values, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameBetween(String value1, String value2) {
            addCriterion("approval_user_name between", value1, value2, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andApprovalUserNameNotBetween(String value1, String value2) {
            addCriterion("approval_user_name not between", value1, value2, "approvalUserName");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeIsNull() {
            addCriterion("business_scode is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeIsNotNull() {
            addCriterion("business_scode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeEqualTo(String value) {
            addCriterion("business_scode =", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeNotEqualTo(String value) {
            addCriterion("business_scode <>", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeGreaterThan(String value) {
            addCriterion("business_scode >", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scode >=", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeLessThan(String value) {
            addCriterion("business_scode <", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeLessThanOrEqualTo(String value) {
            addCriterion("business_scode <=", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeLike(String value) {
            addCriterion("business_scode like", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeNotLike(String value) {
            addCriterion("business_scode not like", value, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeIn(List<String> values) {
            addCriterion("business_scode in", values, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeNotIn(List<String> values) {
            addCriterion("business_scode not in", values, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeBetween(String value1, String value2) {
            addCriterion("business_scode between", value1, value2, "businessScode");
            return (Criteria) this;
        }

        public Criteria andBusinessScodeNotBetween(String value1, String value2) {
            addCriterion("business_scode not between", value1, value2, "businessScode");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(String value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(String value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(String value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(String value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(String value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLike(String value) {
            addCriterion("cancel_date like", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotLike(String value) {
            addCriterion("cancel_date not like", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<String> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<String> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(String value1, String value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(String value1, String value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNull() {
            addCriterion("establish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("establish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(String value) {
            addCriterion("establish_date =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(String value) {
            addCriterion("establish_date <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(String value) {
            addCriterion("establish_date >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(String value) {
            addCriterion("establish_date >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(String value) {
            addCriterion("establish_date <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(String value) {
            addCriterion("establish_date <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLike(String value) {
            addCriterion("establish_date like", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotLike(String value) {
            addCriterion("establish_date not like", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<String> values) {
            addCriterion("establish_date in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<String> values) {
            addCriterion("establish_date not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(String value1, String value2) {
            addCriterion("establish_date between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(String value1, String value2) {
            addCriterion("establish_date not between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumIsNull() {
            addCriterion("legal_identity_num is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumIsNotNull() {
            addCriterion("legal_identity_num is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumEqualTo(String value) {
            addCriterion("legal_identity_num =", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumNotEqualTo(String value) {
            addCriterion("legal_identity_num <>", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumGreaterThan(String value) {
            addCriterion("legal_identity_num >", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("legal_identity_num >=", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumLessThan(String value) {
            addCriterion("legal_identity_num <", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("legal_identity_num <=", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumLike(String value) {
            addCriterion("legal_identity_num like", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumNotLike(String value) {
            addCriterion("legal_identity_num not like", value, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumIn(List<String> values) {
            addCriterion("legal_identity_num in", values, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumNotIn(List<String> values) {
            addCriterion("legal_identity_num not in", values, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumBetween(String value1, String value2) {
            addCriterion("legal_identity_num between", value1, value2, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityNumNotBetween(String value1, String value2) {
            addCriterion("legal_identity_num not between", value1, value2, "legalIdentityNum");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeIsNull() {
            addCriterion("legal_identity_type is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeIsNotNull() {
            addCriterion("legal_identity_type is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeEqualTo(String value) {
            addCriterion("legal_identity_type =", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeNotEqualTo(String value) {
            addCriterion("legal_identity_type <>", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeGreaterThan(String value) {
            addCriterion("legal_identity_type >", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_identity_type >=", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeLessThan(String value) {
            addCriterion("legal_identity_type <", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeLessThanOrEqualTo(String value) {
            addCriterion("legal_identity_type <=", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeLike(String value) {
            addCriterion("legal_identity_type like", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeNotLike(String value) {
            addCriterion("legal_identity_type not like", value, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeIn(List<String> values) {
            addCriterion("legal_identity_type in", values, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeNotIn(List<String> values) {
            addCriterion("legal_identity_type not in", values, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeBetween(String value1, String value2) {
            addCriterion("legal_identity_type between", value1, value2, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityTypeNotBetween(String value1, String value2) {
            addCriterion("legal_identity_type not between", value1, value2, "legalIdentityType");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIsNull() {
            addCriterion("legal_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIsNotNull() {
            addCriterion("legal_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneEqualTo(String value) {
            addCriterion("legal_phone =", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotEqualTo(String value) {
            addCriterion("legal_phone <>", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneGreaterThan(String value) {
            addCriterion("legal_phone >", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_phone >=", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLessThan(String value) {
            addCriterion("legal_phone <", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_phone <=", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLike(String value) {
            addCriterion("legal_phone like", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotLike(String value) {
            addCriterion("legal_phone not like", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIn(List<String> values) {
            addCriterion("legal_phone in", values, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotIn(List<String> values) {
            addCriterion("legal_phone not in", values, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneBetween(String value1, String value2) {
            addCriterion("legal_phone between", value1, value2, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotBetween(String value1, String value2) {
            addCriterion("legal_phone not between", value1, value2, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andSecondNameIsNull() {
            addCriterion("second_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondNameIsNotNull() {
            addCriterion("second_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondNameEqualTo(String value) {
            addCriterion("second_name =", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotEqualTo(String value) {
            addCriterion("second_name <>", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameGreaterThan(String value) {
            addCriterion("second_name >", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_name >=", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLessThan(String value) {
            addCriterion("second_name <", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLessThanOrEqualTo(String value) {
            addCriterion("second_name <=", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLike(String value) {
            addCriterion("second_name like", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotLike(String value) {
            addCriterion("second_name not like", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameIn(List<String> values) {
            addCriterion("second_name in", values, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotIn(List<String> values) {
            addCriterion("second_name not in", values, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameBetween(String value1, String value2) {
            addCriterion("second_name between", value1, value2, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotBetween(String value1, String value2) {
            addCriterion("second_name not between", value1, value2, "secondName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameIsNull() {
            addCriterion("legal_user_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameIsNotNull() {
            addCriterion("legal_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameEqualTo(String value) {
            addCriterion("legal_user_name =", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameNotEqualTo(String value) {
            addCriterion("legal_user_name <>", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameGreaterThan(String value) {
            addCriterion("legal_user_name >", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_user_name >=", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameLessThan(String value) {
            addCriterion("legal_user_name <", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameLessThanOrEqualTo(String value) {
            addCriterion("legal_user_name <=", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameLike(String value) {
            addCriterion("legal_user_name like", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameNotLike(String value) {
            addCriterion("legal_user_name not like", value, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameIn(List<String> values) {
            addCriterion("legal_user_name in", values, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameNotIn(List<String> values) {
            addCriterion("legal_user_name not in", values, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameBetween(String value1, String value2) {
            addCriterion("legal_user_name between", value1, value2, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andLegalUserNameNotBetween(String value1, String value2) {
            addCriterion("legal_user_name not between", value1, value2, "legalUserName");
            return (Criteria) this;
        }

        public Criteria andMarkerNoIsNull() {
            addCriterion("marker_no is null");
            return (Criteria) this;
        }

        public Criteria andMarkerNoIsNotNull() {
            addCriterion("marker_no is not null");
            return (Criteria) this;
        }

        public Criteria andMarkerNoEqualTo(String value) {
            addCriterion("marker_no =", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoNotEqualTo(String value) {
            addCriterion("marker_no <>", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoGreaterThan(String value) {
            addCriterion("marker_no >", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoGreaterThanOrEqualTo(String value) {
            addCriterion("marker_no >=", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoLessThan(String value) {
            addCriterion("marker_no <", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoLessThanOrEqualTo(String value) {
            addCriterion("marker_no <=", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoLike(String value) {
            addCriterion("marker_no like", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoNotLike(String value) {
            addCriterion("marker_no not like", value, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoIn(List<String> values) {
            addCriterion("marker_no in", values, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoNotIn(List<String> values) {
            addCriterion("marker_no not in", values, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoBetween(String value1, String value2) {
            addCriterion("marker_no between", value1, value2, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerNoNotBetween(String value1, String value2) {
            addCriterion("marker_no not between", value1, value2, "markerNo");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeIsNull() {
            addCriterion("marker_type is null");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeIsNotNull() {
            addCriterion("marker_type is not null");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeEqualTo(String value) {
            addCriterion("marker_type =", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeNotEqualTo(String value) {
            addCriterion("marker_type <>", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeGreaterThan(String value) {
            addCriterion("marker_type >", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("marker_type >=", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeLessThan(String value) {
            addCriterion("marker_type <", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeLessThanOrEqualTo(String value) {
            addCriterion("marker_type <=", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeLike(String value) {
            addCriterion("marker_type like", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeNotLike(String value) {
            addCriterion("marker_type not like", value, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeIn(List<String> values) {
            addCriterion("marker_type in", values, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeNotIn(List<String> values) {
            addCriterion("marker_type not in", values, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeBetween(String value1, String value2) {
            addCriterion("marker_type between", value1, value2, "markerType");
            return (Criteria) this;
        }

        public Criteria andMarkerTypeNotBetween(String value1, String value2) {
            addCriterion("marker_type not between", value1, value2, "markerType");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(Integer value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(Integer value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(Integer value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(Integer value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(Integer value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<Integer> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<Integer> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(Integer value1, Integer value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberVipIsNull() {
            addCriterion("member_vip is null");
            return (Criteria) this;
        }

        public Criteria andMemberVipIsNotNull() {
            addCriterion("member_vip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberVipEqualTo(Integer value) {
            addCriterion("member_vip =", value, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipNotEqualTo(Integer value) {
            addCriterion("member_vip <>", value, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipGreaterThan(Integer value) {
            addCriterion("member_vip >", value, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_vip >=", value, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipLessThan(Integer value) {
            addCriterion("member_vip <", value, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipLessThanOrEqualTo(Integer value) {
            addCriterion("member_vip <=", value, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipIn(List<Integer> values) {
            addCriterion("member_vip in", values, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipNotIn(List<Integer> values) {
            addCriterion("member_vip not in", values, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipBetween(Integer value1, Integer value2) {
            addCriterion("member_vip between", value1, value2, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMemberVipNotBetween(Integer value1, Integer value2) {
            addCriterion("member_vip not between", value1, value2, "memberVip");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrIsNull() {
            addCriterion("name_en_abbr is null");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrIsNotNull() {
            addCriterion("name_en_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrEqualTo(String value) {
            addCriterion("name_en_abbr =", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrNotEqualTo(String value) {
            addCriterion("name_en_abbr <>", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrGreaterThan(String value) {
            addCriterion("name_en_abbr >", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("name_en_abbr >=", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrLessThan(String value) {
            addCriterion("name_en_abbr <", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrLessThanOrEqualTo(String value) {
            addCriterion("name_en_abbr <=", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrLike(String value) {
            addCriterion("name_en_abbr like", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrNotLike(String value) {
            addCriterion("name_en_abbr not like", value, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrIn(List<String> values) {
            addCriterion("name_en_abbr in", values, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrNotIn(List<String> values) {
            addCriterion("name_en_abbr not in", values, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrBetween(String value1, String value2) {
            addCriterion("name_en_abbr between", value1, value2, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameEnAbbrNotBetween(String value1, String value2) {
            addCriterion("name_en_abbr not between", value1, value2, "nameEnAbbr");
            return (Criteria) this;
        }

        public Criteria andNameNaIsNull() {
            addCriterion("name_na is null");
            return (Criteria) this;
        }

        public Criteria andNameNaIsNotNull() {
            addCriterion("name_na is not null");
            return (Criteria) this;
        }

        public Criteria andNameNaEqualTo(String value) {
            addCriterion("name_na =", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaNotEqualTo(String value) {
            addCriterion("name_na <>", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaGreaterThan(String value) {
            addCriterion("name_na >", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaGreaterThanOrEqualTo(String value) {
            addCriterion("name_na >=", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaLessThan(String value) {
            addCriterion("name_na <", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaLessThanOrEqualTo(String value) {
            addCriterion("name_na <=", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaLike(String value) {
            addCriterion("name_na like", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaNotLike(String value) {
            addCriterion("name_na not like", value, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaIn(List<String> values) {
            addCriterion("name_na in", values, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaNotIn(List<String> values) {
            addCriterion("name_na not in", values, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaBetween(String value1, String value2) {
            addCriterion("name_na between", value1, value2, "nameNa");
            return (Criteria) this;
        }

        public Criteria andNameNaNotBetween(String value1, String value2) {
            addCriterion("name_na not between", value1, value2, "nameNa");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(String value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(String value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(String value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(String value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(String value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(String value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLike(String value) {
            addCriterion("register_date like", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotLike(String value) {
            addCriterion("register_date not like", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<String> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<String> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(String value1, String value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(String value1, String value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNull() {
            addCriterion("registered is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNotNull() {
            addCriterion("registered is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredEqualTo(Long value) {
            addCriterion("registered =", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotEqualTo(Long value) {
            addCriterion("registered <>", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThan(Long value) {
            addCriterion("registered >", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThanOrEqualTo(Long value) {
            addCriterion("registered >=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThan(Long value) {
            addCriterion("registered <", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThanOrEqualTo(Long value) {
            addCriterion("registered <=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredIn(List<Long> values) {
            addCriterion("registered in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotIn(List<Long> values) {
            addCriterion("registered not in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredBetween(Long value1, Long value2) {
            addCriterion("registered between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotBetween(Long value1, Long value2) {
            addCriterion("registered not between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNull() {
            addCriterion("social_code is null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNotNull() {
            addCriterion("social_code is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeEqualTo(String value) {
            addCriterion("social_code =", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotEqualTo(String value) {
            addCriterion("social_code <>", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThan(String value) {
            addCriterion("social_code >", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("social_code >=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThan(String value) {
            addCriterion("social_code <", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThanOrEqualTo(String value) {
            addCriterion("social_code <=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLike(String value) {
            addCriterion("social_code like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotLike(String value) {
            addCriterion("social_code not like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIn(List<String> values) {
            addCriterion("social_code in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotIn(List<String> values) {
            addCriterion("social_code not in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeBetween(String value1, String value2) {
            addCriterion("social_code between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotBetween(String value1, String value2) {
            addCriterion("social_code not between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNull() {
            addCriterion("tax_no is null");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNotNull() {
            addCriterion("tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNoEqualTo(String value) {
            addCriterion("tax_no =", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotEqualTo(String value) {
            addCriterion("tax_no <>", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThan(String value) {
            addCriterion("tax_no >", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("tax_no >=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThan(String value) {
            addCriterion("tax_no <", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThanOrEqualTo(String value) {
            addCriterion("tax_no <=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLike(String value) {
            addCriterion("tax_no like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotLike(String value) {
            addCriterion("tax_no not like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoIn(List<String> values) {
            addCriterion("tax_no in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotIn(List<String> values) {
            addCriterion("tax_no not in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoBetween(String value1, String value2) {
            addCriterion("tax_no between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotBetween(String value1, String value2) {
            addCriterion("tax_no not between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeIsNull() {
            addCriterion("attr_unit_code is null");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeIsNotNull() {
            addCriterion("attr_unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeEqualTo(String value) {
            addCriterion("attr_unit_code =", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeNotEqualTo(String value) {
            addCriterion("attr_unit_code <>", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeGreaterThan(String value) {
            addCriterion("attr_unit_code >", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_unit_code >=", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeLessThan(String value) {
            addCriterion("attr_unit_code <", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("attr_unit_code <=", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeLike(String value) {
            addCriterion("attr_unit_code like", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeNotLike(String value) {
            addCriterion("attr_unit_code not like", value, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeIn(List<String> values) {
            addCriterion("attr_unit_code in", values, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeNotIn(List<String> values) {
            addCriterion("attr_unit_code not in", values, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeBetween(String value1, String value2) {
            addCriterion("attr_unit_code between", value1, value2, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitCodeNotBetween(String value1, String value2) {
            addCriterion("attr_unit_code not between", value1, value2, "attrUnitCode");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameIsNull() {
            addCriterion("attr_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameIsNotNull() {
            addCriterion("attr_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameEqualTo(String value) {
            addCriterion("attr_unit_name =", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameNotEqualTo(String value) {
            addCriterion("attr_unit_name <>", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameGreaterThan(String value) {
            addCriterion("attr_unit_name >", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_unit_name >=", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameLessThan(String value) {
            addCriterion("attr_unit_name <", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameLessThanOrEqualTo(String value) {
            addCriterion("attr_unit_name <=", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameLike(String value) {
            addCriterion("attr_unit_name like", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameNotLike(String value) {
            addCriterion("attr_unit_name not like", value, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameIn(List<String> values) {
            addCriterion("attr_unit_name in", values, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameNotIn(List<String> values) {
            addCriterion("attr_unit_name not in", values, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameBetween(String value1, String value2) {
            addCriterion("attr_unit_name between", value1, value2, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNameNotBetween(String value1, String value2) {
            addCriterion("attr_unit_name not between", value1, value2, "attrUnitName");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Integer value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Integer value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Integer value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Integer value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Integer> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Integer> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
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