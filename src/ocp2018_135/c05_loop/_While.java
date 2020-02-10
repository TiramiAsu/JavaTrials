/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c05_loop;

/**
 * <pre>
 * [while 迴圈] 2019-07-31 23:03
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _While {

	public static void main(String[] args) {
		
		int guess = 0;
		int ans = 7;
		
		// 假設從 0 開始 1 個 1 個猜
		System.out.println("請猜 1~10: ");
		while(ans != guess) {
			System.out.println("你猜的是: " + guess + ", 猜錯囉");
			guess++;
		}
		System.out.println("猜對了，答案是: " + guess);
	}
}
