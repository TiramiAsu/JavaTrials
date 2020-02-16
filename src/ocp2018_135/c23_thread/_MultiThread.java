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

import ocp2018_135.c23_thread.beans.MultiThread;

/**
 * <pre>
 * [多執行序] 2019-09-05 23:00
 * - N 個人做 1 件事 -> 不按序執行, 每次拿的資源都不一樣
 * - 資訊容易不同步(因為太多執行序同時操作)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _MultiThread {

	public static void main(String[] args) {
		caseRun();
	}

	public static void caseRun() {

		// 週年慶商品
		MultiThread goods = new MultiThread();

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
		// 出現負的? -> A 搶完印出 goods 後, 準備 goods-- 前, B 剛好執行完 goods--, 這樣 A goods-- 時就會變成減兩次
	}
}
