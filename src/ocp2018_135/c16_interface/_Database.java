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

import ocp2018_135.c16_interface.impl.ConnectionImpl;
import ocp2018_135.c16_interface.impl.DatabaseImpl;
import ocp2018_135.c16_interface.interfaces.ADatabase;
import ocp2018_135.c16_interface.interfaces.IConnection;
import ocp2018_135.c16_interface.interfaces.IDatabase;
import ocp2018_135.c16_interface.interfaces.IOperate;

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

		System.out.println();

		/** 多型建構 class */

		// class 實作了很多方法, 但是可以透過 interface 或是 abstract 來限定可以調用的實作方法
		IDatabase iDatabase = new DatabaseImpl();
		IOperate iOperate = new DatabaseImpl();
		ADatabase aDatabase = new DatabaseImpl();

		// IDatabase 只有要求實作 getConnection(), 所以只能調用 class 中此實作的方法
		System.out.println(">>> IDatabase <<<");
		iDatabase.getConnection(new ConnectionImpl());
//		iDatabase.getConnection("user"); // 出錯
//		iDatabase.create();      // 出錯
//		iDatabase.query();       // 出錯
//		iDatabase.find();        // 出錯
//		iDatabase.update();      // 出錯
//		iDatabase.delete();      // 出錯
//		iDatabase.setUser();     // 出錯
//		iDatabase.setPassword(); // 出錯

		System.out.println();

		// IOperate 要求實作 CRUD 的四種方法, 所以只能調用這四種實作方法
		System.out.println(">>> IOperate <<<");
//		iOperate.getConnection(new Connection()); // 出錯
//		iOperate.getConnection(); // 出錯
		iOperate.create();
		iOperate.query();
		iOperate.find();
		iOperate.update();
		iOperate.delete();
//		iOperate.setUser();       // 出錯
//		iOperate.setPassword();   // 出錯

		System.out.println();

		// ADatabase 只實作 setUser(), setPassword()
		System.out.println(">>> ADatabase <<<");
		aDatabase.getConnection(new ConnectionImpl());
		aDatabase.getConnection("user");
//		aDatabase.create(); // 出錯
//		aDatabase.query();  // 出錯
//		aDatabase.find();   // 出錯
//		aDatabase.update(); // 出錯
//		aDatabase.delete(); // 出錯
		aDatabase.setUser();
		aDatabase.setPassword();

		System.out.println();

		/** 若使用方法時要求傳入interface, 用匿名類別處理, 還是需要實作 */

		Object connection = aDatabase.getConnection(new IConnection() {
			
			@Override
			public Object getConnection(String info) {
				System.out.println("取得連線物件: " + info);
				return new Object();
			}
			
		});
	}
}
