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
 * [列舉] 2019-08-17 17:32
 * - 建立一個共用 Enumeration, 可以獨立寫一個 .java
 * 1. 每個列舉中的參數, 必須對應相對的屬性
 * 2. 對應屬性外, 也必須對應建構子的建構順序
 * 3. 建構子必須是 private
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public enum DrinkEnum {

	// 先 name 再 index
	COFFEE("咖啡", 1), WATER("水", 2), JUICE("果汁", 3), TEA("茶", 4), SODA("汽水", 5), SPIRIT("雪碧", 6);

	private String name;
	private int index;

	// 建構子對應, 先 name 再 index
	private DrinkEnum(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public static String getEnum(int index) {

		// 使用 forEach, 依序取得 DrinkEnum 列舉裡的每個元素
		for (DrinkEnum e : DrinkEnum.values()) {
			// 若 index 相符，就回傳對應的 item
			if (e.getIndex() == index) {
				return e.name;
			}
		}
		return null;
	}

	/** setter, getter */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
