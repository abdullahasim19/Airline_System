package interfaces;

import classes.Airport;

public interface IPlane {
	public void fuelLimit();
	public void capacity();
	
	public int getPlaneID();
	public void setPlaneID(int planeID);
	public String getPlaneName() ;
	public void setPlaneName(String planeName);
	
	public Airport getAirport();
	public void setAirport(Airport airport);
}
