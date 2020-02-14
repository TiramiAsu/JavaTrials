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
 * [抽象類別] 2019-08-21 21:18
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public abstract class TodoFirst {

	private String name;
	private String sex;
	private int age;

	public abstract String workGetName(); // 待實作的方法(沒有方法體)
	public abstract int workGetAge();     // 待實作的方法(沒有方法體)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
