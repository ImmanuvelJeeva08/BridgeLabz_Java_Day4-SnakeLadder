/*****************************************************************************************************************
 *
 *`Rule1 -> Snake and Ladder game played at player position 0
 * Rule2 -> The player roll the die and get the number between 1 to 6
 * Rule3 -> Check option they are no play,Ladder or Snake
 *
 * @author Immanuvel Jeeva
 * @Since 11-07-2021
 *
 *****************************************************************************************************************/

public class Uc3 {

	// Use Function to roll the die
	static void rolldie() {
		int min=1;
		int max=6;
		int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);
	
		System.out.println("Die = "+dieNumber);
	}
	static void checkPlayer(int check) {

		// check They are no play, Ladder or Snake
		switch (check) {
			case 0:
				System.out.println("They are No play");
				break;
			case 1:
				System.out.println("Ladder");
				rolldie();
				break;
			case 2:
				System.out.println("Snake");
				rolldie();
				break;
			default:
				System.out.println("Some thing went wrong");
		}
	}
	public static void main(String[] args) {

		int position=0;
        int player = 1;
        System.out.println("Player in the position = "+position);

		// Generate random Numbers
		int check = (int) Math.floor((Math.random()*10) % 3 );

		// Function call
		checkPlayer(check);
	
	}
}


