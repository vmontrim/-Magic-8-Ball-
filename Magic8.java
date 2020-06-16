import java.util.Scanner;

/*
 * This program is to simulate a magic 8 ball toy.
 * Written by Hunter M. Shaw on 6/2/2020
 */
public class Magic8 {

	public static void main(String[] args) {
		//A Scanner named input used to read the input from a user. 
		Scanner input = new Scanner(System.in);
		
		//Create a boolean to handle the loop.
		boolean loopCheck = true;;
		//Create a String, used to hold shake again or not.
		String shakeAgain;
		//int used to store a value of 1-8. Which is a fate decided by the Magic 8 Ball
		int eightBall;
		//Print a statement for the User. 
		System.out.println("Ferociously shakes Magic 8-ball!!!");
		System.out.println("");
		//create a loop for the User to shake the magic 8 ball more than once. 
		do {
			
			//Change the value on the eight ball for the next shake if there is another one. 
			eightBall = (int) (Math.random() * 8);
			
			//switch to give out fates based upon the value given to integer eightBall.
			switch (eightBall) {
			case 0:
				System.out.println("Yes!");
				break;
			case 1:
				System.out.println("Leave a message after the tone.");
				break;
			case 2:
				System.out.println("Pizza is great!");
				break;
			case 3:
				System.out.println("BEHIND YOU!!!");
				break;
			case 4:
				System.out.println("Error 404 not found. ");
				break;
			case 5:
				System.out.println("Sure?");
				break;
			case 6:
				System.out.println("No!");
				break;
			case 7:
				System.out.println("You will be spooked!");
				break;
			}
			
			
			//Prompts the User to shake the Magic 8 Ball again.
			System.out.println("Do you dare shake again? Please enter: (Yes, or No)");
			shakeAgain = input.nextLine();
			
			//Check for if Input was Yes or no. If Yes loopCheck is true. If no loopCheck is false. 
			if (shakeAgain.equalsIgnoreCase("yes")) {
				loopCheck = true;
			}else {
				loopCheck = false;
			}
			
		} while(loopCheck);
		
		//Close the Scanner. 
		input.close();
	}

}