package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserCart<M extends BaseUserCart<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setSellerId(java.lang.Long sellerId) {
		set("seller_id", sellerId);
	}
	
	public java.lang.Long getSellerId() {
		return getLong("seller_id");
	}

	public void setDistId(java.lang.Integer distId) {
		set("dist_id", distId);
	}
	
	public java.lang.Integer getDistId() {
		return getInt("dist_id");
	}

	public void setProductType(java.lang.String productType) {
		set("product_type", productType);
	}
	
	public java.lang.String getProductType() {
		return getStr("product_type");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}
	
	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

	public void setProductTitle(java.lang.String productTitle) {
		set("product_title", productTitle);
	}
	
	public java.lang.String getProductTitle() {
		return getStr("product_title");
	}

	public void setProductThumbnail(java.lang.String productThumbnail) {
		set("product_thumbnail", productThumbnail);
	}
	
	public java.lang.String getProductThumbnail() {
		return getStr("product_thumbnail");
	}

	public void setProductPrice(java.math.BigDecimal productPrice) {
		set("product_price", productPrice);
	}
	
	public java.math.BigDecimal getProductPrice() {
		return get("product_price");
	}

	public void setProductCount(java.lang.Integer productCount) {
		set("product_count", productCount);
	}
	
	public java.lang.Integer getProductCount() {
		return getInt("product_count");
	}

	public void setViewPath(java.lang.String viewPath) {
		set("view_path", viewPath);
	}
	
	public java.lang.String getViewPath() {
		return getStr("view_path");
	}

	public void setViewText(java.lang.String viewText) {
		set("view_text", viewText);
	}
	
	public java.lang.String getViewText() {
		return getStr("view_text");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

}
