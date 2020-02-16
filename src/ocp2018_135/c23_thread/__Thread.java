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

/**
 * <pre>
 * [執行序] 2019-09-05 22:33
 * - 基本上是個 class
 * 
 * [ Entrypoint: 程式進入點 ]
 *   ↓
 * [ run ] ← [加入] 加入新執行序
 * [ run ] ← [銷毀] 銷毀現有執行序
 * [ run ] ← [睡眠] 讓執行序休眠, 需要時再喚醒 (有時間性)
 * [ run ] ← [等待] 讓執行序等待, 有需要時直接呼叫 (有時間性)
 * 
 * [執行序應用]
 * - 用到2個以上的使用者
 * - 需要讀寫、等待的
 * - 網路操作
 * - 搜尋
 *
 * [執行序種類]
 * - 單執行序： 1 個人做 N 件事
 * - 多執行序： N 個人做 1 件事
 *
 * [執行序實作]
 * - 要 extends Thread
 * - 要 @ Override .run() 方法
 *
 * p.s. main 方法本身就是一個執行序
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public interface __Thread {}
