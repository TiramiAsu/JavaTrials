/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c08_array;

/**
 * <pre>
 * [二維陣列] 2019-08-06 00:30
 * - 1. 基本型態: Stack 區 的記憶體位置(arrA, arrB)
 * - 2. 參考型態: Heap 區 的值儲存位置({1, 2, 3}, {4, 5, 6})
 * 
 * [Sample]
 * - arrA = arrB; -> 代表 arrA 指向 arrB 的 heap 區(都指向{4,5,6})，所以 arrB 一改，arrA 就跟著改
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _MultidimensionalArray {

	/*
	 * index:
	 *    1  2  3
	 * 0 [ ][ ][ ]
	 * 1 [ ][ ]
	 */
	public static void main(String[] args) {
		
	/*
	 * [二維陣列宣告]
	 * - 第一個維度要先 new
	 * - 再 new 第二個維度
	 */
		int[][] multiArrA = new int[2][]; // 第一個維度要先寫
		
		multiArrA[0] = new int[3];
		multiArrA[1] = new int[2];
//		multiArrA[1] = {{33}, {74}}; // 無法這樣設定
		
		multiArrA[0][1] = 54;
		multiArrA[0][0] = 44;
		multiArrA[0][2] = 9;
		
		printArray2D(multiArrA);
		
		int[][] multiArrB = {
			{21, 33, 15, 18, 55},
			{35, 96},
			{13, 57, 23, 11}};
		
		printArray2D(multiArrB);
	}

	private static void printArray2D(int[][] array2D) {
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				System.out.printf("%d ", array2D[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
