/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.case_jdbc.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <pre>
 * [Java Bean tools] 2020-02-19 15:47
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class BeanUtils {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object MapToBean(Object bean, Map map) {
		Map methods = new HashMap();
		Method m[] = bean.getClass().getMethods();
		for (int i = 0; i < m.length; i++) {
			Method method = m[i];
			String methodName = method.getName().toUpperCase();
			methods.put(methodName, method);
		}

		Iterator it = null;
		String key = "";
		it = map.keySet().iterator();
		while (it.hasNext()) {
			key = (String) it.next();
			String name = "GET" + key.toUpperCase();
			if (methods.containsKey(name)) {
				Method setMethod = (Method) methods.get("SET" + key.toUpperCase());
				try {
					if (setMethod != null) {
						Object[] obj = null;
						obj = new Object[1];
						obj[0] = map.get(key);
						setMethod.invoke(bean, obj);
					} else {
						continue;
					}
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return bean;
	}
}
