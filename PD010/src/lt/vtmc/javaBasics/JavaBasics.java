/**
* @author Gintare
* @version 1.0 
*
*/
package lt.vtmc.javaBasics;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class JavaBasics {	

	public static void main(String[] args) {
		sortIntArray();
		find120thFibonacci();
		sortStringArray();
		findAverage();
		//sortLongArray();
	}
	/**
	 * 1. Method creates the array of integers from 100 elements, fills will
	 * pseudo-randomly generated numbers and sorts it.
	 */
	private static void sortIntArray() {
		int[] intArray = new int[100];
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			intArray[i] = random.nextInt(200);
		}
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	/**
	 * 2.1. Method finds 120th number of Fibonacci sequence and prints time the
	 * operation took (it must take less than 5s).
	 */
	private static void find120thFibonacci() {
		long start = System.currentTimeMillis();
		BigInteger[] FibonacciSequence = new BigInteger[121];
		FibonacciSequence[0] = BigInteger.valueOf(0);
		FibonacciSequence[1] = BigInteger.valueOf(1);
		for (int i = 2; i < 121; i++) {
			FibonacciSequence[i] = FibonacciSequence[i - 1].add(FibonacciSequence[i - 2]);
		}
		long stop = System.currentTimeMillis();
		System.out.println("The 120th number of Fibonacci sequence is: " + FibonacciSequence[120]
				+ ". This operation took: " + (stop - start) + " mS");
	}
	/**
	 * 2.2. Method creates two arrays of integers, fills will pseudo-randomly
	 * generated numbers and calculates the average of the largest members.
	 */
	private static void findAverage() {
		int[] intArray1 = new int[50], intArray2 = new int[30];
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			intArray1[i] = random.nextInt(100);
		}
		for (int i = 0; i < 30; i++) {
			intArray2[i] = random.nextInt(200);
		}
		Arrays.sort(intArray1);
		Arrays.sort(intArray2);
		System.out.println("Array Nr. 1: " + Arrays.toString(intArray1));
		System.out.println("Array Nr. 2: " + Arrays.toString(intArray2));
		System.out.println("The average of the largest members is: " + (double) (intArray1[49] + intArray2[29]) / 2);
	}
	/**
	 * 3. Method creates the array of 10 Strings elements and sorts it
	 * alphabetically.
	 */
	private static void sortStringArray() {
		String[] names = { "Rachel", "Phoebe", "Joey", "Ross", "Chandler", "Monica", "Gunther", "Richard", "Ursula",
				"Ugly Naked Guy" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
//	/**
//	 * 4. Method creates long array of 50k elements, fills will pseudo-randomly
//	 * generated numbers and sorts it using Quicksort algorithm.
//	 */
//	private static void sortLongArray() {
//		long[] LongArray = new long[50_000];
//		Random random = new Random();
//		for (int i = 0; i < 50_000; i++) {
//			LongArray[i] = (long) random.nextInt(50_001);
//		}
//		Arrays.sort(LongArray);
//		System.out.println(Arrays.toString(LongArray));
//	}
}
