/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c08_string;

/**
 * <pre>
 * [切割字串] 2019-08-05 01:29
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Split {
	
	// 有空白、連續空白、逗號、斜線、連續斜線
	static String str = "   a,b,c d  e   f    g\\h\\\\i";

	public static void main(String[] args) {
		
		/* 去除特定 symbol */
		System.out.println("原始的str:\n" + str + "\n");
		
		// 去 ,
		showSplitString("去除 \",\":", ",");
		
		// 去 space
		showSplitString("去除 space \" \":", " ");
		
		// 去 \
		showSplitString("去除 \"\\\":", "\\\\");
	}
	
	public static void showSplitString(String msg, String symbol) {
		
		System.out.printf("%s\n", msg);
		String[] arr = str.split(symbol);
		
		for(String temp : arr) {
			System.out.print(temp);
		}
		System.out.println("\n");
	}
}
