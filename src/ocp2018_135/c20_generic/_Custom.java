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
import java.util.Iterator;
import java.util.Set;

import ocp2018_135.c20_generic.beans.Person;
import ocp2018_135.c20_generic.beans.Student;

/**
 * <pre>
 * [自定義型態] 2020-02-16 00:18
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Custom {

	public static void main(String[] args) {

		/** 使用泛型套用參考型態 */

		Set<Person> sc = new HashSet<>();
		sc.add(new Student(1, "Tirami"));
		sc.add(new Student(2, "Kimmy"));
		sc.add(new Student(3, "Escano"));
		sc.add(new Student(4, "Leo"));
		sc.add(new Student(5, "Anita"));

		printByForEach(sc);
		printByIterator(sc);
	}

	// 使用 ForEach 印出元素
	public static void printByForEach(Set<Person> set) {
		for (Person p : set) {
			System.out.println(p.toString());
		}
		System.out.println();
	}

	// 使用 Iterator 印出元素
	public static void printByIterator(Set<Person> set) {
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
