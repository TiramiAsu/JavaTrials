/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c14_inherit;

import ocp2018_135.c14_inherit.beans_method.Land;
import ocp2018_135.c14_inherit.beans_method.Ocean;
import ocp2018_135.c14_inherit.beans_method.World;

/**
 * <pre>
 * [方法的繼承] 2019-08-20 22:22
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class _InheritMethod {

	/**
	 * - 關於 @ Override, 如果(父類別)的方法已經過時, 可使用註解 @ Deprecated 告訴調用的人, 此方法是舊的
	 * - 較新的方法如果在(子類別), 就可以用註解 @ Override 重新實作(父類別)的舊方法
	 * 
	 * p.s. 屬性名稱相同也可以覆蓋, 但通常很少這樣做
	 * p.s. 也很少做 setter, getter 方法的覆蓋
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		World world = new World("原始世界");
		Land land = new Land("大陸");
		Ocean ocean = new Ocean("海洋");
		
		System.out.println(world.getName());
		world.getAir();   // World 本身
		world.getWater(); // World 本身
		world.getSpace(); // World 本身
		
		System.out.println("-------");
		
		System.out.println(land.getName());
		land.getAir();   // 來自 World
		land.getWater(); // 來自 World
		land.getSpace(); // 來自 Land
		
		System.out.println("-------");
		
		// (子類別)與(父類別)方法名稱相同 -> 在 Ocean 中此方法要加上 @ Override, 可避免覆蓋錯方法
		System.out.println(ocean.getName());
		ocean.getAir();   // 來自 World
		ocean.getWater(); // 來自 Ocean, 使用同名方法: (子類別)會覆蓋(父類別)的方法體
		ocean.getSpace(); // 來自 World
		
		ocean.getOceanAnimals(); // Ocean 本身
		System.out.println(ocean.getLiveiveAnimal()); // Ocean 本身
	}
}
