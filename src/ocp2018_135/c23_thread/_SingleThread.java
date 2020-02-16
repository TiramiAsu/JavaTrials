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

import ocp2018_135.c23_thread.beans.SingleThread;

/**
 * <pre>
 * [單執行序] 2020-02-16 12:44
 * - 1 個人做 N 件事 -> 按序執行
 * - main-Thread 跑完換 demo-Thread
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _SingleThread {

	public static void main(String[] args) {
		singleThread();
	}
	
	public static void singleThread() {
		
		// main-Thread 執行
		for(int i = 100; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}

		// Thread-0 執行
		SingleThread demo = new SingleThread();
		demo.start();
	}
}
