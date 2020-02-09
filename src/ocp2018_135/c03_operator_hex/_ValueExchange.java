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
 * [數值互換] 2019-08-17 10:29
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ValueExchange {

	public static void main(String[] args) {
		
		// Test 1
		int a8 = 11;
		int b8 = 7;
		System.out.println("Method1: 多用一個參數, 相互賦值");
		System.out.printf("互換前\ta8: %d,\tb8: %d\n", a8, b8);
		int temp = a8;
		a8 = b8;
		b8 = temp;
		System.out.printf("互換後\ta8: %d,\tb8: %d\n\n", a8, b8);
		
		// Test 2
		int x9 = 11;
		int y9 = 7;
		System.out.println("Method2: 利用值差, 相互賦值");
		System.out.printf("互換前\tx9: %d,\ty9: %d\n", x9, y9);
		x9 = x9 + y9; // 19
		y9 = x9 - y9; // 11
		x9 = x9 - y9; // 7
		System.out.printf("互換後\tx9: %d,\ty9: %d\n\n", x9, y9);
		
		// Test 3
		int i = 11;
		int j = 7;
		System.out.println("Method3: 改寫 Method2 利用值差, 相互賦值");
		System.out.printf("互換前\ti: %d,\tj: %d\n", i, j);
		i = i + j - (j = i);
		System.out.printf("互換後\ti: %d,\tj: %d\n", i, j);
		System.out.println("\n");
	
		// Test 4
		int c = 12;
		int d = 10;
		System.out.println("Method4: 利用 ^ 互換");
		System.out.printf("互換前\tc: %d,\td: %d\n", c, d);
		c = c ^ d; // c = 30
		d = c ^ d; // d = 10
		c = c ^ d; // c = 20
		System.out.printf("互換後\tc: %d,\td: %d\n\n", c, d);
		
		// Test 5
		int q = 12;
		int w = 10;
		System.out.println("Method5: 利用 ^ 互換");
		System.out.printf("互換前\tq: %d,\tw: %d\n", q, w);
		q = (q = q ^ w) ^ (w = q ^ w);
		System.out.printf("互換後\tq: %d,\tw: %d\n\n", q, w);
		
		// Test 6
		int m = 12;
		int n = 10;
		System.out.println("Method6: 改寫 Method5");
		System.out.printf("互換前\tm: %d,\tn: %d\n", m, n);
		m = ( m ^= n ) ^ ( n ^= m );
		System.out.printf("互換後\tm: %d,\tn: %d\n\n", m, n);
		System.out.println("\n");
	}
}
