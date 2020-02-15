/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c21_generic_wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * [通用配置符號(通配符): ?] 2019-09-05 20:47
 * 1. try-catch 不可用: catch 不可放
 * 2. static 不可用: 因為 static 是靜態的, 不能有動態的泛型
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Wildcards {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/** 通配符 ? 可以接受不同型態的泛型 */

		List<?> list = null;
		List<Object> objectList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		list = objectList;
		list = stringList;

		/** 泛型的繼承 */

		List<Animal> animalList = new ArrayList<>();
		List<Feline> felineList = new ArrayList<>();
		List<Lion> LionList = new ArrayList<>();

		// 繼承 Feline 的子類別都可以被呼叫
//		List<? extends Feline> list1 = animalList; // 出錯
		List<? extends Feline> list2 = felineList;
		List<? extends Feline> list3 = LionList;

		// 所有 Feline 的父類別都可以被呼叫
		List<? super Feline> list4 = animalList;
		List<? super Feline> list5 = felineList;
//		List<? super Feline> list6 = LionList;     // 出錯

		// 如果要呼叫全部, 就只用 ? 就好
		List<?> list7 = null;

		/** 所有繼承 T 的子類別都可以被傳進來 */

		List<?> list8 = getAnimal(animalList);
		List<?> list9 = getAnimal(felineList);
		List<?> list10 = getAnimal(LionList);
	}

	// 所有繼承 T 的子類別都可以被傳進來
	// public void getT(List<? extends T> list) {}
	public static List<?> getAnimal(List<? extends Animal> list) {
		return list;
	}
}
