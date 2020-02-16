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

/**
 * <pre>
 * [Lambda Expression] 2019-09-09 22:04
 * - 函數箭頭左邊: 傳入值
 * - 函數箭頭右邊: 動作
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class __Lambda {

	public static void main(String[] args) {

		/** 使用 Runnable */

		// 每次 new Runnable() 都必須實作並覆寫 .run()
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable");
			}
		};
		runnable.run();

		/** 使用 Runnable, 以 Lumbda 表達式實作 */

		// 由於只需要覆寫一個方法, 所以可使用 Lumbda 簡化寫法
		// .run() 無傳入值, 以 "()" 表示寫在箭頭左邊, 實作方法是要印出 "Runnable Lumbda", 所以寫在箭頭右邊
		Runnable runnableLumbda = () -> System.out.println("Runnable Lumbda");
		runnableLumbda.run();
	}
}
