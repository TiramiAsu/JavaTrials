/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c12_string;

/**
 * <pre>
 * [StringBuffer 與 StringBuilder] 2019-08-11 12:35
 * - 1. 可改變(String 不可變, 因為是 final)
 * - 2. 許多方法與 String 相同
 * - 3. 是一種 String 容器
 * 
 * [特性]
 * StringBuilder  效能高, 無安全線程, 用於大量資料
 * StringBuffer   效能中, 有安全線程, 用於大量資料, 常用在全域變數
 * String         效能差, 無線程概念, 用於少量資料
 * 
 * [線程安全]
 * -假設丟1000次
 * StringBuilder 傳輸值出去不會比對, 傳出去就不管了
 * StringBuffer  傳輸值出去會比對, 次數確定達到 1000 才會傳出去
 * 
 * [線程比較]
 * +----------------+--------------+
 * | Thread unsafe  | Thread safe  |
 * +----------------+--------------+
 * | ArrayList      | Vector       |
 * | HashMap        | HashTable    |
 * | StringBuilder  | StirngBuffer |
 * +----------------+--------------+
 * 
 * -產生多執行序(多個使用者連進來) thread
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _StringBuilderBuffer {

	public static void main(String[] args) {

		/** StringBuffer */

		// new 一個 StringBuffer
		StringBuffer sbf = new StringBuffer();

		System.out.println(sbf.length()); // 0

		sbf.append("Hello ").append("World"); // 可以使用 append 連續連接很多字串
		System.out.println(sbf.insert(6, "Java ")); // 使用 insert 插入字串
		System.out.println(sbf.reverse()); // 使用 reverse 可以反轉字串

		System.out.println(sbf.length()); // 11

		System.out.println("-------");

		/** StringBuilder */

		// new 一個 StringBuilder
		StringBuilder sbd = new StringBuilder();

		System.out.println(sbd.length()); // 0

		sbd.append("No. ").append("1"); // 可以使用 append 連續連接很多字串
		System.out.println(sbd.insert(0, "Taiwan ")); // 使用 insert 插入字串
		System.out.println(sbd.reverse()); // 使用 reverse 可以反轉字串

		System.out.println(sbd.length()); // 5
	}
}
