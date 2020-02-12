/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c09_object;

/**
 * <pre>
 * [類] 2019-08-09 23:23
 * - class -> Java 程式中最小可執行的單位
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _JavaBean {

	public static void main(String[] args) {

		// 建立物件
		Person personA = new Person();
		Person personB = new Person("ID0857", "TiramiAsu", 25, "臺灣-新北市xx區xx路一段xx巷xx號1F");

		// 取得物件內容
		
		// personA 資料
		System.out.println(personA.toString()); // 沒有設定, 全是空的
		personA.setName("Haha");
		System.out.println("personA 姓名: " + personA.getName()); // 設定後, 就有名字

		// personB 資料
		System.out.println(personB.toString()); // new 的時候就有設定, 所以資料都有
	}
}
