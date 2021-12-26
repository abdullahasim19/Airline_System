package classes;

import interfaces.IPackage;

abstract public class Packages implements IPackage{
	
	private int packageID; 
	
	public void price() {
		
	}
	public int getPackageID() {
		return packageID;
	}
	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}
}
