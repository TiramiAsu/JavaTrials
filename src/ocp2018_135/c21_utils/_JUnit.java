/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c21_utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <pre>
 * [JUnit] 2020-02-16 01:03
 * - 使用註解 Before 跟 After, 會在 Test 前後依照順序執行
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _JUnit {

	Person person;

	@Before
	public void getObject() {
		System.out.println("Before");
	}

	@Test
	public void test() {
		person = new Person(20, "TiramiAsu");
		person.setAge(25);
		System.out.println(person);
	}

	@After
	public void getMethod() {
		System.out.println("After");
	}
}

class Person {

	private int age;
	private String name;

	public Person() {
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age +
				", name=" + name +
				"]";
	}
}
