/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c19_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * <pre>
 * [集合] 2019-08-29 21:11
 * - Collection 是 interface, List 和 Set 是它的子類別
 * - List: 元素沒排序, 可重複
 * - Set:  元素有排序, 不可重複
 * 
 * [Collection 與 Array 差異]
 * - Array 長度不變: 固定陣列(一維), 可變陣列(二維)
 * - Collection 長度可變
 *
 * [Map 集合]
 * - Map&lt;K, V&gt; 是 interface, HashMap&lt;K, V&gt; 是它的子類別
 * - K: key, V:value
 *
 * [List 集合]
 * - ArrayList:  切一塊記憶體, 用 index 儲存記憶體位置   -> select 快 / 新增, 刪除慢
 * - LinkedList: 切很多記憶體, 1紀錄2的位置, 2紀錄3的位置 -> select 慢 / 新增, 刪除快
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Collection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// 多型建構 Collection

		Collection co1 = new ArrayList();
		co1.add("Happy");
		co1.add(123);
		co1.add(true);

		print(co1);

		Collection co2 = new ArrayList();
		co2 = co1;

		// 在 co1 集合中再加入 co2 的集合
		co1.addAll(co2);

		print(co2);

		// 移除 Collection 中元素, 移除找到的第一個
		co1.remove(123);

		print(co1);

		// 取得 Collection 長度
		System.out.println("co1 長度: " + co1.size());

		// 取得 Collection 是否為空值 -> 為空返回 true, 反之為 false
		System.out.println("co2 是否為空: " + co2.isEmpty());

		// 找 collection 內的元素
		System.out.println("co1 是否有 \"Happy\" 的元素: " + co1.contains("Happy"));

		// 清除 collection 內的元素
		co2.clear();
		System.out.println("co2 長度: " + (co2.size() == 0 ? "已清空" : co2.size()));

		/** 將 Collection 轉成 List */

		Collection co3 = Arrays.asList(2, 5, 7, 6);

		List list = Arrays.asList(co3.toArray());
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}

	@SuppressWarnings("rawtypes")
	public static void print(Collection collection) {
		for (Object obj : collection) {
			System.out.print(obj);
			System.out.print(", ");
		}
		System.out.println();
	}
}
