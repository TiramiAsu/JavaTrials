/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c03_operator_verify;

/**
 * <pre>
 * [相等性及關係運算子] 2019-07-24 21:58
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _EqualityAndRelationalOperator {

	public static void main(String[] args) {
		
		int x = 11;
		int y = 7;
		
		boolean b;
		
		// ==
		b = x==y; // 建議還是加上括弧較易閱讀: b = (x == y);
		System.out.println("11 == 7: " + b);
		
		// !=
		b = (x != y);
		System.out.println("11 != 7: " + b);
		
		// >
		System.out.println(" 11 > 7: " + (x > y));
		
		// >=
		System.out.println("11 >= 7: " + (x >= y));
		
		// <
		System.out.println(" 11 < 7: " + (x < y));
		
		// <=
		System.out.println("11 <= 7: " + (x <= y));

	}
}
