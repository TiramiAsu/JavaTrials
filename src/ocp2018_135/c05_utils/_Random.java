/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c05_utils;

/**
 * <pre>
 * [隨機] 2019-07-28 02:59
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Random {

	public static void main(String[] args) {
		
		// 使用 Math.random() 產生隨機的值，是從 0 到 1 (不包含1) 的浮點數
		double random = Math.random();
		
		// 將 0~1 之間的浮點數 *10 + 1 變成在 1~10 之間 Random
		int num = (int)(random * 10 + 1); // 1~10
		
		// 輸出結果
		System.out.println("random: " + random);
		System.out.println("   num: " + num);
	}
}
