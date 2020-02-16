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
 * [單執行序] 2019-09-06 00:20
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class SingleThread extends Thread {

	@Override
	public void run() {
		
		for(int i = 100; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}
