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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 * <pre>
 * [輸入輸出異常] 2019-08-28 22:55
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _InputOutputException {

	public static void main(String[] args) {
		try {
			// 擇一執行
//			exceptionIO();
			exceptionIOCast();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * [path: 路徑]
	 * - 相對路徑(Relative Path): 以Class為準 ->指向檔案(資源)位置
	 * - 絕對路徑(Absolute Path): 以專案為準 ->從 src 開始指向檔案(資源)位置
	 * 
	 * p.s. 在檔案(資源)名稱案右鍵> Copy Qualified Name> 貼上路徑
	 * p.s. "./" 代表現在這個 Class 所在的資料夾
	 */
	@SuppressWarnings("unused")
	public static void exceptionIO() throws Exception {

		URL url = null;
		File file = null;
		FileInputStream fis = null;
		InputStreamReader reader = null;
		BufferedReader br = null;
		String path = "";

		try {

			/** 相對路徑: 以某 Class為準找尋 path */

			// O 正確
//			path = "./content.txt";
//			url = _InputOutputException.class.getResource(path);
//			file = new File(url.getFile());
//			fis = new FileInputStream(file);

			// X 錯誤
//			fis = new FileInputStream(path); // 直接讀取 path 會找不到檔案

			/** 絕對路徑: 跟目錄為 src */

			// O 正確
			path = "src/ocp2018_135/c18_exception/content.txt";
			fis = new FileInputStream(path);

			// X 錯誤
//			url = _InputOutputException.class.getResource(path);
//			file = new File(url.getFile()); // file 會變成 null
//			fis = new FileInputStream(file);
			
			/** 取得 BufferedReader 印出內容 */
			
			reader = new InputStreamReader(fis);
			br = new BufferedReader(reader);

			try {
				String line;
				while ((line = br.readLine()) != null) { // .readLine() 一次讀取一行轉成 String
					System.out.println(line);
				}
			} catch (IOException e) {
				System.out.println("讀取失敗...");
			}
		} catch (FileNotFoundException e) {
			System.out.println("路徑錯誤/檔案不存在");
		} finally {
			// 使用完要關閉 -> 資料庫, port, 檔案： 有開有關，先開後關
			if (fis != null) {
				fis.close();
			}
			if (reader != null) {
				reader.close();
			}
			if (br != null) {
				br.close();
			}
		}
	}
	
	public static void exceptionIOCast() {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Input Number: "); // 當輸入的型態不是 int 時, 就會出錯
			int var = scan.nextInt();           // 取得 int 資料
			System.out.println("Number is " + var);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 無論有沒有出錯, 執行完就關掉 Scanner
			scan.close();
		}
	}
}
