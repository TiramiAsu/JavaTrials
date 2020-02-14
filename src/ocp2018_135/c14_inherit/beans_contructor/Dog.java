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
 * [SubClass] 2019-08-20 21:54
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Dog extends Animal {

	private String likeDoing;

	public Dog(String name, String category, String likeDoing) {
		super(name, category);
		this.likeDoing = likeDoing;
	}

	public String getLikeDoing() {
		return likeDoing;
	}

	public void setLikeDoing(String likeDoing) {
		this.likeDoing = likeDoing;
	}

}
