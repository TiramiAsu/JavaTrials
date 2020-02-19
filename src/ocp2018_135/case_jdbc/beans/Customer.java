/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.case_jdbc.beans;

/**
 * <pre>
 * [客戶] 2020-02-19 14:48
 * - 建立 Java Bean, 所有屬性對應 Database Table 的欄位
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Customer {

	private int id;             // 客戶 ID
	private String code;        // 客戶編號
	private String name;        // 客戶名稱
	private String phone;       // 行動電話
	private String address;     // 地址
	private String relationman; // 聯絡人
	private String remark;      // 備註

	public Customer() {
	}

	public Customer(String code, String name, String phone, String address,
			String relationman, String remark) {
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.relationman = relationman;
		this.remark = remark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRelationman() {
		return relationman;
	}

	public void setRelationman(String relationman) {
		this.relationman = relationman;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id +
				", code=" + code +
				", name=" + name +
				", phone=" + phone +
				", address=" + address +
				", relationman=" + relationman +
				", remark=" + remark +
				"]";
	}
}
