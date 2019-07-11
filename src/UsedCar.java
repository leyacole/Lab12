
public class UsedCar extends Car {
	
	public double mileage;
	
		public UsedCar(String make, String model, int year, double price, double mileage) {
			super(make, model, year, price);
			this.mileage = mileage;
		}
		
	public void setMileage(double mileage) {
		this.mileage = mileage;
		
	}
	public double getMileage() {
		return mileage;
	}
	
	@Override
	public String toString()	{
		return "Car(Make: " + getMake() +";" + " Model: " + getModel() +";" + " Year: "+ getYear() +";" +" Price: " + "$" + getPrice() + ";" +  "(Used) "+ mileage +" )";
	}
	
	
		
		

}
