package SideProject.PremixCalculator;

import java.util.Scanner;

public class PremixCalculator extends ratio{
	static Scanner userInput = new Scanner(System.in);

	public static void main( String[] args ) {

		System.out.println("\n");
		System.out.println("\n");
		System.out.println("This premix calculator will let you know how much 2-Stroke oil you need to add to your gas after filling up!");
		System.out.println("\n");
		System.out.println("                                    ,-~ |\r\n" + 
				"       ________________          o==]___|\r\n" + 
				"      |                |            \\ \\\r\n" + 
				"      |________________|            /\\ \\\r\n" + 
				" __  /  _,-----._      )           |  \\ \\.\r\n" + 
				"|_||/_-~         `.   /()          |  /|]_|_____\r\n" + 
				"  |//              \\ |              \\/ /_-~     ~-_\r\n" + 
				"  //________________||              / //___________\\\r\n" + 
				" //__|______________| \\____________/ //___/-\\ \\~-_\r\n" + 
				"((_________________/_-o___________/_//___/  /\\,\\  \\\r\n" + 
				" |__/(  ((====)o===--~~                 (  ( (o/)  )\r\n" + 
				"      \\  ``==' /                         \\  `--'  /\r\n" + 
				"       `-.__,-'                           `-.__,-'");

		

		System.out.print("Press the enter key to hit the road.");
		userInput.nextLine();
		System.out.println("\n");

		System.out.print("What kind of bike are you riding? ");

		whatRide();
		System.out.println("\n");
		getUserGas();
		System.out.println("\n");
		getUserRatio();
		System.out.println("\n");
		giveOilAmount();
		
	}
	private static void whatRide() {
		String userRide = userInput.nextLine();

		System.out.println("\n");

		System.out.println("WOAH! a " + userRide+"!?" +" Siiiick ride!");
		System.out.println("\n");
		
		System.out.println("   	  .-\"\"\"\"-.\r\n" + 
				"          |==  ==|-.\r\n" + 
				"          |~~ ~~~|`\\\\\r\n" + 
				"          |*FUEL*| ||\r\n" + 
				"          |      |//\r\n" + 
				"          |      |/\r\n" + 
				"          |      |\r\n" + 
				"        __|______|__\r\n" + 
				"       [____________]");
	}


	private static void giveOilAmount() {
	
		
		if(1==(getOil())) {
			oil = (float) (getFuel()* 2.6); 
			System.out.println("Add " + oil +"oz of 2-Stroke Oil to your gas.");
		}else if (2==(getOil())) {
			oil = (float) (getFuel()* 3.2);
			System.out.println("Add " + oil +"oz of 2-Stroke Oil to your gas.");
		}else if(3==(getOil())) {
			oil  = (float) (getFuel()* 4);
			System.out.println("Add " + oil +"oz of 2-Stroke Oil to your gas.");
		}
//		System.out.print("Press the enter key to get another calculation.");
//		userInput.nextLine();
		
//		whatRide();
//		System.out.println("\n");
//		getGas();
//		System.out.println("\n");
//		getRatio();
//		System.out.println("\n");
//		giveOilAmount();
//		
		}
	}


