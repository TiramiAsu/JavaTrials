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

/**
 * <pre>
 * [屬性的繼承] 2019-08-20 21:01
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _InheritAttribute {

	public static void main(String[] args) {

		// Cano 是一位老師, 在教學時間之外, 他還一邊進修攻讀博士
		Person person = new Person();
		Teacher teacher = new Teacher();
		Student student = new Student();

		// 除了父類別屬性, 繼承的子類別也可以取得父類別屬性
		System.out.println(person.getName());
		System.out.println(teacher.getSex()); // 來自 Person
		System.out.println(student.getAge()); // 來自 Person

		/** 兩個子類別無法取得對方的屬性 */

		System.out.println(student.getJob()); // 自己本身屬性
//		System.out.println(t.getJob()); // Teacher 不可以取得 Student 的屬性
	}
}
