package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCoupon<M extends BaseCoupon<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}
	
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setWithSpecial(java.lang.Boolean withSpecial) {
		set("with_special", withSpecial);
	}
	
	public java.lang.Boolean getWithSpecial() {
		return get("with_special");
	}

	public void setWithAmount(java.math.BigDecimal withAmount) {
		set("with_amount", withAmount);
	}
	
	public java.math.BigDecimal getWithAmount() {
		return get("with_amount");
	}

	public void setWithMember(java.lang.Boolean withMember) {
		set("with_member", withMember);
	}
	
	public java.lang.Boolean getWithMember() {
		return get("with_member");
	}

	public void setWithAward(java.lang.Boolean withAward) {
		set("with_award", withAward);
	}
	
	public java.lang.Boolean getWithAward() {
		return get("with_award");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}
	
	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setAwardAmount(java.math.BigDecimal awardAmount) {
		set("award_amount", awardAmount);
	}
	
	public java.math.BigDecimal getAwardAmount() {
		return get("award_amount");
	}

	public void setQuota(java.lang.Long quota) {
		set("quota", quota);
	}
	
	public java.lang.Long getQuota() {
		return getLong("quota");
	}

	public void setTakeCount(java.lang.Long takeCount) {
		set("take_count", takeCount);
	}
	
	public java.lang.Long getTakeCount() {
		return getLong("take_count");
	}

	public void setUsedCount(java.lang.Long usedCount) {
		set("used_count", usedCount);
	}
	
	public java.lang.Long getUsedCount() {
		return getLong("used_count");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}
	
	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}
	
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setValidType(java.lang.Integer validType) {
		set("valid_type", validType);
	}
	
	public java.lang.Integer getValidType() {
		return getInt("valid_type");
	}

	public void setValidStartTime(java.util.Date validStartTime) {
		set("valid_start_time", validStartTime);
	}
	
	public java.util.Date getValidStartTime() {
		return get("valid_start_time");
	}

	public void setValidEndTime(java.util.Date validEndTime) {
		set("valid_end_time", validEndTime);
	}
	
	public java.util.Date getValidEndTime() {
		return get("valid_end_time");
	}

	public void setValidDays(java.lang.Integer validDays) {
		set("valid_days", validDays);
	}
	
	public java.lang.Integer getValidDays() {
		return getInt("valid_days");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCreateUserId(java.lang.Long createUserId) {
		set("create_user_id", createUserId);
	}
	
	public java.lang.Long getCreateUserId() {
		return getLong("create_user_id");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

}
