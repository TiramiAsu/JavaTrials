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

import java.util.function.Consumer;

/**
 * <pre>
 * [單一傳入值] 2019-09-09 22:04
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _OneIncoming {

	public static void main(String[] args) {

		// 原寫法
		Consumer<String> consumerOri = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		consumerOri.accept("Hello");

		// 以 Lambda 簡化寫法
		Consumer<String> consumer = s -> System.out.println(s); // 只傳入1個參數，可以不用括弧
		consumer.accept("Tirami");
	}
}
