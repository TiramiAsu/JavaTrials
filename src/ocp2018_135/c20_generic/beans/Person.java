/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c20_generic.beans;

/**
 * <pre>
 * [Bean] 2019-08-29 23:00
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Person {

	private String name;
	private char sex;

	public Person() {}

	public Person(String name, char sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name +
				", sex=" + sex +
				"]";
	}
}
