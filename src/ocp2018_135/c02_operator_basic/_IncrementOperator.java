/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c02_operator_basic;

/**
 * <pre>
 * [遞增運算子] 2019-07-24 21:12
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _IncrementOperator {

	public static void main(String[] args) {
		
		// i++, ++i 差別
		int i = 0, j = 7;

 		// println
		System.out.println("i++ 前, i = " + i);	// i = 0
		System.out.println("i++ 時, i = " + i++);	// i = 0
		System.out.println("i++ 後, i = " + i);	// i = 1

		System.out.println("\n----------\n");
		
 		System.out.println("++j 前, j = " + j);	// j = 7
		System.out.println("j++ 時, j = " + ++j);	// j = 8
		System.out.println("++j 後, j = " + j);	// j = 8

		System.out.println("\n----------\n");

		// printf
		System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n",
				"i = " + i + ", j = " + j,
				"i++ : ", i++,
				"  i : ", i,
				"++j : ", ++j,
				"  j : ", j);
	}

}
