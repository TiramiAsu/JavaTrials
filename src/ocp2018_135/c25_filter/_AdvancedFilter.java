/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c25_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ocp2018_135.c25_filter.beans.AgeFilter;
import ocp2018_135.c25_filter.beans.Employee;
import ocp2018_135.c25_filter.beans.SalaryFilter;

/**
 * <pre>
 * [進階 Filter] 2019-09-09 21:48
 * - 只能有一個抽象方法
 * - 加上註解 @FunctionalInterface 一定要有傳入值 &lt;T&gt;, 才能傳各種型態
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _AdvancedFilter {

	static List<Employee> empolyees = Arrays.asList(
			new Employee(1, "Tirami", 23, 66666),
			new Employee(2, "Kimmy", 22, 77777),
			new Employee(3, "Anita", 24, 88888),
			new Employee(4, "Escano", 20, 55555),
			new Employee(5, "Peter", 28, 99999));

	public static void main(String[] args) {

		System.out.println(">>> 年齡 24 歲以上(含)的員工 <<<");
		List<Employee> ageList = traditionFilter(new AgeFilter(24), empolyees);
		ageList.forEach(System.out::println); // iterable -> 指定實作方法可以用::(除此之外不是每個都可以)

		System.out.println();

		System.out.println(">>> 薪水 70,000 元以上(含)的員工 <<<");
		List<Employee> salaryList = traditionFilter(new SalaryFilter(70000), empolyees);
		salaryList.forEach(System.out::println); // iterable
	}

	public static List<Employee> traditionFilter(IPredicate<Employee> filter, List<Employee> list) {

		List<Employee> emps = new ArrayList<>();
		for (Employee emp : list) {
			// 如果符合條件就會回傳 true, 進而增加到 emps
			if (filter.judge(emp)) {
				emps.add(emp);
			}
		}
		return emps;
	}
}
