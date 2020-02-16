/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c23_thread.beans;

/**
 * <pre>
 * [週年慶-多執行序 + 同步(鎖)] 2019-09-05 23:53
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class MultiThreadSync implements Runnable {

	// 有 3000 個週年慶商品
	private int goods = 3000;
	private boolean activity = false;
	Object lock = new Object();
	
	@Override
	public void run() {
		activity = true;
		while(activity) {
			this.onSale();
		}
	}
	
	public void onSale() {
		
		// 每個 Thread 執行到一定的量, 就換另一個 Thread: 每個 bigMaMa 搶到一定的量就換另一個 bigMaMa 搶
		synchronized (lock) { // 同步鎖, 但效能不太好
			if (goods > 0) {
				try {
					Thread.sleep(10); // 1000 millis = 1 second
					System.out.println("大媽(" + Thread.currentThread().getName() + ") 搶了編號第 " + goods + " 號的商品");
					goods--;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				activity = false;
			}
		}
	}
}
