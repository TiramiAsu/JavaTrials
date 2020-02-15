/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c19_exception_custom;

import java.io.IOException;

/**
 * <pre>
 * [自定義異常] 2019-08-29 21:44
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _CustomException {

	public static void main(String[] args) {

		// 使用 try-catch 來執行可能會出現異常的程式
		// 因調用方法有 throws Exception 所以強迫要 try-catch, 或是再將異常拋出去
		try {
			int num = customException(0);
			System.out.println(num);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 就算 JVM 停止運行， finally 最後還是會執行。
			// 關 port 或 錯誤傳入 log 檔案(保護自己，記下紀錄)
		}
	}

	/*
	 * throw, throws 拋出異常方法 
	 * throws 的 Exception 範圍(父類別) 必須要大於 自訂的 throw 的 Exception 範圍 (子類別)
	 */
	private static int customException(int i) throws IOException {
		
		if (i != 0) {
			int y = 10;
			int c = y / i;
			return c;
		} else {
			// 手動拋出: 有拋出問題 JVM 會停止執行
			throw new IllegalArgumentException("(Error:5281)the deominator is NOT by 0.");
		}
	}
}
