package interfaces;

public interface IGeneral {

	public void fuelLimit();

	public void capacity();
	public void getSeatCount();
	
	public int getTotalSeatsCount();
	public void setTotalSeatsCount(int totalSeatsCount);
	public int getBusinessClass() ;
	public void setBusinessClass(int businessClass);
	public int getEconomicClass();
	public void setEconomicClass(int economicClass);
	public int getFirstClass();
	public void setFirstClass(int firstClass);
}
