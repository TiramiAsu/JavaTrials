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
 * [Bean] 2019-08-22 22:07
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Brother extends FamilyMember {

	@Override
	public void getHouse() {
		// 兒子買了房子
		System.out.println("Son buy a House.");
	}
	
	public void getPhone(String name) {
		System.out.println("Son's " + name);
	}
	
	@Override
	public void getMoney(String money) {
		System.out.println("Son's " + money);
	}

}
