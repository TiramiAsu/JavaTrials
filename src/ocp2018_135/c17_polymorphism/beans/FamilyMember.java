/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c17_polymorphism.beans;

/**
 * <pre>
 * [Bean] 2019-08-22 22:06
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public abstract class FamilyMember {
	
	public abstract void getHouse();
	
	public FamilyMember() {}
	
	public void getCar(String name) {
		System.out.println("Father's car. (" + name + ")");
	}
	
	public void getMoney(String money) {
		System.out.println("Father's " + money);
	}
}
