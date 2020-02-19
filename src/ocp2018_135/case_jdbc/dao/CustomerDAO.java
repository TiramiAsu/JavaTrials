/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.case_jdbc.dao;

import java.util.List;

import ocp2018_135.case_jdbc.beans.Customer;

/**
 * <pre>
 * [定義 CustomerDAO] 2020-02-19 14:51
 * 
 * [DAO架構]
 * Data Access Object (資料存取物件)
 * - DAO 介面: 把對資料庫的所有操作定義成抽象方法, 可以提供多種實作
 * - DAO 實作: 依照 DAO 介面定義的方法, 針對不同資料庫實作方法
 * 
 * [Entity]
 * - 實體物件: 用於存放與傳輸物件數據
 * - 數據庫連接和關閉工具類: 避免了數據庫連接和關閉代碼的重複使用, 方便修改
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public interface CustomerDAO {

	// 新增客戶資料
	public void create(Customer customer);

	// 查詢所有客戶資料
	public List<Customer> query();

	// 使用 "客戶ID" 查詢客戶資料
	public Customer find(int id);

	// 更新客戶資料
	public void update(int id, Customer customer);

	// 刪除客戶資料
	public void delete(int id);
}
