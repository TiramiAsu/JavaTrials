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

import java.util.Scanner;

/**
 * <pre>
 * [掃描器] 2019-07-28 03:07
 * - Scanner: 用於輸入資料與程式互動
 * - System.in: 於 console 輸入資料, 與程式互動
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Scanner {

	public static void main(String[] args) {
		
		// 顯示訊息
		System.out.print("請猜1~10: ");
		
		// 建立 Scanner
		Scanner scanner = new Scanner(System.in);
		int ans = 4;
		
		// 將輸入值存成 guess 的變數裡
		int guess = scanner.nextInt();
		
		// 若猜到的數字等於 4, 則跳出迴圈結束遊戲
		while(ans != guess) {
			System.out.print("guess again: ");
			guess = scanner.nextInt();
		}
		
		// 使用完要關閉 Scanner
		scanner.close();
		System.out.println("The number is " + ans + " !!");
		System.out.println("Game Over...");
	}
}
