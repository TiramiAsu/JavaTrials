/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c06_gui_enum;

/**
 * <pre>
 * [飲料列舉] 2019-08-17 17:32
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
