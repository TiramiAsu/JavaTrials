/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c01_console;

/**
 * <pre>
 * [Class 基本結構] 2019-07-23 23:40
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@SuppressWarnings("unused")
public class __ClassDemo {

	// 屬性
	private int classAttribute;

	// 常數
	public final double PI = Math.PI;

	// 建構子
	public __ClassDemo(int number) {
		this.classAttribute = number;
	}

	// 主方法(main方法): 是一種 執行序(Thread)
	/** - 這是 main方法 */
	public static void main(String[] args) {}

	// static 方法
	/** - 這是 static 方法 */
	public static void staticMethod() {
		// 型態, 運算子, 迴圈, 判斷式等
	}

	// 一般方法
	/** - 這是一般方法 */
	public void normalMethod() {
		// 型態, 運算子, 迴圈, 判斷式等
	}

	/**
	 * - 在裡面的 Inner Class 可以有安全修飾子，外面呼叫時可以 new
	 */
	class InnerClass_In {}

}

/**
 * 在 ClassDemo 外面的 Inner Class 沒有安全修飾子，限 ClassDemo 使用
 */
class InnerClass_Out {}
