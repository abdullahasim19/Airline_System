package interfaces;

public interface ISingle extends ITrip {
	
	public String getDeparture();
	public void setDeparture(String departure) ;
	public String getDestination() ;
	public void setDestination(String destination) ;
	public String getTripName() ;
	public void setTripName(String tripName) ;
	public int getTripId() ;
	public void setTripId(int tripId);

}
