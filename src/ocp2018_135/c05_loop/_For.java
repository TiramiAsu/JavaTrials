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
 * [for 迴圈] 2019-07-31 22:51
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _For {

	public static void main(String[] args) {
		
		// for (起點 ; 終點 ; 計算式) { }
		for(int i = 0; i < 5; i++) {
			System.out.print(i + "-");
		}
		
		System.out.println("\n");
		
		// i++ 或 ++i 都一樣，因為是迴圈執行後, 執行下一個迴圈前, 才會加1 (也可使用 +=, -=, *=, /=)
		for(int i = 0; i < 5; i++) {
			System.out.print(i + "+");
		}
		System.out.println();
		for(int i = 0; i < 5; ++i) {
			System.out.print("+" + i);
		}
		System.out.println("\n");
		
		// 無限迴圈: 因為沒有起點, 終點, 計算
		/*
		for(;;) {
			System.out.println("infinite");
		}
		*/
		
		/** 用 for 印出一維矩陣 */
		
		int arr[] = {10, 20, 30};
		
		// 正印
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "+");
		}
		System.out.println();
		
		// 反印
		for(int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i] + "-");
		}
		System.out.println("\n");
		
		// 使用 for 結合 swith 印出所有 case
		for(int i = 0; i < 5; i++){
			
			switch(i) {
			case 0:
				System.out.println("case 0");
				break;
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			}
			System.out.println("switch 結束: i=" + i);
		}
		System.out.println("for 結束");
	}
}
