/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c20_generic_wildcards;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ocp2018_135.c20_generic_wildcards.beans.Animal;
import ocp2018_135.c20_generic_wildcards.beans.Cat;
import ocp2018_135.c20_generic_wildcards.beans.Dog;

/**
 * <pre>
 * [通配符] 2019-08-29 22:12
 * - 是一種佔位符號, 來代替任何一種不確定要應用的參考型態, 較常用的是 T
 * - 其他字母也可以是通配符, 通常以大寫表示
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Wildcards {

	public static void main(String[] args) {

		/** T: 限定通配符 */

		Animal<Integer> cats = new Cat<>(23);
		Animal<String> dogs = new Dog<>("woof woof");

		cats.getTType();
		dogs.getTType();

		System.out.println();

		/** ?: 無限定通配符 */

		List<Integer> listInt = new LinkedList<>();
		listInt.add(1);
		listInt.add(4);
		listInt.add(2);
		listInt.add(2);
		listInt.add(3);
		System.out.println(">>> 可傳入 Integer 型態 <<<");
		printCollection(listInt);

		Set<String> setStr = new TreeSet<>();
		setStr.add("c");
		setStr.add("d");
		setStr.add("a");
		setStr.add("b");
		setStr.add("b");
		System.out.println(">>> 也可傳入 String 型態 <<<");
		printCollection(setStr);

	}

	// 傳入值使用多型
	public static void printCollection(Collection<?> list) {

		Iterator<?> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");
	}
}
