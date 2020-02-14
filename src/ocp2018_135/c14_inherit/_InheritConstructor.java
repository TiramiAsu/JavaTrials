/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c14_inherit;

import ocp2018_135.c14_inherit.beans_attribute.Person;
import ocp2018_135.c14_inherit.beans_attribute.Student;
import ocp2018_135.c14_inherit.beans_attribute.Teacher;
import ocp2018_135.c14_inherit.beans_contructor.Cat;
import ocp2018_135.c14_inherit.beans_contructor.Dog;
import ocp2018_135.c14_inherit.beans_method.Land;

/**
 * <pre>
 * [建構子的繼承] 2019-08-20 21:55
 * - 當有自定義建構子時, 就無法使用空參數建構子(除非父類別有特別寫出空參數建構子, 子類別才可使用空參數建構子)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _InheritConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/** (父)空參數建構子, (子)空參數建構子 or 自定義建構子 */

		Person p = new Person();
		Teacher t = new Teacher();
		Student s = new Student("study");

		/** (父)自定義建構子, (子)自定義建構子 */

//		Dog dog = new Dog(); // 父類別無此建構子
		Dog dog = new Dog("小拉", "拉不拉多", "奔跑");

//		Cat cat = new Cat(); // 父類別無此建構子
		Cat cat = new Cat("小藍", "藍貓");

		/** (父)空參數建構子 and 自定義建構子, (子)空參數建構子 or 自定義建構子 */

		Land land = new Land();          // (子)空參數建構子
		Land newLand = new Land("新大陸"); // (子)自定義建構子
	}
}
