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
 * [正則表達式] 2019-08-06 00:28
 * - Regex: regular expression
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Regex {

	/*
	 * EX: 判斷一個字串:
	 *  1. 字串長度 5-15
	 *  2. 首數字不能為 0
	 *  3. 全部只能是數字
	 */
	public static void main(String[] args) {
		
		/** 原寫法 */
		
//		String str = "1234";   // 字串長度少於 5
//		String str = "019019"; // 不可以 0 開頭
//		String str = "123abc"; // 不可以包含非數字字串
		String str = "123019";
		
		String msg = "";
		char[] charArr = str.toCharArray();
		
		// 字串長度 5-15
		if (str.length() < 5 || str.length() > 15) {
			msg = "長度需介於 5-15\n";
		} else {
			// 首數字不能為 0 : 使用 .startWith()
			if (str.startsWith("0")) {
				msg = "開頭不可為 0\n";
			} else {
				// 全部只能是數字
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (!(charArr[i] < 48 || charArr[i] > 57)) {
						count++;
					}
				}
				if (count != str.length()) {
					msg = "只能是數字，不可含有其他字元\n";
				} else {
					msg = "PASS\n";
				}
			}
		}
		System.out.println("str(" + str + "): " + msg);
		
		/** Regex 寫法 */
		
		// 限定第一個數字只能 1-9 (沒有 0 ), 第一個之後的數字可以是 0-9, 長度必須介於 4-14 之間, 符合原字串長度 5-15 的規定
//		String regex = "[1-9]{1}[0-9]{4,14}"; // 只有 1 個的話可以省略
		String regex = "[1-9][0-9]{4,14}";

		//	使用 .matches() 來比對
		boolean flag = str.matches(regex);
		
		if (flag) {
			msg = "[Regex] PASS";
		} else {
			msg = "[Regex] Error";
		}
		System.out.println("str(" + str + "): " + msg);
	}
}
