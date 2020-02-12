/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c11_object;

/**
 * <pre>
 * [物件的相等] 2019-08-10 01:49
 * - String 的 .equals(...) -> 判斷字串內容是否相同
 * - Object 的 .equals(...) -> 判斷物件是否相同
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Equals {

	public static void main(String[] args) {

		/** String 的 .equals(...) -> 比較的是字串內容有沒有相等 */

		String str = "abcde"; // String 型態
		String strObj = new String("abcde"); // Object 型態

		// String 型態 v.s. String 型態
		System.out.println(str.equals("abcde")); // true

		// String 型態 v.s. Object 型態
		System.out.println(str.equals(strObj)); // true


		/** Object 的 .equals(...) -> 除了 String 以外, 其他 Object 的物件, 比較的是不是同一個物件(同一個記憶體位置) */

		String strObjA = strObj;
		String strObjB = new String("abcde");

		// String 的物件型態: strObjA v.s. strObj
		System.out.println(strObjA.equals(strObj)); // true

		// String 的物件型態: strObjA v.s. strObjB
		System.out.println(strObjA.equals(strObjB)); // true

		// Object 的物件，比較是不是同一個物件(同一個記憶體位置)
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2) + "\n"); // false
	}
}
