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
 * [數字類異常] 2019-08-25 17:21
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _NumberException {

	public static void main(String[] args) {
		try {
			exceptionArithmetic();
		} catch (Exception ae) {
			ae.printStackTrace();
		}
	}
	
	public static void exceptionArithmetic() {
		int num = 10;
		System.out.println(num / 0); // 不能除以零
	}
}
