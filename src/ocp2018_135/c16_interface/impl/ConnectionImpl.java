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

import ocp2018_135.c16_interface.interfaces.IConnection;

/**
 * <pre>
 * [取得連線物件] 2020-02-15 12:23
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class ConnectionImpl implements IConnection {
	
	public ConnectionImpl() {
		System.out.println("直接取得連線物件: admin");
	}

	@Override
	public Object getConnection(String info) {
		System.out.println("取得連線物件: " + info);
		return new Object();
	}

}
