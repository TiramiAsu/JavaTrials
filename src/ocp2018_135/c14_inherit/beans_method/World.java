/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c14_inherit.beans_method;

/**
 * <pre>
 * [SuperClass] 2019-08-20 22:04
 * - Ocean 與 Land 的父類別
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class World {

	private String name;
	
	public World() {}

	public World(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getAir() {
		System.out.println("Air from World");
	}

	public void getWater() {
		System.out.println("Water from World");
	}

	/**
	 * 
	 * <pre>
	 * [取得空間] 2020-02-14 18:44
	 * </pre>
	 * 
	 * @author TiramiAsu(email)
	 * @deprecated 新方法在 Land.java 中
	 */
	@Deprecated
	public void getSpace() {
		System.out.println("Ancient Space");
	}
}
