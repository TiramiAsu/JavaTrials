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
 * [用陣列計算最大、最小、總和、平均] 2019-08-01 22:59
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _ArrayCalculate {

	public static void main(String[] args) {

		/** 求最大、最小、總和、平均 */
		
		int[] arr = { 2, 3, 4, 1, 6 };
		int max = 0;
		int min = arr[0];
		int sum = 0;

		// max
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		showPrint("max", max);

		// min
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		showPrint("min", min);

		// sum
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		showPrint("sum", sum);

		// avg
		double avg = (double) sum / arr.length;
		showPrint("avg", avg);
	}

	public static void showPrint(String s, Object var) {
		System.out.println("Array{2, 3, 4, 1, 6}, " + s + ": " + var);
	}

}
