/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c15_abstract;

/**
 * <pre>
 * [抽象類別] 2019-08-21 21:17
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class TodoThird extends TodoSecond {

	public TodoThird(String name, String sex, int age) {
		super(name, sex, age);
	}

	// 因為 TodoSecond 已經實作了一個方法, 所以只剩 workGetAge() 要實作
	@Override
	public int workGetAge() {
		int age = getAge();
		if (getSex().equals("F") && age >= 25) {
			age -= 5;
		}
		return age;
	}
}
