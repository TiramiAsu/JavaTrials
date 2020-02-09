/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c02_primitive_type;

/**
 * <pre>
 * [基本型態] 2019-07-24 00:10
 * - 整數類: byte, short, int(default), long
 * - 浮點數類: float, double(default)
 * - 字元類: char
 * - 布林類: boolean
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _PrimitiveType {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// 整數類
		byte _byte = 20;
		short _short = 52;
		int _int = 66;
		long _long = 45L; // 使用"大寫 L" 或 "小寫 l" 表示, 避免混淆, 使用建議使用 "大寫 L"

		// 浮點數類
		float _float = 52.5F; // 使用"大寫F" 或 "小寫 f" 表示
		double _double = 8.2;

		// 字元類
		char _character = 'j';
		String _string = "cat"; // String 屬於參考型態

		// 布林類
		boolean _boolean = true;

		/** 使用 System.out.println(); 輸出結果 */
		
		System.out.println(_byte); // 20
		System.out.println(_character); // j
		System.out.println(_string); // cat
		System.out.println(_long); // 45
		
		System.out.println();
		
		// 'j' 的 ASCII Code 是 106
		System.out.println(_byte + _character); // 126
		System.out.println(_byte + _character + _string); // 126cat
		System.out.println(_byte + _character + _string + _long + "\n"); // 126cat45
		
		// float 單精度浮點數: 從小數點後 7 位(含小數點)
		getFloat();

 		// double 雙精度浮點數: 從小數點後 14 位(含小數點)
		getDouble();

 		// char 與 ASCII code
		getChar();

 		// 基本型態四則運算
		getArithmetic();

 		// 超出基本型態範圍問題
		getRange();
		
	}
	
	// float - 單精度浮點數: 從小數點後7位(含小數點)
	public static void getFloat() {
		float a = 123.123456789F;
		float b = 123456.123456789F;
		System.out.println("單精度只到小數點後4位 (從頭算7位)");
		System.out.println(a + "\n");	// 123.12346
		System.out.println("單精度只到小數點後2位 (整數越長，有些小數會消失)");
		System.out.println(b + "\n\n");	// 123456.125
	}

 	// double - 雙精度浮點數: 小數點後14位(含小數點)
	public static void getDouble() {
		double a = 123.1234567890123456789;
		double b = 123456789.1234567890123456789;
		System.out.println("雙精度只到小數點後13位");
		System.out.println(a + "\n");	// 123.12345678901235
		System.out.println("雙精度只到小數點後7位，超過一定位數會轉換成科學符號\n" + "(1.2345678912345679E8 = 1.2345678912345679 * 10^8)");
		System.out.println(b + "\n\n");	// 1.2345678912345679E8
	}

 	// char 與 ASCII code
	public static void getChar() {
		char z = 'a';
		char x = 97;
		System.out.println("\'a\': " + z);	// 'a': a
		System.out.println(" 97: " + x);	//  97: a
		System.out.println("\n");
	}

 	// 基本型態四則運算問題
	public static void getArithmetic() {
		byte a = 12;
		byte b = 100;
		byte c1 = (byte) (a + b); // 先計算再轉型
		int c2 = a + b;
		System.out.println("byte: " + c1); // byte: 112
		System.out.println(" int: " + c2); //  int: 112
		System.out.println("\n");
	}

 	// 超出基本型態範圍問題
	public static void getRange() {
		byte a = 100;
		byte b = 120;
		byte c = (byte) (a + b); // 100 + 120 = 220 -> 220 - 128 (含 1 個 0 ) = 92 -> 92 + (-128) = -36
		System.out.println("(byte)(a + b) = " + c); // -36
		System.out.println("\n");
	}
}
