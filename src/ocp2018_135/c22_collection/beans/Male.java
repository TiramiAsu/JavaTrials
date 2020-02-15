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
 * [男性] 2020-02-16 01:24
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Male implements Human {

	@Override
	public void eating() {
		System.out.println("tofu");
	}

	@Override
	public void thinking() {
		System.out.println("nothing");
	}

	@Override
	public String toString() {
		return "Male";
	}
}
