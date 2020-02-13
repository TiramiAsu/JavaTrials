/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c13_object;

/**
 * <pre>
 * [型態] 2020-02-14 01:06
 * 1. 基本型態
 * 2. 參考型態 - 物件記憶體位置
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ReferenceType {

	/* 
	 *  autoboxing    unboxing
	 * -基本型態     -參考型態：與基本型態相對應(基本上是 Class-首字母大寫)
	 *  byte          Byte
	 *  short         Short
	 *   int          Integer
	 *  long          Long
	 * 
	 *  float         Float
	 *  double        Double
	 * 
	 *  char          Character
	 * 
	 *  boolean       Boolean(True, False)
	 * 
	 * (stack)        (heap)
	 * -不可自訂型態  -可自訂型態
	 * -系統釋放      -Garbage Collection 回收
	 * 
	 * -放置於方法內  -放於 Class 內跟方法外
	 * -無安全修飾子  -private, (default), protected, public (保密等級由大排到小)
	 * -直接使用      -需事先建立(以 new 的方式)
	 */
	public static void main(String[] args) {

		/** 參考型態 */

		// 參考型態(物件) 使用 new 來建構
		Person p1 = new Person();

		// 參考型態要用同一種型態來接
		// 因為用 getPerson()方法中又 new 了一個新的物件, 所以 p1, p2 記憶體位置不同(不同物件)
		Person p2 = p1.getPerson();
		System.out.println("=== 以上為物件解說的輸出資訊 ===\n");

		/** 物件記憶體位置 (Hash-Code) */

		// Hash-Code: 記憶體位置轉成的一個序列
		// p1, p2 的 Hash-Code
		System.out.printf("p1 的 Hash-Code: %d\n", p1.hashCode());
		System.out.printf("p2 的 Hash-Code: %d\n", p2.hashCode());
		
		System.out.println();

		// 2進制 Hash-Code
		System.out.printf(Integer.toBinaryString(p1.hashCode()) + "\n");
		System.out.printf(Integer.toBinaryString(p2.hashCode()));
		System.out.printf("\n2進制 Hash-Code\n p1: %h\n p2: %h\n\n",
				Integer.toBinaryString(p1.hashCode()),
				Integer.toBinaryString(p2.hashCode()));

		// 10進制 Hash-Code
		System.out.printf(Integer.toHexString(p1.hashCode()) + "\n");
		System.out.printf(Integer.toHexString(p2.hashCode()));
		System.out.printf("\n10進制 Hash-Code\n p1: %h\n p2: %h\n\n",
				Integer.toHexString(p1.hashCode()),
				Integer.toHexString(p2.hashCode()));

		// 16進制 Hash-Code
		System.out.printf(Integer.toOctalString(p1.hashCode()) + "\n");
		System.out.printf(Integer.toOctalString(p2.hashCode()));
		System.out.printf("\n16進制 Hash-Code\n p1: %h\n p2: %h\n",
				Integer.toOctalString(p1.hashCode()),
				Integer.toOctalString(p2.hashCode()));
	}
}
