/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c06_utils;

/**
 * <pre>
 * [列舉] 2019-08-17 17:06
 * - 是一種參考型態, 可以用一個 class 的概念來理解它
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Enumeration {

	public static void main(String[] args) {

		/** enum 搭配 switch 使用 */

		Day nums = Day.saturday;

		// 如果是 saturday, sunday 都會顯示 "假日", 因為沒有 break 所以會直接往下執行(貫穿)
		switch (nums) {
		case monday:
			System.out.println("星期一");
			break;

		case saturday:
		case sunday:
			System.out.println("假日");
			break;

		case SUNDAY:
			System.out.println("星期天");
			break;
		}

		/** 外部連結 enum, 並建立回傳機制 */
		
		System.out.println(DrinkEnum.getEnum(5)); // 汽水
		System.out.println(DrinkEnum.WATER.getIndex()); // 2
		System.out.println(DrinkEnum.JUICE.getName()); // 果汁

	}

	// 概念有點像 inner class
	enum Day {
		// enum 項目, 類似 class 的屬性
		SUNDAY, sunday, monday, saturday
	}

	// Inner Class
	class InnerClassC07 {}
}
