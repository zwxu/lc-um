package com.zwxu.lc.um.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public RoleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andRoleCodeIsNull() {
			addCriterion("role_code is null");
			return (Criteria) this;
		}

		public Criteria andRoleCodeIsNotNull() {
			addCriterion("role_code is not null");
			return (Criteria) this;
		}

		public Criteria andRoleCodeEqualTo(String value) {
			addCriterion("role_code =", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeNotEqualTo(String value) {
			addCriterion("role_code <>", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeGreaterThan(String value) {
			addCriterion("role_code >", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
			addCriterion("role_code >=", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeLessThan(String value) {
			addCriterion("role_code <", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeLessThanOrEqualTo(String value) {
			addCriterion("role_code <=", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeLike(String value) {
			addCriterion("role_code like", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeNotLike(String value) {
			addCriterion("role_code not like", value, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeIn(List<String> values) {
			addCriterion("role_code in", values, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeNotIn(List<String> values) {
			addCriterion("role_code not in", values, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeBetween(String value1, String value2) {
			addCriterion("role_code between", value1, value2, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleCodeNotBetween(String value1, String value2) {
			addCriterion("role_code not between", value1, value2, "roleCode");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNull() {
			addCriterion("role_name is null");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNotNull() {
			addCriterion("role_name is not null");
			return (Criteria) this;
		}

		public Criteria andRoleNameEqualTo(String value) {
			addCriterion("role_name =", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotEqualTo(String value) {
			addCriterion("role_name <>", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThan(String value) {
			addCriterion("role_name >", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
			addCriterion("role_name >=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThan(String value) {
			addCriterion("role_name <", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThanOrEqualTo(String value) {
			addCriterion("role_name <=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLike(String value) {
			addCriterion("role_name like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotLike(String value) {
			addCriterion("role_name not like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameIn(List<String> values) {
			addCriterion("role_name in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotIn(List<String> values) {
			addCriterion("role_name not in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameBetween(String value1, String value2) {
			addCriterion("role_name between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotBetween(String value1, String value2) {
			addCriterion("role_name not between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedIsNull() {
			addCriterion("gmt_created is null");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedIsNotNull() {
			addCriterion("gmt_created is not null");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedEqualTo(Date value) {
			addCriterion("gmt_created =", value, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedNotEqualTo(Date value) {
			addCriterion("gmt_created <>", value, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedGreaterThan(Date value) {
			addCriterion("gmt_created >", value, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
			addCriterion("gmt_created >=", value, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedLessThan(Date value) {
			addCriterion("gmt_created <", value, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
			addCriterion("gmt_created <=", value, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedIn(List<Date> values) {
			addCriterion("gmt_created in", values, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedNotIn(List<Date> values) {
			addCriterion("gmt_created not in", values, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedBetween(Date value1, Date value2) {
			addCriterion("gmt_created between", value1, value2, "gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
			addCriterion("gmt_created not between", value1, value2,
					"gmtCreated");
			return (Criteria) this;
		}

		public Criteria andGmtModifyIsNull() {
			addCriterion("gmt_modify is null");
			return (Criteria) this;
		}

		public Criteria andGmtModifyIsNotNull() {
			addCriterion("gmt_modify is not null");
			return (Criteria) this;
		}

		public Criteria andGmtModifyEqualTo(Date value) {
			addCriterion("gmt_modify =", value, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyNotEqualTo(Date value) {
			addCriterion("gmt_modify <>", value, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyGreaterThan(Date value) {
			addCriterion("gmt_modify >", value, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
			addCriterion("gmt_modify >=", value, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyLessThan(Date value) {
			addCriterion("gmt_modify <", value, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
			addCriterion("gmt_modify <=", value, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyIn(List<Date> values) {
			addCriterion("gmt_modify in", values, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyNotIn(List<Date> values) {
			addCriterion("gmt_modify not in", values, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyBetween(Date value1, Date value2) {
			addCriterion("gmt_modify between", value1, value2, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
			addCriterion("gmt_modify not between", value1, value2, "gmtModify");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagIsNull() {
			addCriterion("delete_flag is null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagIsNotNull() {
			addCriterion("delete_flag is not null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagEqualTo(String value) {
			addCriterion("delete_flag =", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagNotEqualTo(String value) {
			addCriterion("delete_flag <>", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagGreaterThan(String value) {
			addCriterion("delete_flag >", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
			addCriterion("delete_flag >=", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagLessThan(String value) {
			addCriterion("delete_flag <", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
			addCriterion("delete_flag <=", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagLike(String value) {
			addCriterion("delete_flag like", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagNotLike(String value) {
			addCriterion("delete_flag not like", value, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagIn(List<String> values) {
			addCriterion("delete_flag in", values, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagNotIn(List<String> values) {
			addCriterion("delete_flag not in", values, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagBetween(String value1, String value2) {
			addCriterion("delete_flag between", value1, value2, "deleteFlag");
			return (Criteria) this;
		}

		public Criteria andDeleteFlagNotBetween(String value1, String value2) {
			addCriterion("delete_flag not between", value1, value2,
					"deleteFlag");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_role
	 * @mbggenerated  Tue Jan 10 13:17:24 CST 2017
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_role
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 28 10:44:39 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}