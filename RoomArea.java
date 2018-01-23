import java.util.Scanner;

public class RoomArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize Variables & stuff
		float[] vDimen = new float[2];
		String vCont = "Y";
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		while (vCont.matches("[yY]")) {

			// Call dimensions method.

			vDimen = dimensions();

			// Print Result
			//System.out.println("The room is " + vDimen[0] + " by " + vDimen[1] + ".");
			System.out.println("Area " + (vDimen[0] * vDimen[1]));
			System.out.println("Perimeter: " + (2 * (vDimen[0] + vDimen[1])));

			// Ask if they want to do it again.
			String vContInput = "Q";

			while (vContInput.matches("[^ynYN]")) {

				System.out.println();
				System.out.println("Continue? (Y/N)");
				vContInput = scan.next();
				vCont = vContInput;

			}

			// Decide if the user really wants to quit.
			// vCont = vContInput;

			// If Y, go start over again with calling dimensions method as a function of the
			// while loop.
		}

		// If N, clean up and exit.
		System.out.println("Thank you for your input.");
		scan.close();

	}

	public static float[] dimensions() {

		// Prepare the Troops
		Scanner scan = new Scanner(System.in);

		// Declare Variables
		float[] vDim = new float[2];
		float vX;
		float vY;

		// Get Input from User
		System.out.println("Enter Length: ");
		vX = scan.nextFloat();
		System.out.println("Enter Width: ");
		vY = scan.nextFloat();

		// Validate Input
		// If I have Time...

		// Return Input to main Method
		vDim[0] = vX;
		vDim[1] = vY;

		return vDim;

	}
}
