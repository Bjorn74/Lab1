import java.util.Scanner;

public class RoomArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize Variables & stuff
		int[] vDimen = new int[2];
		String vCont = "Y";
		Scanner scan = new Scanner(System.in);

		while (vCont.matches("[yY]")) {

			// Call dimensions method.

			vDimen = dimensions();

			// Print Result
			System.out.println("The room is " + vDimen[0] + " by " + vDimen[1] + ".");
			System.out.println(
					"The room is " + (vDimen[0] * vDimen[1]) + " square generally agreed upon units of measure.");
			System.out.println("The room's perimeter is " + (2 * (vDimen[0] + vDimen[1])) + " of that same unit.");

			// Ask if they want to do it again.
			String vContInput = "Q";

			while (vContInput.matches("[^ynYN]")) {

				System.out.println();
				System.out.println(" Would you like to play again? Y/N");
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

	public static int[] dimensions() {

		// Prepare the Troops
		Scanner scan = new Scanner(System.in);

		// Declare Variables
		int[] vDim = new int[2];
		int vX;
		int vY;

		// Get Input from User
		System.out.println("Please enter the first dimension: ");
		vX = scan.nextInt();
		System.out.println("Please enter the second dimiension: ");
		vY = scan.nextInt();

		// Validate Input
		// If I have Time...

		// Return Input to main Method
		vDim[0] = vX;
		vDim[1] = vY;

		return vDim;

	}
}
