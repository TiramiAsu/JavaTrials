/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c15_abstract;

/**
 * <pre>
 * [抽象類別] 2019-08-21 21:17
 * - 可選擇實作方法, 未實作的方法由之後繼承的 Class 實作
 * 1. 有方法頭，無方法體
 * 2. 關鍵字 abstract
 * 3. abstract 方法只能放在 abstract class 中
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Abstract {

	public static void main(String[] args) {
		TodoThird todo = new TodoThird("Anita", "F", 25);
		System.out.printf("Sex:%s , Age:%d\n%s",
				todo.getSex().equals("M") ? "Male" : "Female",
				todo.workGetAge(),
				todo.workGetName());
	}
}
