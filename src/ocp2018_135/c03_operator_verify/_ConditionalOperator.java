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
 * [條件運算子] 2019-07-24 21:33
 * - 判斷式
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ConditionalOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// AND(&&): 兩個條件成立, 才為 true, 其餘為 false
		System.out.println(" true && true : " + (true && true));
		System.out.println(" true && false: " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false: " + (false && false));
		
		System.out.println("\n---------------------\n");
		
		// OR(||): 有一個條件成立, 就為 true, 否則為 false
		System.out.println(" true || true : " + (true || true));
		System.out.println(" true || false: " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false: " + (false || false));
		
		System.out.println("\n---------------------\n");
		
		/* 三元運算子(Ternary Operator)
		 * - 語法: (判斷式) ? true : false
		 */
		boolean b = (7 > 11) ? true : false;
		String s = (7 > 11) ? "Correct" : "Wrong";
		System.out.println("(7 > 11): " + s + " (" + b + ")");
	}
}
