package interfaces;

import classes.Airport;
import classes.Planes;

public interface IFlight {
	public String getFlightid();

	public void setFlightid(String flightid);

	public Planes getPlane() ;

	public void setPlane(Planes plane);

	public String getDate();

	public void setDate(String date);

	public Airport getAirport();

	public void setAirport(Airport airport);

	public String getDestination();

	public void setDestination(String destination);

	public String getTime();
	public void setTime(String time);
	

}
