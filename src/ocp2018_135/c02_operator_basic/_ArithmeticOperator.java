/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c02_operator_basic;

/**
 * <pre>
 * [算術運算子] 2019-07-24 00:34
 * - 加減乘除
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ArithmeticOperator {

	public static void main(String[] args) {
		
		int x = 11;
		int y = 7;

 		// Addition
		byte xyAdd = (byte)(x+y); // 18

 		// Subtraction
		byte xySub = (byte)(x-y); // 4

 		// Multiplication
		byte xyMult = (byte)(x*y); // 77

 		// Division
		int xyDiv0 = x/y;						// 1
		double xyDiv1 = x/y;					// 1.000000
		double xyDiv2 = (double)(x/y);			// 1.000000
		double xyDiv3 = (double)x/y;			// 1.571429
		double xyDiv4 = x/(double)y;			// 1.571429
		double xyDiv5 = (double)x/(double)y;	// 1.571429

 		System.out.printf("%s\n\n%s\n%s%d\n%s%d\n%s%d\n",
				"x = " + x + ", y = " + y,
				"Addtion, Subtraction, Multiplication:",
				"(byte)(x+y) = ", xyAdd,
				"(byte)(x-y) = ", xySub,
				"(byte)(x*y) = ", xyMult);
		System.out.printf("\n%s\n%s%d\n%s%f\n%s%f\n%s%f\n%s%f\n%s%f\n",
				"Division:",
				"         x/y is int    = ", xyDiv0,
				"         x/y is double = ", xyDiv1,
				"(double)(x/y)          = ", xyDiv2,
				" (double)x/y           = ", xyDiv3,
				"         x/(double)y   = ", xyDiv4,
				" (double)x/(double)y   = ", xyDiv5);
		System.out.println();
	}
}
