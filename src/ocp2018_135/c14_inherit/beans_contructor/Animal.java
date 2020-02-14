/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c14_inherit.beans_contructor;

/**
 * <pre>
 * [SuperClass] 2020-02-15 00:47
 * - Cat 與 Dog 的父類別
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Animal {

	private String name;
	private String category;

	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
