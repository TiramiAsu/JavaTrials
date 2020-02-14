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
 * [SubClass] 2019-08-20 22:09
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Ocean extends World {

	private String liveAnimal = "fish";

	public Ocean() {}

	public Ocean(String name) {
		super(name);
	}

	public Ocean(String name, String liveAnimal) {
		super(name);
		this.liveAnimal = liveAnimal;
	}

	public String getLiveiveAnimal() {
		return liveAnimal;
	}

	public void setLiveiveAnimal(String liveAnimal) {
		this.liveAnimal = liveAnimal;
	}

	// 同名方法
	@Override
	public void getWater() {
		System.out.println("Water from Ocean");
	}

	// 非同名方法
	public void getOceanAnimals() {
		System.out.println("Hello Ocean Animals");
	}
}
