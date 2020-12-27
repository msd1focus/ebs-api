package com.focus.weborder.outstdorder;

import java.math.BigDecimal;

// bug jpa sehingga susunan harus sesuai abjad
public interface OrderAggrI {
	public String getItemCode();
	public String getItemName();
	public Long getOrderQtyOuts();
	public BigDecimal getOrderValueOuts();
	public Long getQuoteQtyOuts();
	public BigDecimal getQuoteValueOuts();
	public String getUom();
//	public String getCustPo();
//	public String getOrderSource();

}
