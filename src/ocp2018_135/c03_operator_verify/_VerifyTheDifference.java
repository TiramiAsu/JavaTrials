/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c03_operator_verify;

/**
 * <pre>
 * [驗證差異] 2019-08-17 10:53
 * - &,&& 差異
 * - |,|| 差異
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _VerifyTheDifference {

	/*
	 * [ & 與 && ]
	 * 
	 * & 判斷:
	 * 
	 *       3
	 *    1      2      Result     Number of judgments
	 *  true & true       true             3
	 *  true & false      true             3
	 * false & true      false             3
	 * false & false     false             3
	 * 
	 * 
	 * && 判斷:
	 * 
	 *        3
	 *    1       2    Result      Number of judgments
	 *  true && true     true              3
	 *  true && false    true              3
	 * false && true    false              1 (只要第一次判斷為 false, 第 2 次判斷不管 true 或 false 都是 false)
	 * false && false   false              1 (同上)
	 * 
	 * p.s. & 每種情況都需要判斷 3 次, && 在第 3, 4 種情況只需要判斷 1 次, 效率較好
	 */
	
	/* 
	 * || 判斷:
	 * 
	 *        3
	 *    1       2    Result      Number of judgments
	 *  true || true     true              1 (只要第一次判斷為 true, 第 2 次判斷不管 true 或 false 都是 true)
	 *  true || false    true              1 (同上)
	 * false || true     true              3
	 * false || false    false             3
	 * 
	 * p.s. |, || 情況與 &, && 相同
	 */

}
