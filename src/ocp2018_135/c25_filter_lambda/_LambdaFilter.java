/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c25_filter_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import ocp2018_135.c25_filter.beans.Employee;

/**
 * <pre>
 * [Lambda 過濾器/攔截器] 2019-09-09 21:39
 * - 使用 Lambda 表達式
 * - 使用 Stream (for Collection)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _LambdaFilter {

	static List<Employee> empolyees = Arrays.asList(
			new Employee(1, "Tirami", 23, 66666),
			new Employee(2, "Kimmy", 22, 77777),
			new Employee(3, "Anita", 24, 88888),
			new Employee(4, "Escano", 20, 55555),
			new Employee(5, "Peter", 28, 99999));

	public static void main(String[] args) {

		/** 原來進階 Filter */

		/*
		System.out.println(">>> 年齡 24 歲以上(含)的員工 <<<");
		List<Employee> ageList = traditionFilter(new AgeFilter(24), empolyees);
		ageList.forEach(System.out::println); // iterable -> 指定實作方法可以用::(除此之外不是每個都可以)

		System.out.println();

		System.out.println(">>> 薪水 70,000 元以上(含)的員工 <<<");
		List<Employee> salaryList = traditionFilter(new SalaryFilter(70000), empolyees);
		salaryList.forEach(System.out::println); // iterable
		*/

		/** 使用 Stream(Lambda expression) */

		System.out.println(">>> 年齡 24 以下(含)員工, 先找到的兩名 <<<");
		empolyees.stream()
			.filter((e) -> e.getAge() >= 24)
			.limit(2)
			.forEach(System.out::println); // stream

		System.out.println();

		System.out.println(">>> 薪水 70,000 以上(含)員工, 先找到的兩名 <<<");
		Predicate<Employee> condition = (e) -> e.getSalary() >= 70000; // 將篩選條件以變數顯示
		empolyees.stream()
			.filter(condition)
			.limit(2)
			.forEach(System.out::println); // stream
	}

}
