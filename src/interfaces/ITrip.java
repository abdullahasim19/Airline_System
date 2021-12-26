package interfaces;

public interface ITrip {
public void getpickUpLocation();
	public void getDestinationLocation();
	public void stayDetails() ;
	public void facility() ;
	
	public String getDeparture();
	public void setDeparture(String departure) ;
	public String getDestination() ;
	public void setDestination(String destination) ;
	public String getTripName() ;
	public void setTripName(String tripName) ;
	public int getTripId() ;
	public void setTripId(int tripId);
	
}
