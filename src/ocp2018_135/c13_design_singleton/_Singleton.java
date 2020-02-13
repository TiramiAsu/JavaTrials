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
 * [單例設計模式] 2019-08-11 18:13
 * - 1. 私有化建構子
 * - 2. 提供 public static 方法讓調用者直接取得已建構好的物件
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Singleton {

	public static void main(String[] args) {

		// 使用物件中的 public static 方法就可以取得物件而不需要 new 一個
		Driver driver = Driver.getDriver();
		driver.printMethod();
	}
}
