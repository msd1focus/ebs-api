package fokus.wo.api.invdetailnonwo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FCS_OM_NONWO_INV_V", schema= "APPS")
public class InvDetailNonWO {

	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="COMPANY")
	private String company;
	@Column(name="TITLE")
	private String title;
	@Column(name="CUST_ID")
	private Long custId;
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name="CUSTOMER_TRX_ID")
	private Long customerTrxId;
	@Column(name="TRX_NUMBER")
	private String trxNumber;
	@Column(name="TRX_DATE")
	private Date trxDate;
	
	public InvDetailNonWO() {
		
	}
	
	public InvDetailNonWO(
			Long id,
			String company,
			String title,
			Long custId,
			String accountName,
			String accountNumber,
			Long customerTrxId,
			String trxNumber,
			Date trxDate
			) {
		super();
		this.id = id;
		this.company = company;
		this.title = title;
		this.custId = custId;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.customerTrxId = customerTrxId;
		this.trxNumber = trxNumber;
		this.trxDate = trxDate;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getCustomerTrxId() {
		return customerTrxId;
	}

	public void setCustomerTrxId(Long customerTrxId) {
		this.customerTrxId = customerTrxId;
	}

	public String getTrxNumber() {
		return trxNumber;
	}

	public void setTrxNumber(String trxNumber) {
		this.trxNumber = trxNumber;
	}

	public Date getTrxDate() {
		return trxDate;
	}

	public void setTrxDate(Date trxDate) {
		this.trxDate = trxDate;
	}
}
