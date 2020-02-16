/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c23_thread;

import ocp2018_135.c23_thread.beans.MultiThreadSync;

/**
 * <pre>
 * [多執行序 + 同步(鎖)] 2019-09-05 23:53
 * - N 個人做 1 件事 -> 不按序執行, 每次拿的資源都不一樣
 * - 資訊同步(一次只有一個執行序可以操作, 操作完再換下一個執行序, 執行效率不佳)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _MultiThreadSync {

	public static void main(String[] args) {
		caseRun();
	}

	public static void caseRun() {

		// 週年慶商品
		MultiThreadSync goods = new MultiThreadSync();

		// 4 個 大媽搶週年慶的商品
		Thread bigMaMa1 = new Thread(goods);
		Thread bigMaMa2 = new Thread(goods);
		Thread bigMaMa3 = new Thread(goods);
		Thread bigMaMa4 = new Thread(goods);

		// 開始搶
		bigMaMa1.start();
		bigMaMa2.start();
		bigMaMa3.start();
		bigMaMa4.start();
	}
}
