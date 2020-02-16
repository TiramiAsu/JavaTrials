/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c24_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * [過濾器/攔截器] 2019-09-08 15:37
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Filter {

	// 建立資料
	static List<Employee> empolyees = Arrays.asList(
			new Employee(1, "TiramiAsu", 23, 66666),
			new Employee(2, "Kimmy", 22, 77777),
			new Employee(3, "Anita", 21, 88888),
			new Employee(4, "Escano", 20, 55555));

	public static void main(String[] args) {

		/* 一般 Filter */

		List<Employee> listA = filterAge(22, empolyees);
		printList(listA);

		List<Employee> listB = filterSalary(70000, empolyees);
		printList(listB);

	}

	// Filter Salary
	public static List<Employee> filterSalary(int condition, List<Employee> list) {

		List<Employee> emps = new ArrayList<>();
		for (Employee emp : list) {
			if (emp.getSalary() >= condition) {
				emps.add(emp);
			}
		}
		return emps;

	}

	// Filter Age
	public static List<Employee> filterAge(int condition, List<Employee> list) {

		List<Employee> emps = new ArrayList<>();
		for (Employee emp : list) {
			if (emp.getAge() >= condition) {
				emps.add(emp);
			}
		}
		return emps;

	}

	// print List
	public static void printList(List<Employee> list) {

		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println();

	}
}
