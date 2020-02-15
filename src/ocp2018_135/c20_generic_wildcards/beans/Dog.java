/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c20_generic_wildcards.beans;

/**
 * <pre>
 * [狗] 2019-08-29 23:31
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Dog<T> extends Animal<T> {

	public Dog(T t) {
		super(t);
	}
}
