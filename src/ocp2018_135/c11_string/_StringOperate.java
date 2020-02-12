/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c11_string;

/**
 * <pre>
 * [String 相關操作] 2019-08-10 00:48
 * - 轉大小寫, 去除空白, 字串取得字母, 字串截取, 字串切割, 字串取代, 字串查詢, 字串格式化
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _StringOperate {

	public static void main(String[] args) {

		/* 轉大小寫 */
		String caseStr = "aBcdE";
		System.out.println(caseStr.toUpperCase());
		System.out.println(caseStr.toLowerCase() + "\n");

		/* 去除空白 */
		String spaceStr = "     123   456   ";
		System.out.println(spaceStr.trim() + "\n"); // 只會去除前後的空白

		/* 字串取得字母 */
		String letterStr = "abcdefghi";
		System.out.println("字串中第 8 個字母: " + letterStr.charAt(7) + "\n");

		/* 字串截取 */
		String subStr = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(subStr.substring(3, 10)); // defghij

		// .subString() 底層程式概念
		System.out.println(simulateSubString(subStr, 3, 10) + "\n"); // defghij

		/* 字串切割 */
		String splitStr = "a,b,c,d,e,";
		String[] arr = splitStr.split(",");
		for (String s : arr) {
			System.out.print(s + "!");
		}
		System.out.println("\n");

		/* 字串取代 */
		// 相同字串全部取代
		System.out.println(splitStr.replace(",", "!"));

		// 只取代第一個相同的字串
		System.out.println(splitStr.replaceFirst(",", "!"));

		// 直接取代整個字串
		System.out.println(splitStr.replaceAll("b,c,d", "1234567") + "\n");

		/* 字串查詢 */
		// 查詢字串中字母位置，0為起始，無此值回傳-1
		String indexofStr = "Taiwan台灣";
		System.out.println("\"i\" index: " + indexofStr.indexOf("i"));
		System.out.println("'i' index: " + indexofStr.indexOf('i'));
		System.out.println("\"wa\" index: " + indexofStr.indexOf("wa"));
		System.out.println("\"a台灣\" index: " + indexofStr.indexOf("a台灣"));
		System.out.println("\"台\" index: " + indexofStr.indexOf("台"));
		System.out.println("'台' index: " + indexofStr.indexOf('台'));

		/* 字串格式化 */
		// 使用方式與 printf 一樣
		System.out.println("數字1： " + 12 + ", 字串： cat, 浮點數： " + 21.5);
		System.out.printf("數字1： %d, 字串： %s, 浮點數： %.2f\n", 12, "cat", 21.5);
		String s = String.format("數字1： %d, 字串： %s, 浮點數： %.2f\n", 12, "cat", 21.5);
		System.out.println(s);
	}

	// .subString() 底層程式概念
	public static String simulateSubString(String str, int start, int end) {

		String s = "";
		for (int i = start; i < end; i++) {
			s += str.charAt(i);
		}
		return s;
	}
}
