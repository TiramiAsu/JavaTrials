/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c10_object_overload;

/**
 * <pre>
 * [方法多載] 2019-08-10 00:03
 * - 1. 方法名稱相同
 * - 2. 傳入參數個數不同
 * - 3. 傳入參數個數相同, 型態不同
 * - 4. 傳入參數個數相同, 型態相同, 位置不同
 * 
 * - p.s. 與回傳值無關
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Overload {
	
	private static _Overload obj = new _Overload();

	public static void main(String[] args) {
		
		// 一般方法
		obj.getMethod("str");
		
		// 傳入參數個數不同
		obj.getMethod("str1", "str2");
		
		// 傳入參數個數相同, 型態不同
		obj.getMethod("str3", 9999);
		
		// 傳入參數個數相同, 型態相同, 位置不同
		obj.getMethod(1111, "str4");
		
		// 也適用多個變數傳入
		obj.getMethod(3.14159, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
	}

	public void getMethod(String str) {
		System.out.println(str);
	}

	public void getMethod(String str, String msg) {
		System.out.println(str + ": " + msg);
	}

	public void getMethod(String str, int num) {
		System.out.println(str + ": " + num);
	}
	
	public void getMethod(int num, String str) {
		System.out.println(num + ": " + str);
	}
	
	public void getMethod(double g, int... num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println(g + ": " + sum);
	}
}
