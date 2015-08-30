import java.util.Scanner;


/*
 * Class that computes the area of a circle given through
 * use input on the keyboard. 
 * 
 * @author Colin Ferris
 */
public class ComputeArea {

	public static void main (String[] args){
		// Create a new SCanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		
		//Assign input to radius variable
		double radius = input.nextDouble();
		
		// Compute the area
		double area = (radius*radius) * 3.14159;
		
		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
	}
}
