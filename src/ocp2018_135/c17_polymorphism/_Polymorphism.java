/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c17_polymorphism;

import ocp2018_135.c17_polymorphism.beans.Sister;
import ocp2018_135.c17_polymorphism.beans.FamilyMember;
import ocp2018_135.c17_polymorphism.beans.Brother;

/**
 * <pre>
 * [多型] 2019-08-22 22:00
 * 1. 由(父類別) new 出(子類別): 必須要有繼承關係或實作關係
 * 2. 傳值方便: 所有(子類別)都可以被(父類別)的參考型態所接
 *  
 * p.s.  A is-a B: 說明 A, B 有繼承關係(A is a kind of B)
 * p.s. A has-a B: 說明 A, B 沒有繼承關係, 而是 A 類別中有 B 類別(A has a B)
 * 
 * [多型應用]
 * 1. 共用方法放在(父類別)中, 以繼承的方式提供給(子類別)使用
 * 2. 設定傳入的型態為(父類別), 只要是有繼承的 (子類別), 都可以被傳入
 * 
 * p.s. (父類別)多為共用方法, (子類別)多為自身所需的方法
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Polymorphism {

	public static void main(String[] args) {

		/** 使用多型的方式建構類別 */

		FamilyMember brother = new Brother(); // promote: 將(子類別)提升到(父類別)

		brother.getCar("Toyota");
//		brother.getPhone("iPhone"); // 抓不到(子類別)的方法：除非(父類別)也有這個方法才可以調用

		// 因為(父類別) getHouse() 方法是抽象方法, 所以會調用(子類別)實作的 getHouse() 方法
		brother.getHouse();

		// 如果有同名方法，會以子類別為主
		brother.getMoney("24,000");

		/** 多型應用 */

		findAnswer(new Brother());
		// findAnswer(new Sister()); // 不允許 Sister 找答案

		// findBook(new Brother()); // 不允許 Brother 找書
		findBook(new Sister());

		// 兩個 class 都可以傳入
		whoEnterTheDoor(new Brother());
		whoEnterTheDoor(new Sister());
		whoEnterTheDoor(new YoungerBrother()); // 如果有新的類別也要傳入, 就不需要改方法的傳入值, 繼承就可以了
	}

	// 答案只能哥哥找(限定只能傳入 Brother 參考型態)
	public static void findAnswer(Brother brother) {
		System.out.println("Brother find the answer");
	}

	// 書本只能姊姊找(限定只能傳入 Sister 參考型態)
	public static void findBook(Sister sister) {
		System.out.println("Sister find the book");
	}

	// 只要是家裡成員都可以進家門(限定只能傳入繼承 FamilyMember 參考型態的類別)
	public static void whoEnterTheDoor(FamilyMember familyMember) {

		if (familyMember instanceof Brother) {
			System.out.println("Brother");
		} else if (familyMember instanceof Sister) {
			System.out.println("Sister");
		} else {
			System.out.println("New family member.");
		}
	}
}

// 假設家裡成員多了一個弟弟...
class YoungerBrother extends FamilyMember {

	@Override
	public void getHouse() {
		System.out.println("We wish Younger Brother can buy a house, too.");
	}
}
