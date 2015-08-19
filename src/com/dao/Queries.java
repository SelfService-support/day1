package com.dao;

public interface Queries 
{
	String REG_CUSTOMER = "insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String ALL_CUSTOMER = "select * from Customer";
	String CUSTOMER_DEVICES = "select productID from Product,productCustomerMap customer where customer.custid=ProductCustomerMap.custid and customer.custid='asx'";
}
