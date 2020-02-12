/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c11_object;

/**
 * <pre>
 * [多個變數傳入] 2019-08-10 00:28
 * - 是使用無限循環的方式得知有多少傳入值
 * 
 * [限制]
 * 1. 除了多變數傳入外, 還可以傳入其他的變數, 這時多變數傳入要放在最後面
 * 2. 不可以使用 2 組多變數傳入, 最多使用一種
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _MultipleVariableIncoming {

	public static void main(String[] args) {
		
		double d1 = 10.1;
		double d2 = 20.0;
		double d3 = 30.3;
		double d4 = 40.5;
		
		// 只使用多變數傳入
		getAverage(d1, d2, d3, d4);
		
		// 除了多變數傳入外, 還可以傳入其他的變數, 這時多變數傳入要放在最後面
		getAverage("total", 17, d1, d2, d3, d4);
	}
	
	public static void getAverage(double... numbers) {
		
		double total = 0.0;
		for(double d : numbers) {
			total += d;
		}
		System.out.println(total);
	}
	
	public static void getAverage(String msg, int num, double... numbers) {
		
		double total = 0.0;
		for(double d : numbers) {
			total += d;
		}
		total += num;
		System.out.printf("%s: %.2f\n", msg, total);
	}
	
	// 不可以使用 2 組多變數傳入, 最多使用一種
//	public static void getAverage(int... num, double... numbers) {} // 出錯
}
