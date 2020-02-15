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
 * [貓] 2019-08-29 23:28
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Cat<T> extends Animal<T> {

	public Cat(T t) {
		super(t);
	}
}
