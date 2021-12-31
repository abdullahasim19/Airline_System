package interfaces;

import classes.Captain;
import classes.Flight;

public interface IAssignCaptain {
	public Captain getCaptain();
	public void setCaptain(Captain captain);
	public Flight getFlight();
	public void setFlight(Flight flight);
	public String getAssignID();
	public void setAssignID(String assignID);
}
