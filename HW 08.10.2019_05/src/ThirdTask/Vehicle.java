package ThirdTask;

public class Vehicle {
	private String type;
	private String model;
	private int HorsePower;
	private float fuelConsumption;
	private int yearProduced; 
	private int licenseNo;
	private int weight;
	private String color;
	private float distance;
	
	protected Vehicle (String type,String model,int HorsePower,float fuelConsumption,int yearProduced,int licenseNo,int weight,String color,float distance) {
		this.type=type;
		this.model=model;
		this.HorsePower=HorsePower;
		this.fuelConsumption=fuelConsumption;
		this.yearProduced=yearProduced;
		this.licenseNo=licenseNo;
		this.weight=weight;
		this.color=color;
		this.distance=distance;
	}
	
	protected float GetDistance() { //getter for distance
		return this.distance;
	}
	
	protected double calculateTripPrice (double fuelPrice, double distance) {
		return fuelPrice*this.fuelConsumption*(distance/100);
	}
	
	protected double getInsurancePrice() {
		if(this.type.equals("car")==true)
			return (0.16 * this.HorsePower ) * (1.25 * (2019-this.yearProduced)) *
			( 0.05 * fuelConsumption );
		else if(this.type.equals("suv")==true)
			return (0.16 * this.HorsePower ) * (1.25 * (2019-this.yearProduced)) *
			( 0.05 * fuelConsumption )*1.12;
		else if(this.type.equals("truck")==true)
			return (0.16 * this.HorsePower ) * (1.25 * (2019-this.yearProduced)) *
			( 0.05 * fuelConsumption )*1.20;
		else
			return (0.16 * this.HorsePower ) * (1.25 * (2019-this.yearProduced)) *
			( 0.05 * fuelConsumption )*1.50;
	}
	
	@Override 
	public String toString() {
		return this.licenseNo+"-"+this.model+"-"+this.yearProduced+" "+this.color+" "+this.weight+"\n"+"Insurance cost:"+this.getInsurancePrice()+
				" and Travel cost:";
	}
}
