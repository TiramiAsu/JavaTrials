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

/**
 * <pre>
 * [陣列類異常] 2019-08-25 17:15
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ArrayException {

	public static void main(String[] args) {
		try {
			exceptionIndex();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exceptionIndex() {

		int[] arr = { 0, 1, 2, 3, 4, 5 };
		
		// index 小於 0 或大於陣列長度, 就會出錯
		System.out.println(arr[-6]);
		System.out.println(arr[6]);
	}
}
