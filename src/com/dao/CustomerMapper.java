package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.CustomerVo;


public class CustomerMapper implements RowMapper<CustomerVo> 
{

    public CustomerVo mapRow(ResultSet rs, int rowNum) throws SQLException 
    {
        CustomerVo custRef = new CustomerVo();
        return custRef;
    }
}
