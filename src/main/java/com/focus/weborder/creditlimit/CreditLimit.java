package com.focus.weborder.creditlimit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FCS_OM_WO_CREDITLIMIT_V", schema= "APPS")
public class CreditLimit {

	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="COMPANY")
	private String company;
	@Column(name="CUST_ID")
	private Long custId;
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="CUSTOMER_NUMBER")
	private String customerNumber;
	@Column(name="HEADERS")
	private String headers;
	@Column(name="OVERALL_CREDIT_LIMIT")
	private Double overallCreditLimit;
	@Column(name="SISA_AR")
	private Double sisaAr;
	@Column(name="OUTSTANDING_SO")
	private Double outstandingSo;
	@Column(name="OUTSTANDING_CO1")
	private Double outstandingCo1;
	@Column(name="OUTSTANDING_CO2")
	private Double outstandingCo2;
	@Column(name="SISA_LIMIT")
	private Double sisaLimit;
	
	public CreditLimit() {
	}
	
	public CreditLimit(
			Long id,
			String company,
			Long custId,
			String customerName,
			String customerNumber,
			String headers,
			Double overallCreditLimit,
			Double sisaAr,
			Double outstandingSo,
			Double outstandingCo1,
			Double outstandingCo2,
			Double sisaLimit) {
		super();
		this.id = id;
		this.company = company;
		this.custId = custId;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.headers = headers;
		this.overallCreditLimit = overallCreditLimit;
		this.sisaAr = sisaAr;
		this.outstandingSo = outstandingSo;
		this.outstandingCo1 = outstandingCo1;
		this.outstandingCo2 = outstandingCo2;
		this.sisaLimit = sisaLimit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getHeaders() {
		return headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public Double getOverallCreditLimit() {
		return overallCreditLimit;
	}

	public void setOverallCreditLimit(Double overallCreditLimit) {
		this.overallCreditLimit = overallCreditLimit;
	}

	public Double getSisaAr() {
		return sisaAr;
	}

	public void setSisaAr(Double sisaAr) {
		this.sisaAr = sisaAr;
	}

	public Double getOutstandingSo() {
		return outstandingSo;
	}

	public void setOutstandingSo(Double outstandingSo) {
		this.outstandingSo = outstandingSo;
	}

	public Double getOutstandingCo1() {
		return outstandingCo1;
	}

	public void setOutstandingCo1(Double outstandingCo1) {
		this.outstandingCo1 = outstandingCo1;
	}

	public Double getOutstandingCo2() {
		return outstandingCo2;
	}

	public void setOutstandingCo2(Double outstandingCo2) {
		this.outstandingCo2 = outstandingCo2;
	}

	public Double getSisaLimit() {
		return sisaLimit;
	}

	public void setSisaLimit(Double sisaLimit) {
		this.sisaLimit = sisaLimit;
	}
}
