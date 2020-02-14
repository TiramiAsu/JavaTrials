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
 * [Sub Class] 2019-08-20 22:16
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Land extends World {

	public Land() {}

	public Land(String name) {
		super(name);
	}

	@Override
	public void getSpace() {
		System.out.println("Modern Space");
	}
}
