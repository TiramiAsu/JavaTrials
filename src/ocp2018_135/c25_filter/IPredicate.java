/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c25_filter;

/**
 * <pre>
 * [函式介面] 2019-09-08 15:22
 * - 只能有一個抽象方法
 * - 加上註解 @ FunctionalInterface 一定要有傳入值 &lt;T&gt;, 才能傳各種型態
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@FunctionalInterface
public interface IPredicate<T> {
	public boolean judge(T t);
}
