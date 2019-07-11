import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		boolean valid = true;
		int input = 0;
		
		
		ArrayList<Car> car = new ArrayList<>(input);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		do {
			System.out.println("How many cars do you want to enter: ");
			
			
		  try {
			  input = scnr.nextInt();
		      scnr.nextLine();// clear scanner
			  
		  }catch (InputMismatchException Ex) {
				valid = false;
				System.out.println("Invalid entry.  ");
				scnr.nextLine();
				continue;
		   } 
		  valid = true;
		
		}while(!valid);
		
		for (int i = 0; i < input; i++) { 
			System.out.println("Enter Car #" +(i + 1) + " Make: ");
			String make = scnr.next();
			System.out.println("Enter Car #" +(i + 1) + " Model: ");
			String model = scnr.next();
			System.out.println("Enter Car #" +(i + 1) + " Year: ");
			int year = scnr.nextInt();
			System.out.println("Enter Car #" +(i + 1) + " Price: ");
			double price = scnr.nextDouble();
			car.add(new Car( make, model, year, price));
		}
		System.out.println("\t\tCurrent Inventory");
		for(Car cars : car) {       
		 System.out.println(cars.toString()); //uses the toString in Car.java
		}
		
		scnr.close();
	}	
	
	
}
