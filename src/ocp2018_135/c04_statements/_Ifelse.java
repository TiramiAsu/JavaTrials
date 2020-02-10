/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c04_statements;

/**
 * <pre>
 * [if-else 判斷式] 2019-07-27 00:17
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Ifelse {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* if */
		String msg = "機器未啟動";
		boolean status = false;
		
		if (status) {
			msg = "機器使用中...";
		}
		System.out.println("狀態: " + msg + "\n");
		
		
		// if-elseif
		String result = "x 等於 5";
		int x = 3;
		
		if (x > 5) {
			result = "x 大於 5";
		} else if (x < 5) {
			result = "x 小於 5";
		}
		System.out.println(result + "\n");
		
		
		// if-else
		String write = "X";
		String ans = "O";
		
		if (write == ans) {
			System.out.print("答對!! ");
		} else {
			System.out.print("答錯!! ");
		}
		System.out.println("正確答案是: " + ans + "\n");
		
		// if-elseif-else
		int num = 4;
		String element = "";
		
		if (num == 1) {
			element = "金";
		} else if (num == 2) {
			element = "木";
		} else if (num == 3) {
			element = "水";
		} else if (num == 4) {
			element = "火";
		} else if (num == 5) {
			element = "土";
		} else {
			element = "無此元素";
		}
		System.out.println("元素 " + num + " : " + element + "\n");
		
		
		/** if 出錯 */
		
		// 當使用 if 又不用大括弧時, 不可以出現宣告語句: 因為無大括弧代表語句只執行自己本身, 宣告完後什麼動作都不能做
		/*
		if(true)
			int j = 10;
		*/
		
		//	加上大括弧才可以
		if (true) {
			int k = 11;
		}
		

		/** 建議加上大括弧 {}，避免程式誤判 */
		
		// Cano 想要查 John 的成績, 當 login 名字等於 John 才會看到成績, 否則就會出現警示訊息
		String login = "Cano";
		String name = "John";
		int scores = 59;
		String systemMsg = name + "~你不及格哭哭";
		
		// X 錯誤
		if (login == name) // 這裡應該是 if-else
			if (scores >= 60) // 這裡會誤判成 if-else
				systemMsg = name + "，你分數是 " + scores + "，及格了";
		else
			systemMsg = "你不是 " + name + "，不可以偷看他的成績!!"; // 警示訊息
		
		// O 正確
		/*
		if (who == name) {
			if (scores >= 60) {
				systemMsg = name + "，你分數是 " + scores + "，及格了";
			}
		} else {
			systemMsg = "你不是 " + name + "，不可以偷看他的成績!!";
		}
		*/
		System.out.println(systemMsg);
	}
}
