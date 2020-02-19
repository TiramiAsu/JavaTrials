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

import ocp2018_135.case_jdbc.beans.Customer;
import ocp2018_135.case_jdbc.dao.CustomerDAO;
import ocp2018_135.case_jdbc.dao.impl.CustomerDAOImpl;

/**
 * <pre>
 * [測試客戶 CRUD] 2020-02-19 15:10
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _TestCustomerCRUD {

	private static CustomerDAO customerDAO = new CustomerDAOImpl();

	/*
	CREATE TABLE public.customers
	(
		id serial NOT NULL,
		code character varying(255) NOT NULL,
		name character varying(255) NOT NULL,
		phone character varying(127) NOT NULL,
		address character varying(1023) NOT NULL,
		relationman character varying(127) NOT NULL,
		remark character varying(1023),
		PRIMARY KEY (id)
	)
	WITH (OIDS = FALSE);

	ALTER TABLE public.customers OWNER to postgres;
	*/
	public static void main(String[] args) {

//		System.out.println(">>> 新增客戶 <<<");
//		create();

//		System.out.println(">>> 修改客戶 <<<");
//		update(2);

		System.out.println(">>> 刪除客戶 <<<");
		delete(1);

		System.out.println(">>> 查詢客戶 <<<");
		query();
	}
	
	public static void create() {

		// 新增客戶資料
		Customer customer1 = new Customer("K8561", "Jeff", "0974185293", "oo市oo區oo路二段xx號5樓", "Harry", null);
		Customer customer2 = new Customer("F8852", "Harry", "0944278557", "oo市oo區oo路三段xx號7樓", "Lea", "nice person");
		Customer customer3 = new Customer("S1259", "Lea", "0922727448", "oo市oo區oo路一段xx號3樓", "Vivi", null);

		// 新增客戶
		customerDAO.create(customer1); // 資料已經進資料庫，所以 static 覆蓋沒有關係(購物車就不可用這方式)
		customerDAO.create(customer2);
		customerDAO.create(customer3);
	}
	
	public static void query() {
		customerDAO.query().stream()
			.forEach(System.out::println);
	}
	
	public static void update(int id) {
		Customer customer = customerDAO.find(id);
		System.out.println(customer);
		customer.setName("Zark");
		customerDAO.update(id, customer);
	}
	
	public static void delete(int id) {
		customerDAO.delete(id);
	}
}
