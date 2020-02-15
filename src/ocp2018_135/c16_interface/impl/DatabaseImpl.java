/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c16_interface.impl;

import ocp2018_135.c16_interface.interfaces.ADatabase;
import ocp2018_135.c16_interface.interfaces.IConnection;
import ocp2018_135.c16_interface.interfaces.IOperate;

/**
 * <pre>
 * [實作連接資料庫物件] 2020-02-15 11:34
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class DatabaseImpl extends ADatabase implements IOperate {

	@Override
	public void create() {
		System.out.println("新增資料...");
	}

	@Override
	public void query() {
		System.out.println("查多筆資料...");
	}

	@Override
	public void find() {
		System.out.println("查一筆資料...");
	}

	@Override
	public void update() {
		System.out.println("更新資料...");
	}

	@Override
	public void delete() {
		System.out.println("刪除資料...");
	}

	@Override
	public void setUser() {
		System.out.println("設定資料庫帳號");
	}

	@Override
	public void setPassword() {
		System.out.println("設定資料庫密碼");
	}

	@Override
	public Object getConnection(IConnection connection) {
		return connection;
	}

}
