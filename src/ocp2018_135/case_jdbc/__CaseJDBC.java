/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.case_jdbc;

/**
 * <pre>
 * [JDBC] 2019-08-23 01:16
 * - Customers(顧客) 的 CRUD 操作
 * 
 * [同樣功能]
 * - class 多: 所以單位就小, 實作時間短, 釋放後相對效能較快 (美國式寫法)
 * - class 少: 所以單位就大, 實作時間長, 釋放後相對效能較慢
 * 
 * [單例設計模式: new 與 static]
 * - (不需 static ) 在外面建構同一個物件(new 很多次), 會佔據很多記憶體, 若一直使用些物件, 這些物件要很久才會釋放
 * - (需要 static ) 在方法建構此物件(只 new 一次), 只佔據一塊記憶體，讓外面調用此方法就好
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public interface __CaseJDBC {}
