//Carter Gerlach
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Create single dimension array to store city names
		String[] cities = new String [2];
		
		//Create two dimension array to store coordinates
		double coordinates[][] = new double [2][2];
		
		//Ask user to input the first city and store it in the 1D array
		System.out.print("Enter the first city: ");
		cities[0] = input.nextLine();
		
		//Ask user to input the second city and store it in the 1D array
		System.out.print("Enter the second city: ");
		cities[1] = input.nextLine();
		
		//Ask user to input the coordinates for city 1 and store it in the 2D array
		System.out.print("Enter latitude and longitude of the first city separated by a space (example: 28.8 81.2): ");
		coordinates[0][0] = input.nextDouble();
		coordinates[0][1] = input.nextDouble();
		
		//Ask user to input the coordinates for city 2 and store it in the 2D array
		System.out.print("Enter latitude and longitude of the second city separated by a space (example: 28.8 81.2): ");
		coordinates[1][0] = input.nextDouble();
		coordinates[1][1] = input.nextDouble();
		
		//Call calcDistance method 
		double distance = calcDistance (coordinates);
		
		//Display distance between the two cities
		System.out.printf("The distance between the two cities is %4.2f miles.", distance);
	}
	public static double calcDistance (double [][] list) {
		
		//compute the distance
		double xValue = (list[0][1] - list[1][1]) * 55;
		double yValue = (list[0][0] - list[1][0]) * 69;
		double distance = Math.sqrt(xValue * xValue + yValue * yValue);
		return distance;
	}
}