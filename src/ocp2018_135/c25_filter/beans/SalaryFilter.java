/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c25_filter.beans;

import ocp2018_135.c25_filter.IPredicate;

/**
 * <pre>
 * [filter 薪水] 2019-09-08 15:35
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class SalaryFilter implements IPredicate<Employee> {
	
	private int salary = 0;

	public SalaryFilter(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean judge(Employee employee) {
		// 薪水 >= salary 的 data 回傳 true
		return employee.getSalary() >= this.salary;
	}
}
