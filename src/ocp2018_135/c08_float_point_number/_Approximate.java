/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c08_float_point_number;

/**
 * <pre>
 * [浮點數近似處理] 2019-08-06 00:30
 * - 由於計算的時候會轉成二進制, 二進制無法準確地表示 1/10, 所以計算浮點數時會產生誤差
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Approximate {

	public static void main(String[] args) {
		
		double a = 1.0;

		// 從減去第三次 0.1 開始丟失精度
		System.out.println(a - 0.1);
		System.out.println(a - 0.1 - 0.1);
		System.out.println(a - 0.1 - 0.1 - 0.1);
		System.out.println(a - 0.1 - 0.1 - 0.1 - 0.1);

		// 但是除了 0.1 的浮點數計算是沒問題的
		System.out.println(a - 0.2);
		System.out.println(a - 0.3);
	}

}
