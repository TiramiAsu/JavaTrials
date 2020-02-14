/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c14_inherit.beans_attribute;

/**
 * <pre>
 * [SuperClass] 2019-08-20 20:35
 * - Teacher 和 Student 的父類別
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Person {

	private String name = "人類";
	private String sex = "性別";
	private int age = 0;

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

	@Override
	public String toString() {
		return "Person [name=" + name +
				", sex=" + sex +
				", age=" + age +
				"]";
	}
}
