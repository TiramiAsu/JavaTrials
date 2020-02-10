/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c06_array;

/**
 * <pre>
 * [陣列] 2020-02-10 16:00
 * - 提供大量同型態的內容存取(不同型態無法放在同一陣列中)
 * 1. Array 長度大小不可改變(除非另外設定)
 * 2. int 不賦值預設為 0
 * 3. value 可以重複，索引值(index)不可重複
 * 
 * [應用於]
 * 1. 求最大、最小、總和、平均
 * 2. 複製、反轉
 * 3. 排序(泡沫排序法、選擇排序法)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Array {

	public static void main(String[] args) {
		
		/** Array 宣告 */
		
		// 第一種方式
		int arr1[] = new int[5];
		arr1[0] = 20;
		arr1[1] = 31;
		arr1[3] = 63;
		arr1[4] = 84;
		showPrint(arr1);
		
		// 第二種方式
		int arr2[] = new int[]{10, 51, 38, 85, 11, 23};
		showPrint(arr2);
		
		// 第三種方式
		int arr3[] ={85, 11, 23, 10, 51, 38};
		showPrint(arr3);
	}
	
	public static void showPrint(int arr[]) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
