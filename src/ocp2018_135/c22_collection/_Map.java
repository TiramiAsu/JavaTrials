/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c22_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ocp2018_135.c22_collection.beans.Female;
import ocp2018_135.c22_collection.beans.Human;
import ocp2018_135.c22_collection.beans.Male;

/**
 * <pre>
 * [Map] 2020-02-16 01:22
 * - 一個 key 對應 一個 value
 * - key 用陣列存放, 且不重複
 * - 常用 String 存放 key
 * 
 * [Map 排列順序按照輸入順序]
 * - 只有一個繼承結構, 就一個 interface 或是 class 實作就好(參考 list, set 結構)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Map {

	/*
	 * (I)Animal
	 *  L (I)Human
	 *     L (C)Male
	 *     L (C)Female
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		/*
		 * - 用(父類別) Human 來限定, 之後可以發展 Lion, Bird 等等
		 * - 如果用最高父類別 (I)Animal 來限定, 之後多了 Lion, Bird, 會不清楚 Male, Female 是屬於什麼
		 */
		Map<String, Human> map = new HashMap<>();
		map.put("1", new Male());
		map.put("2", new Female());

		print(">>> 使用 .keySet() 取得 key <<<");
		for (String str : map.keySet()) {
			System.out.println("key: " + str);
		}
		print();
		
		print(">>> 使用 .values() 取得 value <<<");
		Collection<Human> coll = map.values();
		Iterator<Human> it = coll.iterator();
		while (it.hasNext()) {
			System.out.println("value: " + it.next());
		}
		print();

		print(">>> 使用 key 取得 value <<<");
		System.out.println(map.get("2"));
		System.out.println(map.get("1"));
		print();

		print(">>> print 所有 key/value <<<");
		Set<String> s1 = map.keySet();
		for (Object ob : s1) {
			System.out.println(ob + ": " + map.get(ob));
		}
		print();

		print(">>> print 所有 key/value <<<");
		System.out.println(map);
		print();

		print(">>> print map 條目 <<<");
		System.out.println(map.entrySet());
		print();

		/** Map 映射 */

		print(">>> 將 entry 的字串轉成集合 <<<");
		Set<Entry<String, Human>> setEntry = map.entrySet();
		for (Object ob : setEntry) {
			Map.Entry<String, Human> en = (Entry<String, Human>) ob;
			System.out.println(en);
		}
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void print() {
		System.out.println();
	}
}
