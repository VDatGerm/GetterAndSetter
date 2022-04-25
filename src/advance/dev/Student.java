package advance.dev;

public class Student {
	private String Name;
	private int Old;
	private String Address;
	private int Phone;
	private float dTB;
	
	public Student() {
		
	}
	public Student(String name, int old, String address, int phone, float dTB) {
		super();
		Name = name;
		Old = old;
		Address = address;
		Phone = phone;
		this.dTB = dTB;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getOld() {	
		return Old;
	}
	public void setOld(int old) {
		if(old > 0) {
		this.Old = old;
		}
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		this.Phone = phone;
	}
	public float getdTB() {
		return dTB;
	}
	public void setdTB(float dTB) {
		if(dTB >=0 ) {
		this.dTB = dTB;
		}

		
	}
	
}
