
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Car> car = new ArrayList<>();
		
		car.add(new Car("Jeep", "Grand Cherokee", 2016, 50000.00));
		car.add(new Car("Jeep", "Cherokee", 2018, 30000.00));
		car.add(new Car("Cadillac", "CTS", 2016, 60000.00));
		car.add(new UsedCar("Chevorlet", "Camero", 2019, 55000.00, 100000.00));
		car.add(new UsedCar("Ford", "F-150", 1999, 50000.00, 80000.00));
		
	}

}
