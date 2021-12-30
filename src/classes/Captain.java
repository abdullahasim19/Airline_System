package classes;

import interfaces.ICaptain;

public class Captain extends Employee implements ICaptain{
	private int age;
	private String gender;
	private String Captainname;
	private String CaptainID;
	
	@Override
	public void getPersonDetail() {
		
	}
	@Override
	public void setPersonDetail() {
		
	}
	@Override
	public void getDesignation() {
		
	}
	@Override
	public void getSalary() {
		
	}
	
	public void journeyHistory() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaptainname() {
		return Captainname;
	}
	public void setCaptainname(String captainname) {
		Captainname = captainname;
	}
	public String getCaptainID() {
		return CaptainID;
	}
	public void setCaptainID(String captainID) {
		CaptainID = captainID;
	}
}
