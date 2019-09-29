package lt.vtmc.javabasics;

import java.util.Scanner;

public class JavaSyntax {

	public static void main(String[] args) {
		checkIf();
		checkIfElse();
		checkSwitch();
		checkFor();
		checkWhile();
		checkDoWhile();
		checkBreak();
		checkContinue();
		int sum = checkReturn(10, 9);
		System.out.println("sum = " + sum);
		checkLabeledBreak();
		checkLabeledContinue();
		checkScanner();
	}

	private static void checkIf() {
		int dayNumber = 1;
		if (dayNumber == 1) {
			System.out.println("Today is the day Nr. " + dayNumber + ". It's Monday!");
		}
	}

	private static void checkIfElse() {
		int x = (int) (Math.random() * 7) + 1;
		if (x == 5) {
			System.out.println("Today is the day Nr. " + x + "It's Friday!");
		} else {
			System.out.println("Today is the day Nr. " + x + ". Don't be upset, Friday is just around the corner.");
		}
	}

	private static void checkSwitch() {
		int monthNumber = (int) (Math.random() * 12) + 1;
		switch (monthNumber) {
		case 1:
			System.out.println("It's the month Nr. " + monthNumber + ". It's time to start New Years' resolutions.");
			break;
		case 12:
			System.out.println("It's the month Nr. " + monthNumber + ". It's almost Christmas!");
			break;
		default:
			System.out.println(
					"It's the month Nr. " + monthNumber + ". It's never too early to start Christmas shopping!");
		}
	}

	private static void checkFor() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		for (int i = 0; i <= randomNumber; i++) {
			System.out.println("i = " + i);
		}
	}

	private static void checkWhile() {
		int y = 15;
		while (y < 20) {
			System.out.println("y = " + y);
			y++;
		}
	}

	private static void checkDoWhile() {
		float a = 12.45f;
		do {
			System.out.println("a = " + a);
			a = a + 5.1f;
		} while (a < 35);
	}

	private static void checkBreak() {
		for (int z = 1; z < 6; z++) {
			if (z == 3) {
				break;
			}
			System.out.println("z = " + z);
		}
	}

	private static void checkContinue() {
		for (int v = 2; v < 6; v++) {
			if (v == 4) {
				continue;
			}
			System.out.println("v = " + v);
		}
	}

	private static int checkReturn(int g, int h) {
		return g + h;
	}

	private static void checkLabeledBreak() {
		OuterCycle_1: for (int t = 2; t < 7; t++) {
			System.out.println("t = " + t);
			for (int n = 2; n < 7; n++) {
				System.out.println("n = " + n);
				if (n == 5) {
					break OuterCycle_1;
				}
			}
		}
	}

	private static void checkLabeledContinue() {
		OuterCycle_2: for (int r = 1; r < 3; r++) {
			System.out.println("r = " + r);
			for (int s = 2; s < 6; s++) {
				System.out.println("s = " + s);
				if (s == 4) {
					continue OuterCycle_2;
				}
			}
		}
	}

	private static void checkScanner() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter something:");
		if (input.hasNextInt()) {
			System.out.println("The type of input is Integer.");
		} else if (input.hasNextShort()) {
			System.out.println("The type of input is Short.");
		} else if (input.hasNextLong()) {
			System.out.println("The type of input is Long.");
		} else if (input.hasNextDouble()) {
			System.out.println("The type of input is Double.");
		} else if (input.hasNextByte()) {
			System.out.println("The type of input is Byte.");
		} else if (input.hasNextFloat()) {
			System.out.println("The type of input is Float.");
		} else if (input.hasNextBoolean()) {
			System.out.println("The type of input is Boolean.");
		} else if (input.hasNextLine()) {
			String in = input.nextLine();
			if (in.length() == 1) {
				System.out.println("The type of input is Character.");
			} else {
				System.out.println("The type of input is String.");
			}
		}
	}
}