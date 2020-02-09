/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c03_operator_hex;

/**
 * <pre>
 * [位元運算子] 2019-08-17 10:27
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _BitwiseOperator {

	public static void main(String[] args) {
		/* >>, << */
		int num = 10;
		System.out.println("num = " + num + " (2進制: " + Integer.toBinaryString(num) + ")");

 		int numL2 = num << 2;
		int numR1 = num >> 1;

 		System.out.printf("%s\t(2進制: %6s)%n%s\t(2進制: %6s)\n",
				"num << 2, numL2 = " + numL2, Integer.toBinaryString(numL2),
				"num >> 1, numR1 = " + numR1, Integer.toBinaryString(numR1));
		
 		System.out.println();
 		
 		/* XOR, OR */
		int a = 12;
		int b = 10;
		System.out.printf("a = %d\t\t(2進制: %6s)\na = %d\t\t(2進制: %6s)\n",
				a,Integer.toBinaryString(a),
				b,Integer.toBinaryString(b));
		
		System.out.println();
		
		System.out.printf("a ^ b = %2s\t(2進制: %6s)%na | b = %2s\t(2進制: %6s)\n",
				a ^ b, Integer.toBinaryString(a ^ b),
				a | b, Integer.toBinaryString(a | b));
		
		System.out.println();
		
		/* &: and */
		// 一階
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		// 二階
		System.out.println("\n" + (12<22 & 15>2));
		
		// 三階
		// 以此類推，可一直判斷下去...
		
		/* XOR */
		int a7 = 10, b7 = 20;
		System.out.println("Ori: " + a7 + ":" + b7);
		
		System.out.println();
		
		/* 二進制
		 * 
		 * 10: 01010
		 * 20: 10100
		 * -------------- ^ 之後
		 *     11110 : 30
		 * 
		 * XOR( ^ ): (相同為 0, 不相同為 1)
		 *  OR( | ): (兩個 0 為 0, 其餘有 1 為 1)
		 * 
		 */
		System.out.println("(10 ^ 20): " + (10 ^ 20));
		
	}
}
