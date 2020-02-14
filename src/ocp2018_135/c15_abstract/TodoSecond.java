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
 * [抽象類別] 2019-08-21 21:21
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public abstract class TodoSecond extends TodoFirst {

	public TodoSecond(String name, String sex, int age) {
		super.setName(name);
		super.setSex(sex);
		super.setAge(age);
	}

	// 只實作了 workGetName(), 但因為 TodoSecond 也是抽象類別, 所以不強制要求實作 workGetAge()
	@Override
	public String workGetName() {
		String name = getName() + " is good people";
		return name;
	}
}
