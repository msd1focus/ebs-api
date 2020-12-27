package com.focus.weborder.outstdorder;

import java.math.BigDecimal;

public interface OrderDtlI {
	public String getCustPo();
	public String getItemCode();
	public String getItemName();
	public Long getOrderQtyOuts();
	public String getOrderSource();
	public BigDecimal getOrderValueOuts();
	public Long getQuoteQtyOuts();
	public BigDecimal getQuoteValueOuts();
	public String getUom();

}
