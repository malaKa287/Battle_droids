package by.SeniorRys;

import java.util.Scanner;

public class Menu_ {
	static Scanner scr = new Scanner(System.in);
	static String name1, name2;

	public static void enterNames() {
		String nameOne, nameTwo;
		System.out.print("Player one, enter you name: ");
		nameOne = scr.nextLine();
		System.out.print("Player two, enter you name: ");
		nameTwo = scr.nextLine();
		if (nameOne.trim().isEmpty() || nameTwo.trim().isEmpty()) {
			System.out.println("\nPlease, enter you name \n");
			enterNames();
		} else {
			name1 = nameOne;
			name2 = nameTwo;
			menu();
		}
	}

	public static void menu() {

		System.out.println(" \n To select your weapon press 1");
		System.out.println(" To read info press          2");
		String press = scr.nextLine();

		switch (press) {
		case "1":
			Choosing.choose_droid1();
			break;
		case "2":
			Info.info();
			break;
		
		default:
			System.out.println("Please, enter 1 or 2");
			System.out.println("|_(ツ)_|  |_(ツ)_|  |_(ツ)_|");
			menu();
		}
		scr.close();
	}
}