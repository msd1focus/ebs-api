package com.focus.weborder.woprocess.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="FCS_OM_WO_ORDER_DETAIL_INFO_V2")
public class OrderDetailNonWo {

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
	private String noPo;

	private Integer custId;
	private String productCode;
	private String productName;
	private String unit;
	private Double unitPrice;
	private Integer quantity;
	private Double total;
	
	private Long coNo;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date coTgl;

	private Long coQty;
	private String coStatus;

	private Long soNo;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date soTgl;
	
	private Long soQty;
	private String soStatus;
	
	private String soDetailStatus;
	
	private String doNo;
	
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date doTgl;
    
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
	public String getNoPo() {
		return noPo;
	}
	public void setNoPo(String noPo) {
		this.noPo = noPo;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public Long getCoNo() {
		return coNo;
	}
	public void setCoNo(Long coNo) {
		this.coNo = coNo;
	}
	public Date getCoTgl() {
		return coTgl;
	}
	public void setCoTgl(Date coTgl) {
		this.coTgl = coTgl;
	}
	public Long getCoQty() {
		return coQty;
	}
	public void setCoQty(Long coQty) {
		this.coQty = coQty;
	}
	public String getCoStatus() {
		return coStatus;
	}
	public void setCoStatus(String coStatus) {
		this.coStatus = coStatus;
	}
	public Long getSoNo() {
		return soNo;
	}
	public void setSoNo(Long soNo) {
		this.soNo = soNo;
	}
	public Date getSoTgl() {
		return soTgl;
	}
	public void setSoTgl(Date soTgl) {
		this.soTgl = soTgl;
	}
	public Long getSoQty() {
		return soQty;
	}
	public void setSoQty(Long soQty) {
		this.soQty = soQty;
	}
	public String getSoStatus() {
		return soStatus;
	}
	public void setSoStatus(String soStatus) {
		this.soStatus = soStatus;
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
	public Date getDoTgl() {
		return doTgl;
	}
	public void setDoTgl(Date doTgl) {
		this.doTgl = doTgl;
	}
	public Long getDoQty() {
		return doQty;
	}
	public void setDoQty(Long doQty) {
		this.doQty = doQty;
	}
	
	

}
