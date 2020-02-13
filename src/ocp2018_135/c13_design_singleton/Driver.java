/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c13_design_singleton;

/**
 * <pre>
 * [Bean] 2019-08-15 17:56
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Driver {

	// 2. 利用屬性將物件建構好
	private static Driver driver = new Driver();

	// 1. 私有化建構子
	private Driver() {
		// 外面無法調用建構
	}

	// 3. 以封裝的方式讓調用者可以取得建構好的物件
	public static Driver getDriver() {
		return driver;
	}

	public void printMethod() {
		System.out.println("Singleton Design!!");
	}
}
