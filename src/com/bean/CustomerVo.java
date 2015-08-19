package com.bean;

public class CustomerVo 
{
private int customerID;//primary key for CustomerVo
private String customerFirstName;
private String customerLastName;
private String customerStatus;
private String customerAccountNo;
private int billingAddrID;//foreign key from AddressVo
private int shippingAddrID; //foreign key from AddressVo
private String customerEmail;
private java.util.Date customerEffDate;
private java.util.Date customerEndDate;
private int billCycleNo;
private String billMethodType;
private String DBUserID;
private java.util.Date DBLastUpdated;
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustomerFirstName() {
	return customerFirstName;
}
public void setCustomerFirstName(String customerFirstName) {
	this.customerFirstName = customerFirstName;
}
public String getCustomerLastName() {
	return customerLastName;
}
public void setCustomerLastName(String customerLastName) {
	this.customerLastName = customerLastName;
}
public String getCustomerStatus() {
	return customerStatus;
}
public void setCustomerStatus(String customerStatus) {
	this.customerStatus = customerStatus;
}
public String getCustomerAccountNo() {
	return customerAccountNo;
}
public void setCustomerAccountNo(String customerAccountNo) {
	this.customerAccountNo = customerAccountNo;
}
public int getBillingAddrID() {
	return billingAddrID;
}
public void setBillingAddrID(int billingAddrID) {
	this.billingAddrID = billingAddrID;
}
public int getShippingAddrID() {
	return shippingAddrID;
}
public void setShippingAddrID(int shippingAddrID) {
	this.shippingAddrID = shippingAddrID;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public java.util.Date getCustomerEffDate() {
	return customerEffDate;
}
public void setCustomerEffDate(java.util.Date customerEffDate) {
	this.customerEffDate = customerEffDate;
}
public java.util.Date getCustomerEndDate() {
	return customerEndDate;
}
public void setCustomerEndDate(java.util.Date customerEndDate) {
	this.customerEndDate = customerEndDate;
}
public int getBillCycleNo() {
	return billCycleNo;
}
public void setBillCycleNo(int billCycleNo) {
	this.billCycleNo = billCycleNo;
}
public String getBillMethodType() {
	return billMethodType;
}
public void setBillMethodType(String billMethodType) {
	this.billMethodType = billMethodType;
}
public String getDBUserID() {
	return DBUserID;
}
public void setDBUserID(String dBUserID) {
	DBUserID = dBUserID;
}
public java.util.Date getDBLastUpdated() {
	return DBLastUpdated;
}
public void setDBLastUpdated(java.util.Date dBLastUpdated) {
	DBLastUpdated = dBLastUpdated;
}

}
