/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c26_lambda;

import java.util.Comparator;

/**
 * <pre>
 * [多個傳入值] 2019-09-09 22:04
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _MultiIncoming {

	public static void main(String[] args) {

		// 原寫法
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				Integer max = o1;
				if (max < o2) {
					max = o2;
				}
				return max;
			}
		};
		int maxOri = comparator.compare(100, 150);
		System.out.println("maxOri: " + maxOri);

		// 以 Lambda 簡化寫法-多行: 使用大括號
		Comparator<Integer> lambdaA = (o1, o2) -> {
			Integer max = o1;
			return max < o2 ? o2 : max;
		};
		int maxA = lambdaA.compare(700, 150);
		System.out.println("maxA: " + maxA);

		// 以 Lambda 簡化寫法-單行
		Comparator<Integer> lambdaB = (o1, o2) -> (o1 < o2 ? o2 : o1);
		int maxB = lambdaB.compare(700, 150);
		System.out.println("maxB: " + maxB);
	}
}
