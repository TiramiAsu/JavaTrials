/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c07_array_sort;

/**
 * <pre>
 * [排序] 2019-08-01 23:24
 * 1. 求最大、最小、總和、平均
 * 2. 複製、反轉
 * 3. 排序(泡沫排序法、選擇排序法)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ArraySort {

	public static void main(String[] agrs) {

		/** 泡沫排序法 */
		
		// 若由小排到大, 鄰近的兩個元素比大小, 較大的元素換到右邊, 反覆的比較後, 最大的元素會在最右邊
		int[] arrA = { 5, 8, 6, 9, 2, 4, 1, 5 };
		System.out.print("ori: ");
		showPrint(arrA);

		// 確定數量
		int ok = 0;

		while (ok < arrA.length) {
			for (int i = 0; i < arrA.length - ok; i++) {
				// 因為陣列 index 跟 length 長度差 1，所以不可以等於 i + 1
				if (i + 1 == arrA.length) {
					// 用 break 跳出迴圈
					break;
				}
				// 比較後, 若左大右小, 則換位置
				if (arrA[i] > arrA[i + 1]) {
					int temp = arrA[i + 1];
					arrA[i + 1] = arrA[i];
					arrA[i] = temp;
				}
			}
			ok++;
		}
		System.out.print("new: ");
		showPrint(arrA);

		// 選擇排序法
		// 若由小排到大, 將陣列的最小值找出, 放到另一個陣列, 逐一找出、放到另一個陣列, 完成排序
		// 使用參考型態較易實作
	}

	public static void showPrint(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
