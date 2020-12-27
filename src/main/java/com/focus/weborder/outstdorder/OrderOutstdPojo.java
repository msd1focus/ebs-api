package com.focus.weborder.outstdorder;

import java.math.BigDecimal;

public class OrderOutstdPojo {

	private String itemCode;
	private String itemName;
	private String uom;
	private Long quoteQtyOuts;
	private BigDecimal quoteValueOuts;
	private Long orderQtyOuts;
	private BigDecimal orderValueOuts;
	private Long totalQtyOuts;
	private String custPo;
	
	public OrderOutstdPojo () {}
	
	
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
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public Long getQuoteQtyOuts() {
		return quoteQtyOuts;
	}
	public void setQuoteQtyOuts(Long quoteQtyOuts) {
		this.quoteQtyOuts = quoteQtyOuts;
	}
	public BigDecimal getQuoteValueOuts() {
		return quoteValueOuts;
	}
	public void setQuoteValueOuts(BigDecimal quoteValueOuts) {
		this.quoteValueOuts = quoteValueOuts;
	}
	public Long getOrderQtyOuts() {
		return orderQtyOuts;
	}
	public void setOrderQtyOuts(Long orderQtyOuts) {
		this.orderQtyOuts = orderQtyOuts;
	}
	public BigDecimal getOrderValueOuts() {
		return orderValueOuts;
	}
	public void setOrderValueOuts(BigDecimal orderValueOuts) {
		this.orderValueOuts = orderValueOuts;
	}
	public Long getTotalQtyOuts() {
		return totalQtyOuts;
	}
	public void setTotalQtyOuts(Long totalQtyOuts) {
		this.totalQtyOuts = totalQtyOuts;
	}


	public String getCustPo() {
		return custPo;
	}


	public void setCustPo(String custPo) {
		this.custPo = custPo;
	}


}
