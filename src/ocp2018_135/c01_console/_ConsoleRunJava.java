/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c01_console;

/**
 * <pre>
 * [使用 console 編譯 .java 並執行 .class 檔案] 2019-08-17 11:06
 * - cmd: $ javac _ConsoleRunJava.java
 * - cmd: $ java _ConsoleRunJava 2 5 8
 * 
 * p.s. 執行失敗: 要把 package 刪掉, package 不正確, 編譯會出錯
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ConsoleRunJava {

	public static void main(String[] args) {
	
		// 在 console 輸入 2 5 8, 相當 args 取得會等同於下面這一行
//		String[] args = {"2", "5", "8"};
		
		int keyin = Integer.parseInt(args[0]);
		if (keyin == 5) {
			System.out.println("it's true");
		}else {
			System.out.println("it's false");
		}
	}
}
