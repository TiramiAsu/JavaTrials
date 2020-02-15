/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c22_collection.beans;

/**
 * <pre>
 * [女性] 2020-02-16 01:23
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Female implements Human {

	@Override
	public void eating() {
		System.out.println("dessert");
	}

	@Override
	public void thinking() {
		System.out.println("little opera");
	}

	@Override
	public String toString() {
		return "Female";
	}
}
