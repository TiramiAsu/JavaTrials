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
 * [陣列複製、反轉] 2019-08-01 23:15
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ArrayCopyReverse {

	public static void main(String[] args) {

		/** 複製 */
		
		int[] arrayA = { 123, 48, 15, 556, 2, 156, 1, 21, 6 };
		int[] arrayB = { 2, 3, 4, 1, 6 };

		System.out.println("arrayA ===");
		showPrint(arrayA);
		
		System.out.println("arrayB === 原");
		showPrint(arrayB);

		// 無論 arrayB 長短, 直接覆蓋掉, 變成 arrayA
		arrayB = arrayA;
		
		System.out.println("arrayB === 新");
		showPrint(arrayB);

		/** 陣列反轉 */
		
		System.out.println("反轉前 ===");
		showPrint(arrayA);
		for (int i = 0; i < arrayA.length / 2; i++) {
			// 排序互換
			int temp = arrayA[i];
			arrayA[i] = arrayA[arrayA.length - 1 - i];
			arrayA[arrayA.length - 1 - i] = temp;
		}
		System.out.println("反轉後 ===");
		showPrint(arrayA);

	}

	public static void showPrint(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
