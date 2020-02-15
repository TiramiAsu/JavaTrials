/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c18_exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <pre>
 * [異常] 2019-08-25 16:36
 * 1 錯誤(error): 偏開發者
 * - JVM 出錯
 * - 資源耗盡
 * - 網路斷線(連外部資料庫時)
 * - 程式問題(API)
 *
 * 2 異常(Exception): 偏使用者
 * - 輸入異常(輸入內容與設定型態不同)
 * - 編譯時異常、指令錯誤(eclipse 邊 coding 邊編譯)
 * - 運行時異常(編譯OK, 運行錯誤)
 *
 * [Exception 結構]
 * - (父類別) throwable
 * - (子類別) error, exception
 *
 * p.s. throws 子類別(前), 父類別(後)
 * p.s. 拋父類別異常, 就可以不用拋子類別異常
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class __Exception {

	/*
	 * +-------------+-----------+---------------------------+
	 * |      \      | front-end |          back-end         |
	 * +-------------+-----------+--------------+------------+
	 * |    level    |     1     |       2      |      3     |
	 * |             |   page    |   javaMain   | javaMethod |
	 * +-------------+-----------+--------------+------------+
	 * |             |  input a  |      10      |            |
	 * |    value    |  input b  |       0      |     a/b    | -> b 為 0 會出錯
	 * +-------------+-----------+--------------+------------+
	 * | situation 1 |   debug   |      OK      |     OK     | -> 理想狀態
	 * | situation 2 | no debug  | no try-catch | try-catch  | -> 處理複雜, 到第 3 層才檢查到錯誤, 拋錯誤訊息給前端還要透過 javaMain
	 * | situation 3 | no debug  |  try-catch   |   throws   | -> 處理較佳, 到第 2 層就檢查到錯誤, 可直接拋錯誤訊息給前端
	 * | situation 4 |   debug   |  try-catch   |   throws   | -> 最佳處理, 前後端都檢查錯誤
	 * +-------------+-----------+--------------+------------+
	 */
	static Scanner scan = null;
	
	public static void main(String[] args) {
		
		try {
			runConsole(); // 輸入文字, 看看錯誤
		} catch (InputMismatchException e) {
			System.out.println("(Error " + MyException.ERROR_INPUT + ") 只接受數字, 請重新執行");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			scan.close();
		}
		
	}
	
	public static void runConsole() throws IOException {
		scan = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		int num = scan.nextInt();
		System.out.println("你輸入的數字是: " + num);
		scan.close();
	}

}
