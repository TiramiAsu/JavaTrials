/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c16_interface.interfaces;

/**
 * <pre>
 * [資料庫連線物件] 2020-02-15 11:30
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public abstract class ADatabase implements IDatabase, IConnection {

	public abstract void setUser(); // 未實作
	public abstract void setPassword(); // 未實作

	@Override
	public Object getConnection(String info) {
		System.out.println("取得連線物件: " + info);
		return new Object();
	}
}
