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
 * [動物] 2019-08-29 23:25
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Animal<T> {

	private T t; // 自訂屬性, T 可以定義成任意的參考型態

	public Animal(T t) {
		this.t = t;
	}

	public void getTType() {
		System.out.println("T 的型態是: " + t.getClass().getName());
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
