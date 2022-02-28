package ExampleSpring;

public class EmployeeAddress {
	
	
	int eid;
	String ename;
	Address address;

	EmployeeAddress(){
	}
	
	
	//constructor Injection
	EmployeeAddress(Address address){
		this.address=address;
	}
	
	public EmployeeAddress(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	
	//setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

}