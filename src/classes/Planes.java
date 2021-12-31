package classes;

import interfaces.IPlane;

public class Planes implements IPlane{
	private int planeID;
	private String planeName;
	private Airport airport=new Airport();
	public void fuelLimit() {
		
	}
	public void capacity() {
		
	}
	public int getPlaneID() {
		return planeID;
	}
	public void setPlaneID(int planeID) {
		this.planeID = planeID;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public Airport getAirport() {
		return airport;
	}
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
}
