/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c26_lambda;

import java.util.Comparator;

/**
 * <pre>
 * [數字比較] 2019-09-09 22:04
 * - 比較兩個數字是否相等
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Compare {

	public static void main(String[] args) {
		Comparator<Integer> compare = (x, y) -> Integer.compare(x, y); // 相同回傳 0, 不相同回傳 -1
		int numEqual = compare.compare(100, 100);
		System.out.println("num is Equal? " + (numEqual == 0 ? "Yes" : "No"));
	}
}
