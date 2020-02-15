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

import java.util.ArrayList;
import java.util.Collection;

/**
 * <pre>
 * [泛型] 2020-02-15 18:51
 * Collection 的一種, 是由參考型態組成的
 * - 安全性考量
 * - 常配合繼承, 多型應用
 * 
 * [有 Collection, 為何還要泛型?]
 * - 集合裡元素若型態都不同, 安全性不佳, 且需轉換型態耗記憶體
 * 
 * [List & Set]
 * - 輸入集合的元素順序 != 集合裡的元素排序
 * - List: 集合裡無排序, 是輸入時的順序, 可重複
 * - Set:  集合裡有排序, 不是輸入的順序, 不重複
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Generic {

	public static void main(String[] args) {

		/* Collection */
		Collection<Object> col = new ArrayList<>();
		col.add(12);
		col.add("sd");
		
		for (Object o : col) {
			System.out.println(o);
		}
	}
}
