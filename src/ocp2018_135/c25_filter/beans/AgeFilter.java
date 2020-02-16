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
 * [filter 年齡] 2019-09-08 15:33
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class AgeFilter implements IPredicate<Employee>{
	
	private int age = 0;

	public AgeFilter(int age) {
		this.age = age;
	}

	@Override
	public boolean judge(Employee employee) {
		// 年齡 >= age 的 data 回傳 true
		return employee.getAge() >= this.age;
	}
}
