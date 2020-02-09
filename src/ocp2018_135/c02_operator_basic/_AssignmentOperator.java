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
 * [賦值運算子] 2019-07-24 00:53
 * - 將變數賦予數值(給數值一個名稱)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _AssignmentOperator {

	public static void main(String[] args) {
		
	/* 使用 int */
		int x = 11;	// x 是 11(11 的值叫做 x)
		int y = 7;	// y 是 7(7 的值叫做 y)
		int temp = 0;
		
		// =: x 賦值給 temp
		System.out.println("temp 賦值前: " + temp);
		temp = x;
		System.out.println("temp 賦值後: " + temp + "\n");
		
		// +=: x 加上 y 的結果, 再賦值給 x
		print(x, y);
		x += y; // 等同 x = x + y;
		show("+=", x, y);
		
		// -=: x 減去 y 的結果, 再賦值給 x
		print(x, y);
		x -= y; // 等同 x = x - y;
		show("-=", x, y);
		
		// *=: x 乘上 y 的結果, 再賦值給 x
		print(x, y);
		x *= y; // 等同 x = x * y;
		show("*=", x, y);
		
		// /=: x 除以 y 的結果, 再賦值給 x
		print(x, y);
		x /= y; // 等同 x = x / y;
		show("/=", x, y);
		
	/* 使用 double */
		caseDouble();
	}
	
	public static void print(int x, int y) {
		System.out.println("計算前 (x = " + x + ", y = " + y + ")");
	}
	
	public static void print(double x, double y) {
		System.out.println("計算前 (x = " + x + ", y = " + y + ")");
	}
	
	public static void show(String s, Object x, Object y) {
		System.out.println("x " + s + " y (x = " + x + ", y = " + y + ")\n");
	}
	
	public static void caseDouble() {
		System.out.println("-----------");
		int x = 11;
		int y = 7;
		String[] op = {"+=","-=","*=","/="};
		System.out.println("\nx = " + x + ", y = " + y + "\n");

 		for(int i = 0; i < op.length; i++) {
			double x1 = x;
			double y1 = y;
			print(x1, y1);
			switch (op[i]) {
				case "+=":
					x1 += y1; break;
				case "-=":
					x1 -= y1; break;
				case "*=":
					x1 *= y1; break;
				case "/=":
					x1 /= y1; break;
			}
			show(op[i], x1, y1);
		}
	}
}
