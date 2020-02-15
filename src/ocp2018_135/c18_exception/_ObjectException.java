/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c18_exception;

import java.util.Date;

/**
 * <pre>
 * [物件類異常] 2019-08-25 17:24
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ObjectException {

	public static void main(String[] args) {
		try {
			// 擇一執行
//			exceptionCast();
			exceptionNullPoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void exceptionCast() {
		Object date = new Date();
		String ss = (String) date; // Date 型態不可以直接轉換成 String 型態
		System.out.println(ss);
	}
	
	@SuppressWarnings("null")
	public static void exceptionNullPoint() {
		Object obj = new Object();
		obj = null;
		System.out.println(obj.toString());
	}
}
