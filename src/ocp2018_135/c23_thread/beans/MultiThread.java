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
 * [週年慶-多執行序] 2019-09-05 23:00
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class MultiThread implements Runnable {

	// 有 3000 個週年慶商品
	private int goods = 3000;
	private boolean activity = false;
	
	@Override
	public void run() {
		activity = true; // 活動開始
		while(activity) {
			this.onSale();
		}
	}
	
	public void onSale() {
		
		// 當商品數量 > 0 就繼續搶
		if (goods > 0) {
			try {
				Thread.sleep(10); // 1000 millis = 1 second
				if ((goods >= 2950) || (goods <= 50)) { // 方便觀察
					System.out.println("大媽(" + Thread.currentThread().getName() + ") 搶了編號第 " + goods + " 號的商品");
				}
				goods--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			activity = false; // 活動結束
		}
	}
}
