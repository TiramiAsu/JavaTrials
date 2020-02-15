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
 * [Bean] 2020-02-15 19:07
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Student extends Person {

	private int id;
	private String englishName;

	public Student() {}

	public Student(int id, String englishName) {
		this.id = id;
		this.englishName = englishName;
	}

	public Student(String name, char sex, int id, String englishName) {
		super(name, sex);
		this.id = id;
		this.englishName = englishName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id +
				", englishName=" + englishName +
				"]";
	}

}
