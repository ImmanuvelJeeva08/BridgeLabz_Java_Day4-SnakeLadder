/*****************************************************************************************************************
 *
 *`Rule1 -> Snake and Ladder game played at player position 0
 * Rule2 -> The player roll the die and get the number between 1 to 6
 * Rule3 -> Check option they are no play,Ladder or Snake
 * Rule4 -> Repeat till the player reaches the winning position 100
 * Rule5 -> Ensure the Player gets the Exact Winning Position 100
 * Rule6 -> Find the Number of times the dice was played to win the game
 * 			Also Position the player position after every die role
 * Rule7 ->	Play the game with 2 Players
 *   		In case if player gets Ladder then Play again
 *   		Find which player win the game
 *
 * @author Immanuvel Jeeva
 * @Since 11-07-2021
 *
 ****************************************************************************************************************/
import java.util.*;
public class Uc7 {

	// Class level variables
	static int total = 0;
	static int total1 = 0;
	static int count = 0;
	static int count1 = 0;

	// Use method for player
	static void player() {
		while (total < 100) {

			int check = (int) Math.floor((Math.random() * 10) % 3);
			checkPlayer(check);
		}
	}

	static void player1() {
		while (total1 < 100) {

			int check1 = (int) Math.floor((Math.random() * 10) % 3);
			checkPlayer1(check1);
		}
	}

	// use method to roll the die
	// Player1 Properties

	static void rolldie() {
		int min = 1;
		int max = 6;
		int dieNumber = (int) Math.floor(Math.random() * (max - min) + min);

		System.out.println("Player 1 is roll the die");
		System.out.println("Die = " + dieNumber);

		count = count + 1;  // Count how many times the Die was played

		if (total + dieNumber <= 100) {
			total = total + dieNumber;

			// Print player position after every die

			System.out.println("Player1 in the position = " + total);
			switch (total) {
				case 10:
					System.out.println("Ladder");
					total = total + 10;
					System.out.println("After Ladder = " + total);
					player();
					break;
				case 20:
					System.out.println("Snake");
					total = total - 5;
					System.out.println("After Snake = " + total);
					player1();
					break;
				case 30:
					System.out.println("Ladder");
					total = total + 10;
					System.out.println("After Ladder = " + total);
					player();
					break;
				case 40:
					System.out.println("Snake");
					total = total - 5;
					System.out.println("After Snake = " + total);
					player1();
					break;
				case 50:
					System.out.println("Ladder");
					total = total + 10;
					System.out.println("After Ladder = " + total);
					player();
					break;
				case 60:
					System.out.println("Snake");
					total = total - 5;
					System.out.println("After Snake = " + total);
					player1();
					break;
				case 70:
					System.out.println("Ladder");
					total = total + 10;
					System.out.println("After Ladder = " + total);
					player();
					break;
				case 80:
					System.out.println("Snake");
					total = total - 5;
					System.out.println("After Snake = " + total);
					player1();
					break;
				case 90:
					System.out.println("Ladder");
					total = total + 10;
					System.out.println("After Ladder = " + total);
					player();
					break;
				case 100:
					System.out.println("Player in the position = " + total);
					System.out.println("Exit");
					System.out.println(count + " times the dice was played to win the game");
					break;
				default:
					player1();
			}
		} else {
			rolldie();
		}
	}

	static void checkPlayer(int check) {

		// check the the player not play or go to the die

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

	// Player 2 properties

	static void player1rolldie() {
		int minimum = 1;
		int maximum = 6;
		int dieNumber1 = (int) Math.floor(Math.random() * (maximum - minimum) + minimum);

		System.out.println("Die = " + dieNumber1);

		count1 = count1 + 1;

		if (total1 + dieNumber1 <= 100) {
			total1 = total1 + dieNumber1;
			System.out.println("Player2 in the position = " + total1);
			switch (total1) {
				case 10:
					System.out.println("Ladder");
					total1 = total1 + 10;
					System.out.println("After Ladder = " + total1);
					player1();
					break;
				case 20:
					System.out.println("Snake");
					total1 = total1 - 5;
					System.out.println("After Snake = " + total1);
					player();
					break;
				case 30:
					System.out.println("Ladder");
					total1 = total1 + 10;
					System.out.println("After Ladder = " + total1);
					player1();
					break;
				case 40:
					System.out.println("Snake");
					total1 = total1 - 5;
					System.out.println("After Snake = " + total1);
					player();
					break;
				case 50:
					System.out.println("Ladder");
					total1 = total1 + 10;
					System.out.println("After Ladder = " + total1);
					player1();
					break;
				case 60:
					System.out.println("Snake");
					total1 = total1 - 5;
					System.out.println("After Snake = " + total1);
					player();
					break;
				case 70:
					System.out.println("Ladder");
					total1 = total1 + 10;
					System.out.println("After Ladder = " + total1);
					player1();
					break;
				case 80:
					System.out.println("Snake");
					total1 = total1 - 5;
					System.out.println("After Snake = " + total1);
					player();
					break;
				case 90:
					System.out.println("Ladder");
					total1 = total1 + 10;
					System.out.println("After Ladder = " + total1);
					player1();
					break;
				case 100:
					System.out.println("Player in the position = " + total1);
					System.out.println("Exit");
					System.out.println(count1 + " times the dice was played to win the game");
					break;
				default:
					player();

			}
		} else {
			player1rolldie();
		}
	}

	static void checkPlayer1(int check1) {

		// check the player not play or go die

		switch (check1) {
			case 0:
				System.out.println("They are No play");
				break;
			case 1:
				player1rolldie();
				break;
			case 2:
				player1rolldie();
				break;
			default:
				System.out.println("Some thing went wrong");
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many players want to play");
		int players = sc.nextInt();

		player();   // player1 go to play
		player1();  // player2 go to play

		if (count < count1) { // check who will wim player1 or player2
			System.out.println("Player 1 is first reached Winning position");
		} else {
			System.out.println("Player 2 is first reached Winning position");
		}
	}
}



