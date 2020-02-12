/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c07_utils_junit;

import org.junit.jupiter.api.Test;

/**
 * <pre>
 * [JUnit 單元測試] 2020-02-12 21:17
 * - 不用 main 方法呼叫，直接執行方法
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _JUnit {
	
	/* 
	 * Build JUnit Libraries
	 * - Project 名稱上按右鍵> Build Path> Add Libraries> JUnit> Next> JUnit 5> Finish
	 * 
	 * Usage JUnit:
	 * - 使用註解 @Test(import org.junit.Test;) 來標記要執行的方法
	 * - 在方法上面標記
	 * 
	 * Run JUint:
	 * 1. 執行一個有標記 @Test 的方法:
	 * - 方法名稱右鍵> Run As> JUnit Test
	 * - 右邊欄位有個 Outline> 對方法名稱右鍵> Run As
	 * 
	 * 2. 執行整個 class 中所有有標記 @Test 的方法:
	 * - 在 class 任意區域右鍵> Run As> JUnit Test
	 * - 右邊欄位有個 Outline> 對類別名稱右鍵> Run As
	 * p.s. 執行順序依照 method 的名稱順序(ASCII Code 大小), ASCII Code 越小越先執行
	 * 
	 * 3. 執行整個 Project 所有的 JUnit:
	 * - 在專案名稱任意區域右鍵> Run As> JUnit Test
	 * 
	 * Test Situation:
	 * 1. 執行有 print, 結果一樣會在 console 畫面出現
	 * 2. 左邊欄位 JUnit 有程式執行完的時間可以參考
	 * 
	 */
	@Test
	public void bBuild() {
		System.out.println("3");
	}
	
	@Test
	public void cBuild() {
		System.out.println("2");
	}
	
	@Test
	public void aBuild() {
		System.out.println("1");
	}
}
