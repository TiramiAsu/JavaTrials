/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c16_interface;

/**
 * <pre>
 * [介面] 2019-08-21 22:57
 * Class 實作 Interface 使用關鍵字 implements, 可以實作很多個 Interface
 * 1. 常數: 不可私有化, 命名全大寫(Java寫法) 或是以 ["_" + 大寫] 表示常數名稱(C/C++寫法)、
 * 2. 抽象方法: 不可私有化, 不能使用一般方法(無方法體), 建議只要1個抽象方法(新增太多不好處理)
 * 3. (建構子): 不能存在建構子
 * 4. default 方法: interface 中方法不可以有方法體, 除非加上 default 可允許增加方法體
 * 
 * p.s. 單繼承, 多實作
 * 
 * [abstract 與 interface 使用]
 * 使用關鍵字順序: 先 extends(繼承)後再 implements(實作)
 * 
 * EX: class 繼承
 * - public class A
 * - public class B extends A
 * - public class C extends B
 * 
 * EX: class 繼承又實作
 * - public interface A
 * - public class B
 * - public class C extends B implements A
 * 
 * EX: class 繼承又多實作
 * - public interface A
 * - public interface B
 * - public class C
 * - public class D extends C implements A, B
 * 
 * EX: interface 繼承
 * - public interface A
 * - public interface B extends A (interface 繼承 interface)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public interface __Interface {}
