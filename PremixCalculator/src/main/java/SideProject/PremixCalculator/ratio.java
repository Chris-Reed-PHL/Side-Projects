package SideProject.PremixCalculator;

import java.util.Scanner;

public class ratio extends gas {
//extends gas to pass fuel to premixcalculator by extending this class to it
	protected static float oil;
	
	static Scanner ratioUserInput = new Scanner(System.in);


	public static float getOil() {
		return oil;
	}

	protected static void getUserRatio(){


		System.out.println("Please select a Gas:Oil ratio.");
		System.out.println("1. 50:1");
		System.out.println("2. 40:1");
		System.out.println("3. 32:1");

		try {
			String userRatio=ratioUserInput.nextLine();
			oil= Float.parseFloat(userRatio);
		}catch(NumberFormatException ex) {
			System.out.println("Please enter 1, 2, or 3");
		
			String userRatio=ratioUserInput.nextLine();
			oil= Float.parseFloat(userRatio);
		
		}
	}
}
