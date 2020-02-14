/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c15_object;

/**
 * <pre>
 * [存取修飾子] 2020-02-15 02:38
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class SuperBean {

	// 四種不同存取修飾子的屬性
	private String age;
	String address;
	protected String note;
	public String name;

	public SuperBean() {}

	public SuperBean(String name, String address, String note, String age) {
		this.name = name;
		this.address = address;
		this.note = note;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SuperBean [age=" + age +
				", address=" + address +
				", note=" + note +
				", name=" + name +
				"]";
	}

}
