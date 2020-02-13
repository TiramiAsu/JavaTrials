/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c12_utils_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <pre>
 * [時間] 2019-08-10 02:41
 * 
 * [世界時間標準]
 * 1. UTC: Coordinated Universal Time (世界協調時間)
 * 2. GMT: Greewich Mean Time (格林威治時間)
 * 3. CST: Central Standard Time (中部標準時間) UTC-6
 * Other:
 * - 4. PST/PT: Pacific Standard Time (太平洋標準時間) UTC-8
 * - 5. MST: Mountain Standard Time (山區標準時間) UTC-7
 * - 6. EST: Eastern Standard Time (東岸標準時間) UTC-5
 * - 7. AKST: Alaska Standard Time (阿拉斯加標準時間) UTC-9
 * - 8. HAST: Hawaii-Aleutian Standard Time (阿留申標準時間) UTC-10
 * 
 * Time type:
 * - 1. System(java.lang.System)
 * - 2. Date(java.util.Date)
 * - 3. SimpleDatafomat(java.text.SimpleDateFormat)
 * - 4. Calendar(java.util.Calendar)
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _Time {

	/* 
	 * [查看 Date]
	 * - Ctrl + 左鍵連結看原始碼
	 * 1. 沒連到, 就Attach 到 JDK 的 src.zip
	 * 2. 到 Window> Preferences 設定
	 * - a. Window> Preferences> Java> Installed JREs> select your JRE> Edit
	 * - b. select "C:\Program Files\Java\(JDK folder)\lib\rt.jar"> Source Attachment
	 * - c. External location> External File> point "C:\Program Files\Java\(JDK folder)\src.zip"
	 * - d. Finish
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		/** System */
		
		// 起始時間: 1970/1/1 00:00:00
		System.out.println(System.currentTimeMillis()); // 從起始時間到現在的秒數
		
		
		/** Date */
		
		// 起始時間: 1970/1/1 00:00:00
		Date d = new Date();
		System.out.println("Date: " + d);
		System.out.println("時間: " + d.getTime());
		System.out.println("年份: " + (d.getYear() + 1900)); // 有註解代表已有新功能取代 方法用 @deprecated
		System.out.println("月份: " + (d.getMonth() + 1)); // 有古代某國家是 0-11月，所以0起始
		System.out.println("日期: " + d.getDate() + "\n"); // 有古代某國家是 0-11月，所以0起始
		
		
		/** SimpleDateFormat */
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy 年 MM 月 dd 日   hh:mm:ss");
		System.out.println(si.format(d) + "\n");
		
		
		/** Calendar */
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		System.out.println("年份: " + c.get(Calendar.YEAR));
		System.out.println("月份: " + (c.get(Calendar.MONTH) + 1));
		System.out.println("日期: " + c.get(Calendar.DATE));
	}
}
