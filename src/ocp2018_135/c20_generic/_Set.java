/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c20_generic;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 * [Set] 2020-02-15 18:51
 * - Set 常用的實作類是 HashSet<>, TreeSet<>
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Set {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		// 新增 add(T t)
		set.add("c");
		set.add("d");
		set.add("a");
		set.add("b");
		set.add("b");
		System.out.println(">>> set 所有元素 <<<");
		printSet(set); // "b" 只有一個, 不照輸入的順序排, 不重複

		// 刪除 remove(Object o)
		set.remove("c"); // remove "c"
		System.out.println(">>> 移除 \"c\" 的元素 <<<");
		printSet(set);

		// 修改: 因為有序且不可重複, 所以不用修改, 元素一定是唯一

		// 查詢: contains(Object obj), 回傳集合中有沒有這個元素
		System.out.println(">>> 有沒有 \"a\" 這個元素 <<<");
		System.out.println(set.contains("a"));

		System.out.println();

		/** object 的 Collection 的 == 與 equals */

		// Collection 的 equals 方法有被覆寫 @Override 所以判定方式與 Object 不一樣 (String 與 Object 的 equals 也是一樣情況)
		// 參考 API: Ref: https://www.javaworld.com.tw/jute/post/view?bid=29&id=200487
	}

	public static void printSet(Set<String> set) {
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
	}
}
