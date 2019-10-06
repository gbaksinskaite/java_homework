/**
* @author Gintare
* @version 1.0 
*/
package lt.vtmc.javaBasics;

import java.util.Scanner;

public class javaBasics {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		checkTriangle();
		calculateDiscriminant();
		guessNumber();
		calcResult_useWhile();
		calcResult_useFor();
		calcSum_useFor();
		calcSum_useWhile();
		calcSum_useDoWhile();
		printTable();
		printAtoZ();
	}

	/**
	 * 1. Method reads lengths of the sides of a triangle as arguments from user
	 * input, tests whether a triangle is right-angled.
	 */

	private static void checkTriangle() {
		System.out.println(
				"Enter the lenghts of the sides of a triangle " + "separated by space and i'll tell you something: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("The sides of a triangle must be greater than zero, try again.");
			checkTriangle();
		}
		// if the longest side is side a or b, it is swapped with side c in order
		// to use Pythagorean-theorem only once
		if ((a > b) && (a > c)) {
			double tmp = c;
			c = a;
			a = tmp;
		} else if ((b > a) && (b > c)) {
			double tmp = c;
			c = b;
			b = tmp;
		}
		if (c * c == a * a + b * b) {
			System.out.println("You have a right-angled triangle.");
		} else {
			System.out.println("You have an oblique triangle.");
		}
	}

	/**
	 * 2. Method reads user input of parameters a, b, c of Quadratic equation, if a
	 * = 0 prints message that equation is linear, else calculates the discriminant
	 * and rounds it up to 2 decimal places.
	 */

	private static void calculateDiscriminant() {

		System.out
				.println("Enter the values of a, b and c of quadratic equation " + "(ax^2+bx+c=0) separated by space:");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double D = 0;
		if (a != 0) {
			D = Math.round((b * b - 4 * a * c) * 100.00) / 100.00;
		} else {
			System.out.println(
					"If a = 0, then the equation is linear, not quadratic. " + "You don't need to use a discriminant.");
			return;
		}
		System.out.println("Discriminant equals to: " + D);
	}

	/**
	 * 3. Method generates a pseudo-random number from 0 to 100 and compares it to
	 * user's guess.
	 */
	private static void guessNumber() {
		int randomNumber = (int) (Math.random() * 100);
		System.out.println("Guess a number from 0 to 100:");
		int yourGess = input.nextInt();
		System.out.println(randomNumber);
		if (yourGess == randomNumber) {
			System.out.println("You won!");
		} else {
			System.out.println("Too bad, you lost :(");
		}
	}

	/**
	 * 4. Method calculates result of y = 3 * x using for loop for x in range [0, 10].
	 */
	private static void calcResult_useFor() {
		for (int x = 0; x <= 10; x++) {
			int y = 3 * x;
			System.out.println("3 x " + x + " = " + y);
		}
	}

	/**
	 * 5. Method calculates result of y = 3 * x using while loop for x in range [0, 10].	  
	 */
	private static void calcResult_useWhile() {
		int x = 0;
		while (x <= 10) {
			int y = 3 * x;
			System.out.println("3 x " + x + " = " + y);
			x++;
		}
	}

	/**
	 * 6. Method adds numbers in range [0, 100] using for loop.
	 */
	private static void calcSum_useFor() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("The sum is: " + sum);
	}

	/**
	 * 7. Method adds numbers in range [0, 100] using while loop.
	 */
	private static void calcSum_useWhile() {//
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("The sum is: " + sum);
	}

	/**
	 * 8. Method adds numbers in range [0, 100] using do-while loop.
	 */
	private static void calcSum_useDoWhile() {//
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("The sum is: " + sum);
	}

	/**
	 * 9. Method prints all capital letters of the English alphabet.
	 */
	private static void printAtoZ() {
		char a = 'A', z = 'Z';
		int y = (int) a, e = (int) z;
		for (int i = y; i <= e; i++) {
			char AtoZ = (char) i;
			System.out.print(AtoZ + " ");
		}
	}

	/**
	 * 10. Method prints a multiplication table for numbers in range [0, 100].
	 */
	private static void printTable() {
		for (int z = 1; z <= 100; z++) {
			for (int y = 1; y <= 100; y++) {
				int q = z * y;
				System.out.println(z + " x " + y + " = " + q);
			}
		}
	}
}