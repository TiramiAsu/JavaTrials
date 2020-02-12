/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c09_object;

/**
 * <pre>
 * [Bean] 2019-08-09 23:25
 * 1. 私有化屬性
 * 2. 提供空參數建構子
 * 3. 自訂建構子
 * 4. 提供 setter, getter 方法
 * 5. 如有需要可覆寫
 * - a. hashCode
 * - b. equals方法
 * - c. toString 方法
 * 
 * p.s. 以上方法可自由選擇搭配
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Person {

	// 1. 私有化屬性
	private String id;
	private String name;
	private int age;
	private String address;

	// 2. 提供空參數建構子
	public Person() {}

	// 3. 自訂建構子
	public Person(String id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 4. 提供 setter, getter 方法
	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 5. 覆寫 toString 方法 (hashCode)
	@Override
	public String toString() {
		return "Person [id=" + id +
				", name=" + name +
				", age=" + age +
				", address=" + address +
				"]";
	}
}
