/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c15_object;

/**
 * <pre>
 * [存取修飾子] 2020-02-15 02:44
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class SubBean extends SuperBean {

	// (子類別)屬性
	public String book;

	// (父類別)有空參數建構子, (子類別)才可以有空參數建構子
	public SubBean() {
	}

	// 僅單純建構自有屬性
	public SubBean(String book) {
		this.book = book;
	}

	/**
	 * [建構 SubBean 流程]
	 * - 此建構子將參數傳到(父類別)建構子建構好, 再繼承給(子類別)
	 * - 由於(父類別)有自定義建構子, 所以(子類別)可以直接用 super 的方式, 呼叫(父類別)的建構子來建構
	 */
	public SubBean(String name, String address, String note, String age) {
		super(name, address, note, age);
	}

	/**
	 * [建構 SubBean 流程]
	 * - 此建構子除了(父類別)建構所需的參數外, 還另外建構一個自有屬性 book
	 * p.s. super() 跟 this() 在建構子裡只能存在一個(兩個都要在建構子裡的第一行)
	 */
	public SubBean(String name, String address, String note, String age, String book) {
		this(name, address, note, age); // 指的是 subBean 自身的建構子
		this.book = book;
	}

	// 直接取得(父類別)屬性
	public void getVar() {
		System.out.println(name); // + public
		System.out.println(address); // ~ (default)
		System.out.println(note); // # protected
//		System.out.println(age);     // - private(X)
	}

	// 提供 toString() 也可以選擇 "父類別" 的屬性
	@Override
	public String toString() {
		return "SubBean [book=" + book +
				", address=" + address +
				", note=" + note +
				", name=" + name +
				"]";
	}
}
