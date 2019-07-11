
public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
		
	
	public Car() {} //default constructor
		

    public Car(String make, String model, int year, double price) {
    	
    	this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
		
	}
    
    public String getMake() { //getter
		return make;
	}
    public String getModel() { //getter
		return model;
	}
    public int getYear() { //getter
		return year;
	}
    public double getPrice() { //getter
		return price;
	}
    public void setMake (String make) {  //setter
		this.make = make;
	}
    public void setModel (String model) {  //setter
		this.model = model;
	}
    public void setYear (int year) {  //setter
		this.year = year;
	}
    public void setPrice (double price) {  //setter
		this.price = price;
	}
    
    public String toString()	{
		return "Car(Make: " + make +";" + " Model: " + model +";" + " Year: "+ year +";" +" Price: " + price + ")";
	}
		  
    
	

}
