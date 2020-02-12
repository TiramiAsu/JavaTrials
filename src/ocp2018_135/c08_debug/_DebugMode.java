/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c08_debug;

/**
 * <pre>
 * [Debug 模式] 2019-08-01 22:53
 * - 協助檢視程式運行的狀況
 * - 1. 前面藍色框框可以點擊選擇要 debug 的程式行數
 * - 2. 在此程式右鍵> Debug As> Java Application
 * - 3. 上方有個 Resume(F8) 按鈕, 一步步執行> 右欄視窗 [Variable] 可以看每個 value 的變化
 * - 4. 右欄視窗 [Breakpoints] 可以取消全部的藍點標記
 * - 5. 右上角可以切換回 java coding 模式
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _DebugMode {

	public static void main(String[] args) {

		int count = 9;
		
		for (int i = 0; i < count; i--) {
			if (count-- < 0) {
				break;
			}
		}
		System.out.println(count); // -2
	}
}
