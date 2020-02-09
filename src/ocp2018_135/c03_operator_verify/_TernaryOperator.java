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
 * [三元運算子] 2019-08-17 10:37
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _TernaryOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// 基本用法
		boolean tf = (10 > 5) ? true : false;
		System.out.println("(10 > 5): " + tf);

		// 一階
		 System.out.println((10 > 5) ? "true" : "false");
		
		// 二階
		 System.out.println((10 > 5) ? ((5 > 8) ? "true-1" : "false-1") : ((7 > 4) ? "true-2" : "false-2"));
		
		// 可以使用很多層判斷, 避免過多層判斷(太複雜, 不易閱讀)
		
	}
}
