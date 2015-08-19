package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.ProductVo;


public class DeviceMapper implements RowMapper<ProductVo> 
{
	 ProductVo proRef;
    public ProductVo mapRow(ResultSet rs, int rowNum) throws SQLException 
    {
    	proRef = new ProductVo();
     
        return proRef;
    }
}
