package classes;

import interfaces.IAssignCaptain;

public class AssignCaptain implements IAssignCaptain{
	private Captain captain=new Captain();
	private Flight flight=new Flight();
	private String assignID;
	public Captain getCaptain() {
		return captain;
	}
	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public String getAssignID() {
		return assignID;
	}
	public void setAssignID(String assignID) {
		this.assignID = assignID;
	}
	
	
	
}
