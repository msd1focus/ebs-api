package com.focus.weborder.woprocess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fcs_om_wo_order_detail_info")
public class OrderDetailInfo {

	@Id
	@Column(name="WO_ORDER_DETAIL_ID")
	private String orderDetailId;
	
	@Column(name="WO_ORDER_ID")
	private String orderId;
	
	@Column(name="ORDER_SOURCE")
	private String orderSource;
	@Column(name="ORDER_SOURCE_REFERENCE")
	private String orderSourceReference;
	@Column(name="ORDER_SOURCE_LINE_REFERENCE")
	private String orderSourceLineRef;		
	@Column(name="CUST_PO_NO")
	private String custPoNo;
	@Column(name="PRODUCT_CODE")
	private String productCode;
	
	private Long coNo;
	private String coTgl;
	private Long coQty;
	private String coStatus;

	@Column(name="SO_NO")
	private Long soNo;
	@Column(name="SO_TGL")
	private String soTgl;
	@Column(name="SO_QTY")
	private Long soQty;
	private String soStatus;
	
	private String soDetailStatus;
	
	@Column(name="DO_NO")
	private String doNo;
	@Column(name="DO_TGL")
	private String doTgl;
	@Column(name="DO_QTY")
	private Long doQty;
	
	public String getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getOrderSourceReference() {
		return orderSourceReference;
	}
	public void setOrderSourceReference(String orderSourceReference) {
		this.orderSourceReference = orderSourceReference;
	}
	public String getOrderSourceLineRef() {
		return orderSourceLineRef;
	}
	public void setOrderSourceLineRef(String orderSourceLineRef) {
		this.orderSourceLineRef = orderSourceLineRef;
	}
	public String getCustPoNo() {
		return custPoNo;
	}
	public void setCustPoNo(String custPoNo) {
		this.custPoNo = custPoNo;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getCoStatus() {
		return coStatus;
	}
	public void setCoStatus(String coStatus) {
		this.coStatus = coStatus;
	}
	public Long getCoNo() {
		return coNo;
	}
	public void setCoNo(Long coNo) {
		this.coNo = coNo;
	}
	public String getCoTgl() {
		return coTgl;
	}
	public void setCoTgl(String coTgl) {
		this.coTgl = coTgl;
	}
	public Long getCoQty() {
		return coQty;
	}
	public void setCoQty(Long coQty) {
		this.coQty = coQty;
	}

	public String getSoStatus() {
		return soStatus;
	}
	public void setSoStatus(String soStatus) {
		this.soStatus = soStatus;
	}
	public Long getSoNo() {
		return soNo;
	}
	
	public void setSoNo(Long soNo) {
		this.soNo = soNo;
	}
	public String getSoTgl() {
		return soTgl;
	}
	public void setSoTgl(String soTgl) {
		this.soTgl = soTgl;
	}
	public Long getSoQty() {
		return soQty;
	}
	public void setSoQty(Long soQty) {
		this.soQty = soQty;
	}
	public String getSoDetailStatus() {
		return soDetailStatus;
	}
	public void setSoDetailStatus(String soDetailStatus) {
		this.soDetailStatus = soDetailStatus;
	}
	public String getDoNo() {
		return doNo;
	}
	public void setDoNo(String doNo) {
		this.doNo = doNo;
	}
	public String getDoTgl() {
		return doTgl;
	}
	public void setDoTgl(String doTgl) {
		this.doTgl = doTgl;
	}
	public Long getDoQty() {
		return doQty;
	}
	public void setDoQty(Long doQty) {
		this.doQty = doQty;
	}

	
}
