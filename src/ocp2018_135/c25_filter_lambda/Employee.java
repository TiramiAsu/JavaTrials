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

/**
 * <pre>
 * [Bean] 2019-09-08 15:18
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee() {}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id +
				", name=" + name +
				", age=" + age +
				", salary=" + salary +
				"]";
	}

}
