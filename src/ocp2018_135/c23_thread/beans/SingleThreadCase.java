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
 * [週年慶-單執行序] 2019-09-08 14:25
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class SingleThreadCase extends Thread {

	// 有 100 個週年慶商品
	private int goods = 100;
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
		if (goods-- > 0) {
			System.out.println("大媽(" + Thread.currentThread().getName() + ") 搶了編號第 " + goods + " 號的商品");
		} else {
//			System.exit(0); // (僅測試使用) "非正式" 強制停止 Java 執行序用法!!
			activity = false; // 活動結束
		}
	}
}
