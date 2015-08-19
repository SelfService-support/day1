package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import com.dao.Queries;
import com.bean.CustomerVo;
import com.bean.ProductVo;
public class CustomerDao 
{
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	public CustomerDao() 
	{
		System.out.println("inside customer dao");//only for debug
	
	}
	 public void createCustomer(CustomerVo custRef)
	 {
		
	       jdbcTemplateObject.update(Queries.REG_CUSTOMER,custRef.getCustomerID(),custRef.getCustomerFirstName(),custRef.getCustomerLastName(),custRef.getCustomerStatus(),custRef.getCustomerAccountNo(),custRef.getBillingAddrID(),custRef.getShippingAddrID(),custRef.getCustomerEmail(),custRef.getCustomerEffDate(),custRef.getBillCycleNo(),custRef.getBillMethodType(),custRef.getDBUserID(),custRef.getDBLastUpdated());
	       System.out.println("Created Record Name = " +custRef.getCustomerID());//only for debug
	       
     }
	 public List<CustomerVo> listOfCustomer() 
	 {
	        List<CustomerVo> customer = jdbcTemplateObject.query(Queries.ALL_CUSTOMER, new CustomerMapper());
	        return customer;
	 } 
	 public List<ProductVo> customerDeviceMap() 
	 {
	        
	        List<ProductVo> devices = jdbcTemplateObject.query(Queries.CUSTOMER_DEVICES, new DeviceMapper());
	        return devices;
	 } 
	
}
