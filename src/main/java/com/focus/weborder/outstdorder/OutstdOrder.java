package com.focus.weborder.outstdorder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="FMV_OM_OO")
public class OutstdOrder {

	@Id
	private Long	orderId;
	private String orderType;
	private String orderSource;
	@Column(name="ORDER#")
	private Long	orderNo;
	private Date orderDate;
	private Date priceDate;
	private Date requestDate;
	private String shippingDate;
	@Column(name="REF_ORDER#")
	private Long	refOrderNo;
	@Column(name="QUOTE#")
	private Long	quoteNo;
	private Date quoteDate;
	private String orderNote;
	@Column(name="CUSTPO#")
	private String custpoNo;
	@Column(name="ORDER#_PRINCIPAL")
	private String orderNoPrincipal;
	private Long	custId;
	private String shiptoCode;
	private String shiptoName;
	private String billtoCode;
	private String billtoName;
	private String top;
	private String wh;
	private Long	lineId;
	@Column(name="LINE#")
	private Long	lineNo;
	private Long	refLineId;
	private Long	itemId;
	private String itemCode;
	private String itemName;
	private Long	orderQty;
	private Long	shippedQty;
	private Long	orderQtyCancel;
	private String orderQtyUom;
	private BigDecimal orderSellingPrice;
	private String orderTaxCode;
	private BigDecimal orderTaxRate;
	private BigDecimal unitPriceNetExcppn;
	private BigDecimal orderTotalExcppn;
	private BigDecimal orderDiscExcppn;
	private BigDecimal orderTax;
	private String flagCalculateprice;
	private String orderStatus;
	private String flagAppvlimit;
	private String appvlimitBy;
	private BigDecimal orderTotalnetExcppn;
	private BigDecimal orderTotalnetIncppn;
	private String flagOuts;
	private Long outsQty;
	private BigDecimal	outsValueExcppn;
	private BigDecimal	outsValueIncppn;
	private String custCode;
	private String custName;
	private String custRegionCode;
	private String custRegionDesc;
	private String custAreaCode;
	private String custAreaDesc;
	private String custLocationCode;
	private String custLocationDesc;
	private String custGroupCode;
	private String custGroupDesc;
	private String custChannelCode;
	private String custChannelDesc;
	private String custType;
	private String prodCategoryDesc;
	private String prodClassDesc;
	private String prodBrandDesc;
	private String prodExtentionDesc;
	private String prodPackagingDesc;
	private String prodVariantDesc;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getPriceDate() {
		return priceDate;
	}
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Long getRefOrderNo() {
		return refOrderNo;
	}
	public void setRefOrderNo(Long refOrderNo) {
		this.refOrderNo = refOrderNo;
	}
	public Long getQuoteNo() {
		return quoteNo;
	}
	public void setQuoteNo(Long quoteNo) {
		this.quoteNo = quoteNo;
	}
	public Date getQuoteDate() {
		return quoteDate;
	}
	public void setQuoteDate(Date quoteDate) {
		this.quoteDate = quoteDate;
	}
	public String getOrderNote() {
		return orderNote;
	}
	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}
	public String getCustpoNo() {
		return custpoNo;
	}
	public void setCustpoNo(String custpoNo) {
		this.custpoNo = custpoNo;
	}
	public String getOrderNoPrincipal() {
		return orderNoPrincipal;
	}
	public void setOrderNoPrincipal(String orderNoPrincipal) {
		this.orderNoPrincipal = orderNoPrincipal;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getShiptoCode() {
		return shiptoCode;
	}
	public void setShiptoCode(String shiptoCode) {
		this.shiptoCode = shiptoCode;
	}
	public String getShiptoName() {
		return shiptoName;
	}
	public void setShiptoName(String shiptoName) {
		this.shiptoName = shiptoName;
	}
	public String getBilltoCode() {
		return billtoCode;
	}
	public void setBilltoCode(String billtoCode) {
		this.billtoCode = billtoCode;
	}
	public String getBilltoName() {
		return billtoName;
	}
	public void setBilltoName(String billtoName) {
		this.billtoName = billtoName;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getWh() {
		return wh;
	}
	public void setWh(String wh) {
		this.wh = wh;
	}
	public Long getLineId() {
		return lineId;
	}
	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}
	public Long getLineNo() {
		return lineNo;
	}
	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
	}
	public Long getRefLineId() {
		return refLineId;
	}
	public void setRefLineId(Long refLineId) {
		this.refLineId = refLineId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(Long orderQty) {
		this.orderQty = orderQty;
	}
	public Long getShippedQty() {
		return shippedQty;
	}
	public void setShippedQty(Long shippedQty) {
		this.shippedQty = shippedQty;
	}
	public Long getOrderQtyCancel() {
		return orderQtyCancel;
	}
	public void setOrderQtyCancel(Long orderQtyCancel) {
		this.orderQtyCancel = orderQtyCancel;
	}
	public String getOrderQtyUom() {
		return orderQtyUom;
	}
	public void setOrderQtyUom(String orderQtyUom) {
		this.orderQtyUom = orderQtyUom;
	}
	public BigDecimal getOrderSellingPrice() {
		return orderSellingPrice;
	}
	public void setOrderSellingPrice(BigDecimal orderSellingPrice) {
		this.orderSellingPrice = orderSellingPrice;
	}
	public String getOrderTaxCode() {
		return orderTaxCode;
	}
	public void setOrderTaxCode(String orderTaxCode) {
		this.orderTaxCode = orderTaxCode;
	}
	public BigDecimal getOrderTaxRate() {
		return orderTaxRate;
	}
	public void setOrderTaxRate(BigDecimal orderTaxRate) {
		this.orderTaxRate = orderTaxRate;
	}
	public BigDecimal getUnitPriceNetExcppn() {
		return unitPriceNetExcppn;
	}
	public void setUnitPriceNetExcppn(BigDecimal unitPriceNetExcppn) {
		this.unitPriceNetExcppn = unitPriceNetExcppn;
	}
	public BigDecimal getOrderTotalExcppn() {
		return orderTotalExcppn;
	}
	public void setOrderTotalExcppn(BigDecimal orderTotalExcppn) {
		this.orderTotalExcppn = orderTotalExcppn;
	}
	public BigDecimal getOrderDiscExcppn() {
		return orderDiscExcppn;
	}
	public void setOrderDiscExcppn(BigDecimal orderDiscExcppn) {
		this.orderDiscExcppn = orderDiscExcppn;
	}
	public BigDecimal getOrderTax() {
		return orderTax;
	}
	public void setOrderTax(BigDecimal orderTax) {
		this.orderTax = orderTax;
	}
	public String getFlagCalculateprice() {
		return flagCalculateprice;
	}
	public void setFlagCalculateprice(String flagCalculateprice) {
		this.flagCalculateprice = flagCalculateprice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getFlagAppvlimit() {
		return flagAppvlimit;
	}
	public void setFlagAppvlimit(String flagAppvlimit) {
		this.flagAppvlimit = flagAppvlimit;
	}
	public String getAppvlimitBy() {
		return appvlimitBy;
	}
	public void setAppvlimitBy(String appvlimitBy) {
		this.appvlimitBy = appvlimitBy;
	}
	public BigDecimal getOrderTotalnetExcppn() {
		return orderTotalnetExcppn;
	}
	public void setOrderTotalnetExcppn(BigDecimal orderTotalnetExcppn) {
		this.orderTotalnetExcppn = orderTotalnetExcppn;
	}
	public BigDecimal getOrderTotalnetIncppn() {
		return orderTotalnetIncppn;
	}
	public void setOrderTotalnetIncppn(BigDecimal orderTotalnetIncppn) {
		this.orderTotalnetIncppn = orderTotalnetIncppn;
	}
	public String getFlagOuts() {
		return flagOuts;
	}
	public void setFlagOuts(String flagOuts) {
		this.flagOuts = flagOuts;
	}
	public Long getOutsQty() {
		return outsQty;
	}
	public void setOutsQty(Long outsQty) {
		this.outsQty = outsQty;
	}
	public BigDecimal getOutsValueExcppn() {
		return outsValueExcppn;
	}
	public void setOutsValueExcppn(BigDecimal outsValueExcppn) {
		this.outsValueExcppn = outsValueExcppn;
	}
	public BigDecimal getOutsValueIncppn() {
		return outsValueIncppn;
	}
	public void setOutsValueIncppn(BigDecimal outsValueIncppn) {
		this.outsValueIncppn = outsValueIncppn;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustRegionCode() {
		return custRegionCode;
	}
	public void setCustRegionCode(String custRegionCode) {
		this.custRegionCode = custRegionCode;
	}
	public String getCustRegionDesc() {
		return custRegionDesc;
	}
	public void setCustRegionDesc(String custRegionDesc) {
		this.custRegionDesc = custRegionDesc;
	}
	public String getCustAreaCode() {
		return custAreaCode;
	}
	public void setCustAreaCode(String custAreaCode) {
		this.custAreaCode = custAreaCode;
	}
	public String getCustAreaDesc() {
		return custAreaDesc;
	}
	public void setCustAreaDesc(String custAreaDesc) {
		this.custAreaDesc = custAreaDesc;
	}
	public String getCustLocationCode() {
		return custLocationCode;
	}
	public void setCustLocationCode(String custLocationCode) {
		this.custLocationCode = custLocationCode;
	}
	public String getCustLocationDesc() {
		return custLocationDesc;
	}
	public void setCustLocationDesc(String custLocationDesc) {
		this.custLocationDesc = custLocationDesc;
	}
	public String getCustGroupCode() {
		return custGroupCode;
	}
	public void setCustGroupCode(String custGroupCode) {
		this.custGroupCode = custGroupCode;
	}
	public String getCustGroupDesc() {
		return custGroupDesc;
	}
	public void setCustGroupDesc(String custGroupDesc) {
		this.custGroupDesc = custGroupDesc;
	}
	public String getCustChannelCode() {
		return custChannelCode;
	}
	public void setCustChannelCode(String custChannelCode) {
		this.custChannelCode = custChannelCode;
	}
	public String getCustChannelDesc() {
		return custChannelDesc;
	}
	public void setCustChannelDesc(String custChannelDesc) {
		this.custChannelDesc = custChannelDesc;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getProdCategoryDesc() {
		return prodCategoryDesc;
	}
	public void setProdCategoryDesc(String prodCategoryDesc) {
		this.prodCategoryDesc = prodCategoryDesc;
	}
	public String getProdClassDesc() {
		return prodClassDesc;
	}
	public void setProdClassDesc(String prodClassDesc) {
		this.prodClassDesc = prodClassDesc;
	}
	public String getProdBrandDesc() {
		return prodBrandDesc;
	}
	public void setProdBrandDesc(String prodBrandDesc) {
		this.prodBrandDesc = prodBrandDesc;
	}
	public String getProdExtentionDesc() {
		return prodExtentionDesc;
	}
	public void setProdExtentionDesc(String prodExtentionDesc) {
		this.prodExtentionDesc = prodExtentionDesc;
	}
	public String getProdPackagingDesc() {
		return prodPackagingDesc;
	}
	public void setProdPackagingDesc(String prodPackagingDesc) {
		this.prodPackagingDesc = prodPackagingDesc;
	}
	public String getProdVariantDesc() {
		return prodVariantDesc;
	}
	public void setProdVariantDesc(String prodVariantDesc) {
		this.prodVariantDesc = prodVariantDesc;
	}

	
	
}
