import java.util.Scanner;

/*
 * Class that computes the average of values given by user
 * 
 * @author Colin Ferris
 * 
 */
public class ComputeAverage {

	public static void main(String[] args) {
		
		// Create a new Scanner object
		Scanner input = new Scanner (System.in);
		
		// Prompt user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
				
		// Compute average
		double average = (number1 + number2 + number3)/3;
		
		// Display results
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

	}

}
