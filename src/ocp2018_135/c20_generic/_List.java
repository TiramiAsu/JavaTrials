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
import java.util.List;

/**
 * <pre>
 * [List] 2020-02-15 18:51
 * - List 常用的實作類是 ArrayList<>, LinkedList<>
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _List {

	public static void main(String[] args) {

		// new ArrayList 的 <> 可省略 , 因為由 List<Integer> 繼承, 子類別會得知參考型態
		List<Integer> list = new ArrayList<>();

		// 新增 add(T t)
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(3);
		System.out.println(">>> list 所有元素 <<<");
		printList(list); // 依照輸入的順序排, 可重複

		// 刪除 remove(int index)
		list.remove(1); // remove 4
		System.out.println(">>> 移除 index 1 的元素 <<<");
		printList(list);

		// 修改 set(int index,T t)
		list.set(2, 7);
		System.out.println(">>> 修改 index 2 的元素, 變成 7 <<<");
		printList(list);

		// 查詢 get(int index)
		int num = list.get(2);
		System.out.println(">>> 查詢 index 2 的元素 <<<");
		System.out.println(num + "\n");
		
		// 插入 add(int index, T t)
		list.add(3, 9);
		System.out.println(">>> 將元素 9, 插入 index 3 的位置 <<<");
		printList(list);
	}

	public static void printList(List<Integer> list) {
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
