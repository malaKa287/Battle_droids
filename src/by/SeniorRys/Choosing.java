package by.SeniorRys;

import java.util.Scanner;

public class Choosing {
	static int sword1 = 0;
	static int sword2 = 0;
	static int hummer1 = 0;
	static int hummer2 = 0;
	static private Scanner scr = new Scanner(System.in);

	public static void choose_droid1() {

		System.out.println(Menu_.name2 + "\tchoose your item");
		System.out.println(" Sword - press 2 --------- Hummer - press 3");

		String choose1 = scr.nextLine();
		switch (choose1) {
		case "2":
			sword2 = 1;
			System.out.println("\tSWORD");
			System.out.println("****************************************");
			choose_droid2();
			break;

		case "3":
			hummer2 = 1;
			System.out.println("\tHUMMER");
			System.out.println("****************************************");
			choose_droid2();
			break;
		}
		if (choose1 != "2" && choose1 != "3") {
			System.out.println("Please, enter 2 or 3  ");
			System.out.println("(ಠ╭╮ಠ)  (ಠ╭╮ಠ)  (ಠ╭╮ಠ)");
			choose_droid1();
		}
	}

	public static void choose_droid2() {
		System.out.println(Menu_.name1 + "\t choose your item");

		System.out.println(" Sword - press 2 --------- Hummer - press 3");
		String choose2 = scr.nextLine();
		switch (choose2) {
		case "2":
			sword1 = 1;
			System.out.println("\tSWORD");
			System.out.println("****************************************");
			Battle.droid_battle1();
			break;
		case "3":
			hummer1 = 1;
			System.out.println("\tHUMMER");
			System.out.println("****************************************");
			Battle.droid_battle1();
			break;
		}
		if (choose2 != "2" && choose2 != "3") {
			System.out.println("Please, enter 2 or 3 ");
			System.out.println("╘[◉﹃◉]╕  ╘[◉﹃◉]╕  ╘[◉﹃◉]╕");
			choose_droid2();
		}
		scr.close();
	}

}
