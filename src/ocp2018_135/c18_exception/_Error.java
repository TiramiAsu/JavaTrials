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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * [執行類錯誤] 2020-02-15 18:02
 * - java.lang.StackOverflowError(堆疊溢出) -> 程式無錯誤, 但運行錯誤 -> 遞迴運行, 重複參照等等
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@SuppressWarnings("unused")
public class _Error {

	public static void main(String[] args) {
//		errorStackOverflow(1);       // 遞迴造成的堆疊溢出
//		System.out.println(new A()); // 重複參照的堆疊溢出
	}
	
	public static void errorStackOverflow(int i) {
		errorStackOverflow(i++);
	}
}

class A {
	B[] bs = {new B()};

	@Override
	public String toString() {
		return "A [bs=" + bs + "]";
	}
}

class B {
	A[] as = {new A(), new A()};

	@Override
	public String toString() {
		return "B [as=" + as + "]";
	}
}