package by.SeniorRys;

import java.util.Scanner;

public class Battle {
	static Scanner scr = new Scanner(System.in);
	static int head1 = 0, head2 = 0;
	static int body1 = 0, body2 = 0;
	static int legs1 = 0, legs2 = 0;
	static String prt1;
	static String prt2;

	public static void names() {
		System.out.print(Menu_.name1 + " - enter you name:");

	}

	public static void droid_battle1() {
		head1 = 0;
		body1 = 0;
		legs1 = 0;

		System.out.println(Menu_.name2 + " choose you protection (1-head  2-body  3-legs)");

		String protect = scr.nextLine();
		switch (protect) {
		case "1":
			System.out.println("\tProtect head!"); {
			head1 = 1;
			prt1 = "head";
			space();
			kick1();
		}
			break;
		case "2":
			System.out.println("\tProtect body!"); {
			body1 = 1;
			prt1 = "body";
			space();
			kick1();
		}
			break;
		case "3":
			System.out.println("\tProtect legs!"); {
			legs1 = 1;
			prt1 = "legs";
			space();
			kick1();
		}
			break;
		}
		if (protect != "1" && protect != "2" && protect != "3") {
			System.out.println("  Please, enter 1 or 2 or 3 ");
			System.out.println("┌༼◉ل͟◉༽┐  ┌༼◉ل͟◉༽┐  ┌༼◉ل͟◉༽┐");
			droid_battle1();
		}

	}

	public static void kick1() {
		int rnd1 = 100 + (int) (Math.random() * ((150 - 100) + 1));
		int rnd = rnd1;
		int dam1 = 45 + (int) (Math.random() * ((55 - 45) + 1));
		int sword1 = dam1;
		int dam2 = 5 + (int) (Math.random() * ((95 - 5) + 1));
		int hummer = dam2;
		int count1 = 0;
		System.out.println(Menu_.name1 + " choose you target (1-head  2-body  3-legs)");

		String kick = scr.nextLine();
		switch (kick) {
		case "1":
			count1 = 1;
			System.out.println("\tKick in head!");
			System.out.println("\tProtect " + prt1);
			if (head1 == 1) {
				System.out.println("oops, protect");
				head1--;

			} else {
				if (head1 == 0) {
					Droid.second_droid_hp = Droid.second_droid_hp - rnd;
					System.out.println(" Damage is " + rnd);
					if (Choosing.sword1 == 1) {
						Droid.second_droid_hp = Droid.second_droid_hp - sword1;
						System.out.println(" Sword damaged: " + sword1);
					}
					if (Choosing.hummer1 == 1) {
						Droid.second_droid_hp = Droid.second_droid_hp - hummer;
						System.out.println(" Hummer damaged: " + hummer);
					}

					System.out.println(Menu_.name2 + ": you HP " + Droid.second_droid_hp);

				}
			}
			break;
		case "2":
			count1 = 1;
			System.out.println("\tKick in body!");
			System.out.println("\tProtect " + prt1);
			if (body1 == 1) {
				System.out.println("oops, protect");
				body1--;

			} else {
				if (body1 == 0) {
					Droid.second_droid_hp = Droid.second_droid_hp - rnd;
					System.out.println(" Damage is " + rnd);
					if (Choosing.sword1 == 1) {
						Droid.second_droid_hp = Droid.second_droid_hp - sword1;
						System.out.println(" Sword damaged: " + sword1);
					}
					if (Choosing.hummer1 == 1) {
						Droid.second_droid_hp = Droid.second_droid_hp - hummer;
						System.out.println(" Hummer damaged: " + hummer);
					}
					System.out.println(Menu_.name2 + ": you HP " + Droid.second_droid_hp);
				}
			}
			break;
		case "3":
			count1 = 1;
			System.out.println("\tKick in legs!");
			System.out.println("\tProtect " + prt1);
			if (legs1 == 1) {
				System.out.println("oops, protect");
				legs1--;

			} else {
				if (legs1 == 0) {
					Droid.second_droid_hp = Droid.second_droid_hp - rnd;
					System.out.println(" Damage is " + rnd);
					if (Choosing.sword1 == 1) {
						Droid.second_droid_hp = Droid.second_droid_hp - sword1;
						System.out.println(" Sword damaged: " + sword1);
					}
					if (Choosing.hummer1 == 1) {
						Droid.second_droid_hp = Droid.second_droid_hp - hummer;
						System.out.println(" Hummer damaged: " + hummer);
					}
					System.out.println(Menu_.name2 + ": you HP " + Droid.second_droid_hp);
				}
			}
			break;
		}
		if (count1 == 0) {
			System.out.println("  Please, enter 1 or 2 or 3 ");
			System.out.println("୧( ಠ┏ل͜┓ಠ )୨  ୧( ಠ┏ل͜┓ಠ )୨  ୧( ಠ┏ل͜┓ಠ )୨");
			kick1();
		}
		droid_battle2();
	}

