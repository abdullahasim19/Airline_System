package interfaces;

import classes.Airport;
import classes.Planes;

public interface IFlight {
	public String getDestination();
	public void setDestination(String destination);
	public String getFlightTime();
	public void setFlightTime(String flightTime);
	public String getFlightDate();
	public void setFlightDate(String flightDate);
	public Airport getAirport();
	public void setAirport(Airport airport);
	public Planes getPlanes();
	public void setPlanes(Planes planes);

}
