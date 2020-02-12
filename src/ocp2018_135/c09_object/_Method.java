/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c09_object;

/**
 * <pre>
 * [方法] 2019-08-09 22:41
 * 
 * [static method]
 * - static 只能呼叫 static (方法或屬性)
 * 
 * [general method]
 * - p.s. 可呼叫 static 方法
 * - 方法的使用, 依照傳入值與回傳值的有無, 大概分成五種:
 * - 1. have void,   no pass variable():           using about <5% (usually tiny calculate & print)
 * - 2. have void, have pass variable(int var):    using about 40%
 * - 3.   no void,   no pass veriable():           using about 40%
 * - 4.   no void, have pass variable(String str): using about 10% (usually using in API)
 * - 5. multiple variables incoming values
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Method {

	public static void main(String[] args) {
		
		/**
		 * [static method]
		 * - static 只能呼叫 static (方法或屬性), 可以直接呼叫
		 */
		static_Method();
//		getNoStaticMethod(); // call method failed by non-static
		
		/**
		 * [general method]
		 * - new 一個 Class(object) 後, 來呼叫使用一般方法
		 */
		_Method obj = new _Method();
		
		// 可呼叫 static 方法
//		obj.static_Method(); // _Method.static_Method();
		obj.nonStatic_Method();
		
		// 1. 無回傳值(void), 無傳入值()
		obj.void_nonIncomingValue();
		
		// 2. 無回傳值(void), 有傳入值(str)
		obj.void_IncomingValue("World");
		
		// 3. 有回傳值(int), 無傳入值()
		int var = obj.int_nonIncomingValue();
		System.out.println("回傳: " + var);
		
		// 4. 有回傳值(String), 有傳入值(str)
		String s = obj.string_IncomingValue("Java");
		System.out.println("回傳: " + s);
		
		// 5. 無回傳值(void), 多個變數傳入值(int ...)
		obj.void_multiIncomingValue(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	/** [static method] */
	
	// 有 static
	public static void static_Method() {
		System.out.println("取得 static 方法");
	}

	// 無 static
	public void nonStatic_Method() {
		System.out.println("取得沒有 static 方法(一般方法)");
	}
	
	/** [general method] */
	
	// 1. 無回傳值(void), 無傳入值()
	public void void_nonIncomingValue() {
		System.out.println("無回傳值(void), 無傳入值...");
	}
	
	// 2. 無回傳值(void), 有傳入值(str)
	public void void_IncomingValue(String str) {
		System.out.println("無回傳值(void), 有傳入值(str): " + str);
	}
	
	// 3. 有回傳值(int), 無傳入值()
	public int int_nonIncomingValue() {
		int num = 7;
		return num;
	}
	
	// 4. 有回傳值(String), 有傳入值(str)
	public String string_IncomingValue(String str) {
		String s = "Hello ";
		return s + str;
	}
	
	// 5. 無回傳值(void), 多個變數傳入值(int ...)
	public void void_multiIncomingValue(int... num) {
		int sum = 0;
		for(int temp : num) {
			sum += temp;
		}
		System.out.println(sum);
	}
}
