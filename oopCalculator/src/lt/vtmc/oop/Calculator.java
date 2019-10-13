package lt.vtmc.oop;

public class Calculator {

	static int operationCounter = 0;

	public static void add(double a, double b) {
		double result1 = a + b;
		System.out.printf(a + " + " + b + " = " + "%.4f\n", result1);
		operationCounter++;
	}

	public static void substract(double c, double d) {
		double result2 = c - d;
		System.out.printf(c + " - " + d + " = " + "%.4f\n", result2);
		operationCounter++;
	}

	public static void divide(double e, double f) {
		double result3 = e / f;
		System.out.printf(e + " / " + f + " = " + "%.4f\n", result3);
		operationCounter++;
	}

	public static void multiplicate(double g, double h) {
		double result4 = g * h;
		System.out.printf(g + " * " + h + " = " + "%.4f\n", result4);
		operationCounter++;
	}

	public static void findSquareRoot(double i) {
		double result5 = Math.sqrt(i);
		System.out.printf("The square root of " + i + " is " + "%.4f\n", result5);
		operationCounter++;
	}

	public static void raiseTo2ndPower(double j) {
		double result6 = Math.pow(j, 2);
		System.out.printf(j + " ^2 " + " = " + "%.4f\n", result6);
		operationCounter++;
	}

	public static void raiseToNthPower(double m, double n) {
		double result7 = Math.pow(m, n);
		System.out.printf(m + " ^ " + n + " = " + "%.4f\n", result7);
		operationCounter++;
	}

	public static void findSin(double k) {
		double result8 = Math.sin(Math.toRadians(k));
		System.out.printf("sin " + k + " degrees" + " = " + "%.4f\n", result8);
		operationCounter++;
	}

	public static void findCos(double l) {
		double result9 = Math.cos(Math.toRadians(l));
		System.out.printf("cos " + l + " degrees" + " = " + "%.4f\n", result9);
		operationCounter++;
	}

	public static void findTg(double o) {
		double result10 = Math.tan(Math.toRadians(o));
		System.out.printf("tg " + o + " degrees" + " = " + "%.4f\n", result10);
		operationCounter++;
	}

	public static void findCtg(double p) {
		double result11 = 1 / Math.tan(Math.toRadians(p));
		System.out.printf("ctg " + p + " degrees" + " = " + "%.4f\n", result11);
		operationCounter++;
	}

	public static void calculatePercentage(double r, double s) {
		double result12 = s / 100 * r;
		System.out.printf(r + " %% of " + s + " = " + "%.4f\n", result12);
		operationCounter++;
	}

	public static void findModulus(int w, int z) {
		int result13 = w % z;
		System.out.printf(w + " %% " + z + " = " + result13 + "\n");
		operationCounter++;
	}

}