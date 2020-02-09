/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c03_operator_hex;

/**
 * <pre>
 * [進制轉換] 2019-08-17 10:34
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _HexConverter {

	public static void main(String[] args) {
		
		/* 2, 8, 16 進制轉換 10 進制 */
		int x10 = 246;
		
		String y2 = Integer.toBinaryString(x10);	// 11110110
		String y8 = Integer.toOctalString(x10);		// 366
		String y16 = Integer.toHexString(x10);		// f6
		 
		System.out.printf("%s\n%s\n%s\n%s\n\n",
				x10 + " 為 10進制(預設):",
				"246 轉成  2進制: " + y2,
				"246 轉成  8進制: " + y8,
				"246 轉成 16進制: " + y16);
		
		String y2y = "11110110";
		String y8y = "366";
		String y16y = "F6";

		Integer x10y2 = Integer.valueOf(y2y, 2);
		Integer x10y8 = Integer.valueOf(y8y, 8);
		Integer x10y16 = Integer.valueOf(y16y, 16);
		
		System.out.printf("%s\n%s\n%s\n%s\n",
				"2,8,16進制 轉成 10進制:",
				"  2進制(" + y2y + ")轉成 :\t" + x10y2,
				"  8進制(" + y8y + ")轉成 :\t\t" + x10y8,
				" 16進制(" + y16y + ")轉成 :\t\t" + x10y16);
		System.out.println("\n");
	}
}
