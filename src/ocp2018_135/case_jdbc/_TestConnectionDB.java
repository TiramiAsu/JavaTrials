/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.case_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ocp2018_135.case_jdbc.db.DatabaseManager;

/**
 * <pre>
 * [測試是否連到資料庫] 2020-02-19 15:05
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _TestConnectionDB {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {
			DatabaseManager dbm = DatabaseManager.create();

			Class.forName(dbm.JDBC_DRIVER);
			conn = DriverManager.getConnection(dbm.JDBC_URL, dbm.JDBC_USER, dbm.JDBC_PASS);

			if (conn != null && !conn.isClosed()) {
				System.out.println("資料庫連線測試成功!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驅動程式類別");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}
}
