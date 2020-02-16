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

import ocp2018_135.c23_thread.beans.SingleThreadCase;

/**
 * <pre>
 * [單執行序範例] 2019-09-08 14:25
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _SingleThreadCase {

	public static void main(String[] args) {
		caseRun();
	}

	public static void caseRun() {

		// 一個執行序
		SingleThreadCase tk = new SingleThreadCase();

		// 一個人做 4 件事
		Thread t1 = new Thread(tk);
		Thread t2 = new Thread(tk);
		Thread t3 = new Thread(tk);
		Thread t4 = new Thread(tk);

		// 開始搶
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