	//////////////////////////////////////////////////////////////////////
	public static void droid_battle2() {
		head2 = 0;
		body2 = 0;
		legs2 = 0;
		int count2 = 0;
		System.out.println(Menu_.name1 + " choose you protection (1-head  2-body  3-legs)");
		String protectt = scr.nextLine();
		switch (protectt) {
		case "1":
			count2 = 1;
			System.out.println("\tProtect head!");
			head2 = 1;
			prt2 = "head";
			kick2();
			break;
		case "2":
			count2 = 1;
			System.out.println("\tProtect body!");
			body2 = 1;
			prt2 = "body";
			kick2();
			break;
		case "3":
			count2 = 1;
			System.out.println("\tProtect legs!");
			legs2 = 1;
			prt2 = "legs";
			kick2();
			break;
		}

		if (count2 == 0) {
			System.out.println("\tPlease, enter 1 or 2 or 3 ");
			System.out.println("(◕ل͜◕)  (◕ل͜◕)  (◕ل͜◕)");
			droid_battle2();
		}

	}

	public static void kick2() {
		int rnd2 = 100 + (int) (Math.random() * ((150 - 100) + 1));
		int rnd = rnd2;
		int dam1 = 45 + (int) (Math.random() * ((55 - 45) + 1));
		int sword2 = dam1;
		int dam2 = 5 + (int) (Math.random() * ((95 - 5) + 1));
		int hummer = dam2;
		int count3 = 0;
		for (int clear = 0; clear < 10; clear++) ///////////
		{
			System.out.println("\n");
		}
		System.out.println(Menu_.name2 + " choose you target (1-head  2-body  3-legs)");

		String kickk = scr.nextLine();
		switch (kickk) {
		case "1":
			count3 = 1;
			System.out.println("\tKick in head!");
			System.out.println("\tProtect " + prt2);
			if (head2 == 1) {
				System.out.println("oops, protect");
				head2--;
			} else {
				if (head2 == 0) {
					Droid.first_droid_hp = Droid.first_droid_hp - rnd;
					System.out.println(" Damage is " + rnd);
					if (Choosing.sword2 == 1) {
						Droid.first_droid_hp = Droid.first_droid_hp - sword2;
						System.out.println(" Sword damaged: " + sword2);
					}
					if (Choosing.hummer2 == 1) {
						Droid.first_droid_hp = Droid.first_droid_hp - hummer;
						System.out.println(" Hummer damaged: " + hummer);
					}
					System.out.println(Menu_.name1 + ": you HP " + Droid.first_droid_hp);
				}
			}
			break;
		case "2":
			count3 = 1;
			System.out.println("\tKick in body!");
			System.out.println("\tProtect " + prt2);
			if (body2 == 1) {
				System.out.println("oops, protect");
				body2--;
			} else {
				if (body2 == 0) {
					Droid.first_droid_hp = Droid.first_droid_hp - rnd;
					System.out.println(" Damage is " + rnd);
					if (Choosing.sword2 == 1) {
						Droid.first_droid_hp = Droid.first_droid_hp - sword2;
						System.out.println(" Sword damaged: " + sword2);
					}
					if (Choosing.hummer2 == 1) {
						Droid.first_droid_hp = Droid.first_droid_hp - hummer;
						System.out.println(" Hummer damaged: " + hummer);
					}
					System.out.println(Menu_.name1 + ": you HP " + Droid.first_droid_hp);
				}
			}
			break;
		case "3":
			count3 = 1;
			System.out.println("\tKick in legs!");
			System.out.println("\tProtect " + prt2);
			if (legs2 == 1) {
				System.out.println("oops, protect");
				legs2--;
			} else {
				if (legs2 == 0) {
					Droid.first_droid_hp = Droid.first_droid_hp - rnd;
					System.out.println(" Damage is " + rnd);
					if (Choosing.sword2 == 1) {
						Droid.first_droid_hp = Droid.first_droid_hp - sword2;
						System.out.println(" Sword damaged: " + sword2);
					}
					if (Choosing.hummer2 == 1) {
						Droid.first_droid_hp = Droid.first_droid_hp - hummer;
						System.out.println(" Hummer damaged: " + hummer);
					}
					System.out.println(Menu_.name1 + ": you HP " + Droid.first_droid_hp);
				}
			}
			break;
		}

		if (count3 == 0) {
			System.out.println("\tPlease, enter 1 or 2 or 3  ");
			System.out.println(" ヽ༼◐ل͜◑༽ﾉ    ヽ༼◐ل͜◑༽ﾉ    ヽ༼◐ل͜◑༽ﾉ");
			kick2();
		}

		if (Droid.first_droid_hp >= 0 && Droid.second_droid_hp >= 0) {
			droid_battle1();
		} else if (Droid.first_droid_hp <= 0 && Droid.second_droid_hp <= 0) {
			System.out.println(Menu_.name2 + ": you HP " + Droid.second_droid_hp);
			System.out.println("Wow, it's a DROW");
			Droid.first_droid_hp = 1000;
			Droid.second_droid_hp = 1000;
			restart();
		} else if (Droid.first_droid_hp <= 0) {
			System.out.println(Menu_.name2 + ": you HP " + Droid.second_droid_hp);
			System.out.println("Congratulations!  "+Menu_.name2 + " WIN!!!");
			Droid.first_droid_hp = 1000;
			Droid.second_droid_hp = 1000;
			restart();
		} else if (Droid.second_droid_hp <= 0) {
			System.out.println(Menu_.name1 + ": you HP " + Droid.first_droid_hp);
			System.out.println(Menu_.name2 + ": you HP " + Droid.second_droid_hp);
			System.out.println("Congratulations! " + Menu_.name1 + " WIN!!!");
			Droid.first_droid_hp = 1000;
			Droid.second_droid_hp = 1000;
			restart();
		}
	}

	public static void restart() {
		System.out.println("\n\tTo restart game press    1");
		System.out.println("\tTo exit press            2");
		String end = scr.nextLine();
		switch (end) {
		case "1":
			Choosing.choose_droid1();
			break;
		case "2":
			System.out.println("\tBuy  ヽ༼ ʘ̚ل͜ʘ̚༼◕_◕༽◉_◔ ༽ﾉ  ");
			System.exit(0);
		}
		if (end != "1" && end != "2") {
			System.out.println("Please, enter 1 or 2 ");
			System.out.println(" ヽ༼ ຈل͜ຈ༼ ▀̿̿Ĺ̯̿̿▀̿ ̿༽Ɵ͆ل͜Ɵ͆ ༽ﾉ     ヽ༼ ຈل͜ຈ༼ ▀̿̿Ĺ̯̿̿▀̿ ̿༽Ɵ͆ل͜Ɵ͆ ༽ﾉ");
			restart();
		}

	}

	public static void space() {
		for (int clear = 0; clear < 10; clear++) ///////////
		{
			System.out.println("\n");
		}
	}
}
