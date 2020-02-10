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
 * [switch-case 判斷式] 2019-07-28 23:45
 * 
 * [case 可使用的型態]
 * 1. byte, short, int
 * 2. char
 * 3. String (java 1.6.0 版本新增)
 * 4. enum(實用面): 列舉
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _SwitchCase {

	public static void main(String[] args) {
		
	//	以 int 為例( byte, short 亦同)
		int numInt = 2;
		
		switch (numInt) {
		case 1:
			System.out.println("numInt: is case 1");
			break;
		case 2:
			System.out.println("numInt: is case 2");
			break;
		}
		
		// char: 可以使用 ASCII Code 來判斷
		char letterChar= 'a';
		
		switch (letterChar) {
		case 97: // 'a' 的 ASCII Code 是 97
			System.out.println("letterChar: is case 97");
			break;
		case 'b':
			System.out.println("letterChar: is case 'b'");
			break;
		}
		
		// String
		String textString = "D";
		
		switch (textString) {
		case "C":
			System.out.println("textString: is case \"C\".");
			break;
		case "B":
			System.out.println("textString: is case \"B\".");
			break;
		case "A":
			System.out.println("textString: is case \"A\".");
			break;
		default: // 不符合以上 case, 最後會執行 default 區塊的程式
			System.out.println("textString: is default(" + textString + ")");
		}
		
		// enumeration: 列舉
		Drink drink = Drink.COFFEE;
		
		switch (drink) {
		case COLA:
			System.out.println("Drink is \"COLA\".");
			break;
		case MILK:
			System.out.println("Drink is \"MILK\".");
			break;
		case COFFEE:
			System.out.println("Drink is \"COFFEE\".");
			break;
		default:
			System.out.println("unknow Drink");
		}
	}
	
	public enum Drink {
		COLA, MILK, COFFEE;
	}
}
