package classes;

public class Customer extends Person{
	
	private String dob;
	private String contact;
	private String address;
	private String gender;
	private String fullname;
	
	@Override
	public void getPersonDetail() {
		
	}
	@Override
	public void setPersonDetail() {
		
	}
	public void journeyHistory() {
		
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
