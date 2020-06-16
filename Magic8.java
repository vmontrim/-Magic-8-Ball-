import java.util.Scanner;

public class Magic8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean loopCheck = true;;
		String shakeAgain;
		int eightBall;
		System.out.println("Ferociously shakes Magic 8-ball!!!");
		System.out.println("");
		do { 
			eightBall = (int) (Math.random() * 8);
			
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
			
			System.out.println("Do you dare shake again? Please enter: (Yes, or No)");
			shakeAgain = input.nextLine();

			if (shakeAgain.equalsIgnoreCase("yes")) {
				loopCheck = true;
			}else {
				loopCheck = false;
			}
			
		} while(loopCheck);
		
		input.close();
	}

}
