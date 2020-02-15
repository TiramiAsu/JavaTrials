/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c16_interface;

import ocp2018_135.c16_interface.impl.DatabaseImpl;

/**
 * <pre>
 * [介面的應用] 2020-02-15 11:37
 * - interface 的使用, 就必須實作設定的方法, 搭配 "多型" 可以便利的操作參考型態類別
 * 
 * [實作與繼承架構]
 * interface, abstract, class 實作與繼承
 * - IDatabase(interface)
 * - IOperate(interface)
 * - ADatabase(abstract) 實作 IDatabase, 還有設定資料庫帳號密碼方法
 * - DatabaseImpl(class) 繼承 ADatabase 還有實作 IOperate
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Database {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/** 建構一般 class 呼叫方法 */

		DatabaseImpl database = new DatabaseImpl();

		// 所有實作方法都可以調用
		System.out.println(">>> DatabaseImpl <<<");
		database.getConnection("user");
		database.create();
		database.query();
		database.find();
		database.update();
		database.delete();
		database.setUser();
		database.setPassword();
	}
}
