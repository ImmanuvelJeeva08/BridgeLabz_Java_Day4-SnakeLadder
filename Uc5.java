/*****************************************************************************************************************
 *
 *`Rule1 -> Snake and Ladder game played at player position 0
 * Rule2 -> The player roll the die and get the number between 1 to 6
 * Rule3 -> Check option they are no play,Ladder or Snake
 * Rule4 -> Repeat till the player reaches the winning position 100
 * Rule5 -> Ensure the Player gets the Exact Winning Position 100
 *
 * @author Immanuvel Jeeva
 * @Since 11-07-2021
 *
 ****************************************************************************************************************/

public class Uc5 {

	// class level variables
	static int total=0;

	//  The player roll die using method
	static void rolldie() {
		int min=1;
		int max=6;
		int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);
	
		System.out.println("Die = "+dieNumber);
	 
		if (total + dieNumber <= 100) {  // Ensure the player current position + die Number not goto >100
			total=total+dieNumber;
   
   		// Print the Player position after every die

		System.out.println("Player in the position = "+total);
		switch (total) {
			case 10:
				System.out.println("Ladder");
				total=total+10;
				System.out.println("After Ladder = "+total);
				break;
			case 20:
				System.out.println("Snake");
				total=total-5;
				System.out.println("After Snake = "+total);
				break;
			case 30:
				System.out.println("Ladder");
				total=total+10;
				System.out.println("After Ladder = "+total);
				break;
			case 40:
				System.out.println("Snake");
				total=total-5;
				System.out.println("After Snake = "+total);
				break;
			case 50:
				System.out.println("Ladder");
				total=total+10;
				System.out.println("After Ladder = "+total);
				break;
			case 60:
				System.out.println("Snake");
				total=total-5;
				System.out.println("After Snake = "+total);
				break;
			case 70:
				System.out.println("Ladder");
				total=total+10;
				System.out.println("After Ladder = "+total);
				break;
			case 80:
				System.out.println("Snake");
				total=total-5;
				System.out.println("After Snake = "+total);
				break;
			case 90:
				System.out.println("Ladder");
				total=total+10;
				System.out.println("After Ladder = "+total);
				break;
			case 100:
				System.out.println("Exit");
				break;
		}
		}
		else {
			rolldie();
		}
	}

	static void checkPlayer(int check) {

	// Check the player not play or go to die

		switch (check) {
			case 0:
				System.out.println("They are No play");
				break;
			case 1:
				rolldie();
				break;
			case 2:
				rolldie();
				break;
			default:
				System.out.println("Some thing went wrong");
		}
	}

	
	public static void main(String[] args) {

		int player = 1;
		int position = 0;
		System.out.println("Player in the position = " + position);

		while (total < 100) {  // Loop continue until the player reach 100

			int check = (int) Math.floor((Math.random() * 10) % 3);

			// Function call
			checkPlayer(check);
		}
	}
}


