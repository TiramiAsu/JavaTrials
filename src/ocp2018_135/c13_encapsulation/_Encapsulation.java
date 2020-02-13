/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c13_encapsulation;

/**
 * <pre>
 * [物件封裝] 2019-08-15 00:59
 * - 以 setter, getter 來封裝屬性, 建立其他物件的讀取權限
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Encapsulation {

	public static void main(String[] args) {

		BMI bmi = new BMI(60, 170);

//		System.out.println(bmi.calculateBmi(60, 170)); // 無法調用 private 方法
		System.out.println("(60:170): " + bmi.getBmi());

		// 改變 w, 可得到新的 bmi
		bmi.setW(70);
		System.out.println("(70:170): " + bmi.getBmi());
	}
}
