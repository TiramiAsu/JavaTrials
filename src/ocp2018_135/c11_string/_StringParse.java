/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c11_string;

/**
 * <pre>
 * [String 型態轉換] 2020-02-13 01:58
 * 
 * [字串轉其他型態] - 參考型態都可以用
 * 1. Integer.parseInt(String)
 * 2. Double.parseDouble(String)
 * 3. ...
 * 
 * [其他型態轉字串] - 參考型態都可以用
 * 1. Integer.valueOf(num);
 * 2. ...
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _StringParse {

	public static void main(String[] args) {

		/** 字串轉其他型態 */

		// int
		String str2int = "1234567";
		int int1 = Integer.parseInt(str2int);
		Integer int2 = Integer.parseInt(str2int);
		System.out.println(int1);
		System.out.println(int2);

		// double
		String str2double = "3.14159";
		double d = Double.parseDouble(str2double);
		System.out.printf("%.2f\n", d);

		// boolean
		String str2Boola = "True";
		String str2Boolb = "true";
		String str2Boolc = "1";

		System.out.println(Boolean.parseBoolean(str2Boola));
		System.out.println(Boolean.parseBoolean(str2Boolb));
		System.out.println(Boolean.parseBoolean(str2Boolc) + "\n"); // false

		/** 其他型態轉字串 */

		double double2str = 987.654;
		System.out.println(Double.valueOf(double2str));
		int int2str = 654321;
		System.out.println(Integer.valueOf(int2str));

		// .toString() -> 轉換的型態必須是參考型態, 不能是基本型態
		Integer integer2str = 1234567;
		System.out.println(integer2str.toString());

		// "" -> 使用空字串, 讓整數直接變成字串
		System.out.println(double2str + "");
	}
}
