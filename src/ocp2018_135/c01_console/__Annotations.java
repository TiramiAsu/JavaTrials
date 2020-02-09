/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c01_console;

import java.io.IOException;

/**
 * <pre>
 * [Javadoc 註解用法] 2019-07-23 23:37
 *  <b>*</b>1. @author	  :作者
 *  <b>*</b>2. @version	  :版本號碼
 *  <b>*</b>3. @see	  :標示參考的 Class
 *   4. @Param	  :參數
 *   5. @return	  :回傳值
 *   6. @throws	  :異常標示
 *   7. @deprecated :過時標示
 * (Mark * is command annotation to used.)
 * </pre>
 * 
 * @version Java 1.8
 * @author TiramiAsu (Email)
 * 
 * @see ocp2018_135.c01_console.__ClassDemo Path.ClassName
 * @see __ClassDemo Only ClassName
 * @see __ClassDemo #staticMethod ClassMethod
 * @see (text)&nbsp;{@link ocp2018_135.c01_console.__ClassDemo #normalMethod Using @see with @Link}
 */
public class __Annotations {

	/**
	 * @deprecated 用來標示已過時的方法
	 * @param str 方法的傳入值相關資訊
	 * @return 回傳值的相關資訊
	 */
	public String obsoleteMethod(String str) {
		String txt = "success" + str;
		return txt;
	}

	/**
	 * @throws IOException 說明使用此方法可能有輸入異常的情況
	 */
	public static void otherMethod() throws IOException {}

}
