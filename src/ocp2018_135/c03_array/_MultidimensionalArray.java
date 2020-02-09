/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c03_array;

/**
 * <pre>
 * [多維陣列] 2019-07-26 00:16
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _MultidimensionalArray {

	public static void main(String[] args) {
		
		// 多維陣列宣告
		int[][] arrays1 = {{2, 5},  // 第 1 個陣列
						   {9, 7},  // 第 2 個陣列
						   {8, 6},  // 第 3 個陣列
						   {1, 0}}; // 第 4 個陣列
		
		int arrays2[][] = {{2, 5},
						   {9},
						   {8, 6, 3},
						   {1, 0}};
		
		// 取得陣列元素
		// arrays1
		System.out.println("arrays1[0][0]: " + arrays1[0][0]); // 第 1 個陣列.第 1 個元素
		System.out.println("arrays1[0][1]: " + arrays1[0][1]); // 第 1 個陣列.第 2 個元素
		
		System.out.println();
		
		System.out.println("arrays1[1][0]: " + arrays1[1][0]); // 第 2 個陣列.第 1 個元素
		System.out.println("arrays1[1][1]: " + arrays1[1][1]); // 第 2 個陣列.第 2 個元素
		
		System.out.println();
		
		System.out.println("arrays1[2][0]: " + arrays1[2][0]); // 第 3 個陣列.第 1 個元素
		System.out.println("arrays1[2][1]: " + arrays1[2][1]); // 第 3 個陣列.第 2 個元素
		
		System.out.println();
		
		System.out.println("arrays1[3][0]: " + arrays1[3][0]); // 第 4 個陣列.第 1 個元素
		System.out.println("arrays1[3][1]: " + arrays1[3][1]); // 第 4 個陣列.第 2 個元素
		
		System.out.println("\n-------\n");
		
		// arrays2 亦同
		System.out.println("arrays2[0][0]: " + arrays2[0][0]);
		System.out.println("arrays2[0][1]: " + arrays2[0][1]);
		
		System.out.println();
		
		System.out.println("arrays2[1][0]: " + arrays2[1][0]);
		
		System.out.println();
		
		System.out.println("arrays2[2][0]: " + arrays2[2][0]);
		System.out.println("arrays2[2][1]: " + arrays2[2][1]);
		System.out.println("arrays2[2][2]: " + arrays2[2][2]);
		
		System.out.println();
		
		System.out.println("arrays2[3][0]: " + arrays2[3][0]);
		System.out.println("arrays2[3][1]: " + arrays2[3][1]);
	}
}
