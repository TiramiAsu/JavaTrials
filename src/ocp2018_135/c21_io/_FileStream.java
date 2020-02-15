/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c21_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

/**
 * <pre>
 * [檔案串流] 2019-08-30 00:35
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _FileStream {

	public static void main(String[] args) throws Exception {
		/*
		 * [path: 路徑]
		 * - 相對路徑(Relative Path): (以Class為準)指向檔案(資源)位置
		 * - 絕對路徑(Absolute Path): (以專案為準)從 src 開始指向檔案(資源)位置
		 * 
		 * p.s. 在檔案(資源)名稱案右鍵> Copy Qualified Name> 貼上路徑
		 * p.s. "./" 代表現在這個 Class 所在的資料夾
		 */

		// 建立 txt 檔案
		createTxtFile("create");

		// read txt file
		getTxtInfo();

	}

	@SuppressWarnings("resource")
	public static void getTxtInfo() throws Exception {

		String path = "src/ocp2018_135/c21_io/hello.txt";

		File file = new File(path);

		System.out.println("資源名稱: " + file.getName());
		System.out.println("資源路徑: " + file.getPath());
		System.out.println("資源絕對路徑: " + file.getAbsolutePath());

		System.out.println("是否存在: " + file.exists());
		System.out.println("是否可讀: " + file.canRead());
		System.out.println("是否可寫入: " + file.canWrite());

		System.out.println("此路徑的資源是否為文件: " + file.isFile());
		System.out.println("目錄: " + file.isDirectory());
		System.out.println("檔案字數: " + file.length());

		System.out.println(">>> print content <<<");
		FileInputStream fis = new FileInputStream(path);
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(reader);
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	public static void createTxtFile(String fileName) throws IOException {
		if (fileName != "") {
			File f = new File("src/ocp2018_135/c21_io/" + fileName + ".txt");
			Path pa = f.toPath();
			pa.toFile();
			System.out.println(f.toURI());
			f.createNewFile();
			System.out.println();
		}
	}
}
