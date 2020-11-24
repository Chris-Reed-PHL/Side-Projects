package SideProject.PremixCalculator;

import java.util.Scanner;

public class gas {
	private static double fuel;

	public static double getFuel() {
		return fuel;
	}

	static Scanner gasuserInput = new Scanner(System.in);

	protected static void getUserGas() {

		System.out.print("How many gallons of gas did you just pump? ");
		

		
		try {
			String userGas =gasuserInput.next();
			fuel = Double.parseDouble(userGas);
		}catch(NumberFormatException ex) {
			System.out.println("\n");
			System.out.println("Invalid Input" +"\n");
			
				getUserGas();
				
			}
			
			
		}
	
}

