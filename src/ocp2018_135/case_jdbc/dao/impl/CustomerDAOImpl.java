/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.case_jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import ocp2018_135.case_jdbc.beans.Customer;
import ocp2018_135.case_jdbc.dao.CustomerDAO;

/**
 * <pre>
 * [實作 CustomerDAO] 2020-02-19 14:54
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class CustomerDAOImpl implements CustomerDAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public void create(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
