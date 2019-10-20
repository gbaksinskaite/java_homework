/*
 *@author Gintare
 */

package lt.vtmc.oop;

public class Main {

	public static void main(String[] args) {
		Circle circle1 = new Circle(3, 4, 1);
		Point point1 = new Point(3, 2);
		point1.setCircle(circle1);		
		point1.moveRight();
		point1.moveRight();
		point1.moveRight();
		System.out.println(point1.toString());
		point1.moveRight();
		point1.moveUp();
		System.out.println(point1.toString());
		point1.moveUp();
		point1.moveLeft();
		System.out.println(point1.toString());	
		
	}

}
