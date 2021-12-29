package classes;

import interfaces.IGeneral;

public class General extends Planes implements IGeneral{
	
	private int totalSeatsCount;
	private int BusinessClass;
	private int EconomicClass;
	private int FirstClass;
	
	@Override
	public void fuelLimit() {
		
	}
	@Override
	public void capacity() {
		
	}
	public void getSeatCount() {
		
	}
	public int getTotalSeatsCount() {
		return totalSeatsCount;
	}
	public void setTotalSeatsCount(int totalSeatsCount) {
		this.totalSeatsCount = totalSeatsCount;
	}
	public int getBusinessClass() {
		return BusinessClass;
	}
	public void setBusinessClass(int businessClass) {
		BusinessClass = businessClass;
	}
	public int getEconomicClass() {
		return EconomicClass;
	}
	public void setEconomicClass(int economicClass) {
		EconomicClass = economicClass;
	}
	public int getFirstClass() {
		return FirstClass;
	}
	public void setFirstClass(int firstClass) {
		FirstClass = firstClass;
	}
}
