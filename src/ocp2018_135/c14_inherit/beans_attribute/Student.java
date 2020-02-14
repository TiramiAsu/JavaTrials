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
 * [SubClass] 2020-02-14 13:21
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Student extends Person {

	private String job = "讀書";

	public Student() {}

	public Student(String job) {
		this.job = job;
	}

	/* setter, getter */

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Student [job=" + job + "]";
	}
}
