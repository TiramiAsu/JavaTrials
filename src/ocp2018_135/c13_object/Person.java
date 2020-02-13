/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c13_object;

/**
 * <pre>
 * [Bean] 2019-08-15 00:29
 * 1. 參考型態(物件)
 * 2. 建構子說明
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Person {

	/** 屬性 */

	private String name;
	private Integer age;
	private String address;

	/** 代碼塊 */

	// 一般代碼塊: 最早建立, 每 new 一次都會執行
	{
		System.out.print("代碼塊 ");
		get();
	}

	// static 代碼塊: 只會執行一次, 不管 new 了幾次
	static {
		System.out.print("static代碼塊 ");
		get("");
	}

	/** 建構子 */
	
	// 空參數建構子 - 註解掉空參數建構, 可以強迫調用時輸入值, 沒辦法以 "new Person();" 建構
	public Person() {
		System.out.println("空參數建構子 \"public Person(){}\"");
	}

	// 自訂建構子
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 自訂建構子多載
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/** 方法 */

	// private 限制只在此 class 呼叫而已，外部無法呼叫
	private void get() {
		System.out.println("\"private void get(){}\"");
	}

	// 以多載區隔, 且 static 只能呼叫 static
	private static void get(String s) {
		System.out.println("\"private static void get(String s)\"");
	}

	// 回傳型態為參考型態的物件(Person)
	public Person getPerson() {
		return new Person();
	}

	/** setter, getter 封裝 */

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		// 重新賦值給 this.age 時, 先檢查再賦值
		if (age > 0 && age < 120) {
			this.age = age;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
