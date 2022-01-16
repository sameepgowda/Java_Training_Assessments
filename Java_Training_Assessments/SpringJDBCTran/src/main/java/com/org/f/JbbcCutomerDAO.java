package com.org.f;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

public class JbbcCutomerDAO implements CustomerDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		String sql = "insert into customer(cust_id , name, age) values(?,?,?)";
		Connection con = null;
		try {
			con= dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.execute();
			ps.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public Customer findByCustomerId(int custId) {
		// TODO Auto-generated method stub
		String sql="select * from customer where cust_id= ?";
		Connection con = null;
		try {
			con= dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				customer = new Customer(rs.getInt("cust_id"),rs.getString("name"),rs.getInt("age"));
			}
			rs.close();
			ps.close();
			return customer;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

}
