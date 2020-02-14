/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c15_object;

/**
 * <pre>
 * [存取修飾子] 2019-08-21 20:30
 * 
 * [繼承與存取修飾子]
 * +-----------------+----------+--------------+-------------------+----------+
 * | Access Modifier | in Class | Same package | Different package | SubClass |
 * +-----------------+----------+--------------+-------------------+----------+
 * | - private       |     o    |       x      |          x        |     x    |
 * | ~ (default)     |     o    |       o      |          x        |     x    |
 * | # protected     |     o    |       o      |      o(extend)    |     o    |
 * | + public        |     o    |       o      |          o        |     o    |
 * +-----------------+----------+--------------+-------------------+----------+
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _AccessModifier {

	public static void main(String[] args) {
		System.out.println(new SubBean("TiramiAsu", "xx市oo區", "無", "21", "Harry Potter"));
	}
}
