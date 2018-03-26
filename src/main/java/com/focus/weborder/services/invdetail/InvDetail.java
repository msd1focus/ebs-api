package com.focus.weborder.services.invdetail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FCS_OM_WO_INV_V", schema= "APPS")
public class InvDetail {

	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="JUDUL")
	private String judul;
	@Column(name="COMP_NAME")
	private String compName;
	@Column(name="CUST_ACCOUNT_ID")
	private Long custAccountId;
	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	@Column(name="CUSTOMER_TRX_ID")
	private Long customerTrxId;
	@Column(name="CUSTOMER_TRX_LINE_ID")
	private Long customerTrxLineId;
	@Column(name="TRX_NUMBER")
	private String trxNumber;
	@Column(name="TRX_DATE")
	private String trxDate;
	@Column(name="ORDER_NUMBER")
	private Long orderNumber;
	@Column(name="ORDER_DATE")
	private String orderDate;
	@Column(name="CUST_PO_NUMBER")
	private String custPoNumber;
	@Column(name="REQUEST_DATE")
	private String requestDate;
	@Column(name="PAYMENT_TERM")
	private String paymentTerm;
	@Column(name="DUE_DATE")
	private String dueDate;
	@Column(name="LINE_NUMBER")
	private Long lineNumber;
	@Column(name="INVENTORY_ITEM_ID")
	private Long inventoryItemId;
	@Column(name="ITEM_CODE")
	private String itemCode;
	@Column(name="ITEM_DESC")
	private String itemDesc;
	@Column(name="QUANTITY_INVOICED")
	private Long quantityInvoiced;
	@Column(name="UOM_CODE")
	private String uomCode;
	@Column(name="INVOICE_CURRENCY_CODE")
	private String invoiceCurrencyCode;
	@Column(name="UNIT_SELLING_PRICE")
	private Double unitSellingPrice;
	@Column(name="DISKON1")
	private Double diskon1;
	@Column(name="DISKON2")
	private Double diskon2;
	@Column(name="TOTAL")
	private Double total;
	@Column(name="DOWN_PAYMENT")
	private Double downPayment;
	@Column(name="DISKON4")
	private Double diskon4;
	@Column(name="DISKON3")
	private Double diskon3;
	@Column(name="DISKON5")
	private Double diskon5;
	@Column(name="EXT_AMOUNT_TAX")
	private Double extAmountTax;
	@Column(name="DISKON6")
	private Double diskon6;
	@Column(name="DISKON7")
	private Double diskon7;
	@Column(name="AR_NOTE")
	private String arNote;
	@Column(name="VAT")
	private Double vat;
	@Column(name="SALES_ORDER_LINE")
	private String salesOrderLine;
	@Column(name="BILL_TO_CUSTOMER_ID")
	private Long billToCustomerId;
	@Column(name="TAX_CLASSIFICATION_CODE")
	private String taxClassificationCode;
	@Column(name="ATTRIBUTE5")
	private String attribute5;
	
	public InvDetail() {
		
	}
	
	public InvDetail(
			Long id,
			String judul,
			String compName,
			Long custAccountId,
			String accountNumber,
			String accountName,
			Long customerTrxId,
			Long customerTrxLineId,
			String trxNumber,
			String trxDate,
			Long orderNumber,
			String orderDate,
			String custPoNumber,
			String requestDate,
			String paymentTerm,
			String dueDate,
			Long lineNumber,
			Long inventoryItemId,
			String itemCode,
			String itemDesc,
			Long quantityInvoiced,
			String uomCode,
			String invoiceCurrencyCode,
			Double unitSellingPrice,
			Double diskon1,
			Double diskon2,
			Double total,
			Double downPayment,
			Double diskon4,
			Double diskon3,
			Double diskon5,
			Double extAmountTax,
			Double diskon6,
			Double diskon7,
			String arNote,
			Double vat,
			String salesOrderLine,
			Long billToCustomerId,
			String taxClassificationCode,
			String attribute5) {
		super();
		this.id = id;
		this.judul = judul;
		this.compName = compName;
		this.custAccountId = custAccountId;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.customerTrxId = customerTrxId;
		this.customerTrxLineId = customerTrxLineId;
		this.trxNumber = trxNumber;
		this.trxDate = trxDate;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.custPoNumber = custPoNumber;
		this.requestDate = requestDate;
		this.paymentTerm = paymentTerm;
		this.dueDate = dueDate;
		this.lineNumber = lineNumber;
		this.inventoryItemId = inventoryItemId;
		this.itemCode = itemCode;
		this.itemDesc = itemDesc;
		this.quantityInvoiced = quantityInvoiced;
		this.uomCode = uomCode;
		this.invoiceCurrencyCode = invoiceCurrencyCode;
		this.unitSellingPrice = unitSellingPrice;
		this.diskon1 = diskon1;
		this.diskon2 = diskon2;
		this.total = total;
		this.downPayment = downPayment;
		this.diskon4 = diskon4;
		this.diskon3 = diskon3;
		this.diskon5 = diskon5;
		this.extAmountTax = extAmountTax;
		this.diskon6 = diskon6;
		this.diskon7 = diskon7;
		this.arNote = arNote;
		this.vat = vat;
		this.salesOrderLine = salesOrderLine;
		this.billToCustomerId = billToCustomerId;
		this.taxClassificationCode = taxClassificationCode;
		this.attribute5 = attribute5;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Long getCustAccountId() {
		return custAccountId;
	}

	public void setCustAccountId(Long custAccountId) {
		this.custAccountId = custAccountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getCustomerTrxId() {
		return customerTrxId;
	}

	public void setCustomerTrxId(Long customerTrxId) {
		this.customerTrxId = customerTrxId;
	}

	public Long getCustomerTrxLineId() {
		return customerTrxLineId;
	}

	public void setCustomerTrxLineId(Long customerTrxLineId) {
		this.customerTrxLineId = customerTrxLineId;
	}

	public String getTrxNumber() {
		return trxNumber;
	}

	public void setTrxNumber(String trxNumber) {
		this.trxNumber = trxNumber;
	}

	public String getTrxDate() {
		return trxDate;
	}

	public void setTrxDate(String trxDate) {
		this.trxDate = trxDate;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustPoNumber() {
		return custPoNumber;
	}

	public void setCustPoNumber(String custPoNumber) {
		this.custPoNumber = custPoNumber;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Long getQuantityInvoiced() {
		return quantityInvoiced;
	}

	public void setQuantityInvoiced(Long quantityInvoiced) {
		this.quantityInvoiced = quantityInvoiced;
	}

	public String getUomCode() {
		return uomCode;
	}

	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}

	public String getInvoiceCurrencyCode() {
		return invoiceCurrencyCode;
	}

	public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
		this.invoiceCurrencyCode = invoiceCurrencyCode;
	}

	public Double getUnitSellingPrice() {
		return unitSellingPrice;
	}

	public void setUnitSellingPrice(Double unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}

	public Double getDiskon1() {
		return diskon1;
	}

	public void setDiskon1(Double diskon1) {
		this.diskon1 = diskon1;
	}

	public Double getDiskon2() {
		return diskon2;
	}

	public void setDiskon2(Double diskon2) {
		this.diskon2 = diskon2;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(Double downPayment) {
		this.downPayment = downPayment;
	}

	public Double getDiskon4() {
		return diskon4;
	}

	public void setDiskon4(Double diskon4) {
		this.diskon4 = diskon4;
	}

	public Double getDiskon3() {
		return diskon3;
	}

	public void setDiskon3(Double diskon3) {
		this.diskon3 = diskon3;
	}

	public Double getDiskon5() {
		return diskon5;
	}

	public void setDiskon5(Double diskon5) {
		this.diskon5 = diskon5;
	}

	public Double getExtAmountTax() {
		return extAmountTax;
	}

	public void setExtAmountTax(Double extAmountTax) {
		this.extAmountTax = extAmountTax;
	}

	public Double getDiskon6() {
		return diskon6;
	}

	public void setDiskon6(Double diskon6) {
		this.diskon6 = diskon6;
	}

	public Double getDiskon7() {
		return diskon7;
	}

	public void setDiskon7(Double diskon7) {
		this.diskon7 = diskon7;
	}

	public String getArNote() {
		return arNote;
	}

	public void setArNote(String arNote) {
		this.arNote = arNote;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public String getSalesOrderLine() {
		return salesOrderLine;
	}

	public void setSalesOrderLine(String salesOrderLine) {
		this.salesOrderLine = salesOrderLine;
	}

	public Long getBillToCustomerId() {
		return billToCustomerId;
	}

	public void setBillToCustomerId(Long billToCustomerId) {
		this.billToCustomerId = billToCustomerId;
	}

	public String getTaxClassificationCode() {
		return taxClassificationCode;
	}

	public void setTaxClassificationCode(String taxClassificationCode) {
		this.taxClassificationCode = taxClassificationCode;
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}
}
