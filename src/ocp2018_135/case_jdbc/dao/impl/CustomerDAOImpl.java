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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ocp2018_135.case_jdbc.beans.Customer;
import ocp2018_135.case_jdbc.dao.CustomerDAO;
import ocp2018_135.case_jdbc.db.DatabaseManager;
import ocp2018_135.case_jdbc.utils.BeanUtils;

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

		// 連接資料庫
		try {
			// 建構 Driver 並取得連結
			conn = DatabaseManager.getInstance().getConnection();

			// 建立資料
			String sql = "INSERT INTO customers(id, code, name, phone, address, relationman, remark) "
					+ "VALUES(default, ?, ?, ?, ?, ?, ?);";

			// prepare execute SQL
			ps = conn.prepareStatement(sql);
			System.out.println(">>> create SQL: " + ps);

			// set data to SQL
			ps.setString(1, customer.getCode());
			ps.setString(2, customer.getName());
			ps.setString(3, customer.getPhone());
			ps.setString(4, customer.getAddress());
			ps.setString(5, customer.getRelationman());
			ps.setString(6, customer.getRemark());

			// 執行 SQL
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 無論如何都會執行, 所以在這裡關掉 ps, conn
			try {
				DatabaseManager.getInstance().close(ps);
				DatabaseManager.getInstance().close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List<Customer> query() {
		List<Customer> list = new ArrayList<>();
		try {
			conn = DatabaseManager.getInstance().getConnection();

			String sql = "SELECT * FROM customers;";
			ps = conn.prepareStatement(sql);
			System.out.println(">>> query SQL: " + ps);
			rs = ps.executeQuery();

			// 將 resultSet 的資料轉成 Bean
			List retultList = resultToList(rs);
			// System.out.println(retultList);
			for (int i = 0; i < retultList.size(); i++) {
				Customer customer = (Customer) BeanUtils.MapToBean(new Customer(), (Map) retultList.get(i));
				list.add(customer);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DatabaseManager.getInstance().close(ps);
				DatabaseManager.getInstance().close(conn);
				DatabaseManager.getInstance().close(rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List resultToList(ResultSet rs) throws java.sql.SQLException {
		if (rs == null) {
			return null;
		}

		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount();

		List list = new ArrayList();
		Map rowData;
		while (rs.next()) {
			rowData = new HashMap(columnCount);
			for (int i = 1; i <= columnCount; i++) {
				rowData.put(md.getColumnName(i), rs.getObject(i));
			}
			list.add(rowData);
		}
		return list;
	}
}
