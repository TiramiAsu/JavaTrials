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
 * [操作 CRUD] 2020-02-15 11:25
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public interface IOperate {

	public void create(); // create

	public void query();  // read(多筆) / query(多筆)
	
	public void find();   // get(單筆) / find(單筆)

	public void update(); // update

	public void delete(); // delete
}
