/**
*@author Gintare
*@version 1.0
*/

package lt.vtmc.oop;

public class UsingCalculator {

	public static void main(String[] args) {

		/*
		 * static methods of the Calculator class, which were called without creating an
		 * object
		 */
		Calculator.add(56.89, -999.78);
		Calculator.substract(5_987.655, 64_464.357);
		Calculator.divide(9_846.7456, -987);
		Calculator.multiplicate(9.896, 3.87);
		Calculator.findSquareRoot(323_761);
		Calculator.raiseTo2ndPower(123.89);
		Calculator.raiseToNthPower(89.89, 5.8);
		Calculator.findSin(100.79);
		Calculator.findCos(45);
		Calculator.findTg(60.89);
		Calculator.findCtg(90);
		Calculator.calculatePercentage(55.40, 580.78);
		Calculator.findModulus(10, 560);

		/*
		 * This method prints how many methods were called before it, using static
		 * variable of the Calculator class
		 */
		System.out.println("The number of operations: " + Calculator.operationCounter);
	}

}
