package lt.vtmc.oop;

public class Point implements Movable {

	/*
	 * A Circle object is an instance variable of a Point object.
	 */
	
	private int positionX;
	private int positionY;
	private Circle circle;

	public Point(int positionX, int positionY) {

		this.positionX = positionX;
		this.positionY = positionY;
	}

	@Override
	public void moveUp() {
		if (this.positionY < (circle.getCenterY() + (Math.sqrt(Math.pow(circle.getRadius(), 2) 
				- Math.pow((circle.getCenterX()-this.positionX), 2))))-1) {
			this.positionY++;
			System.out.println("The point moved one position up.");
		} else {
			System.out.println("The point can't move up, it will be outside the circle.");
		}

	}

	@Override
	public void moveDown() {

		if (this.positionY < (circle.getCenterY() -+ (Math.sqrt(Math.pow(circle.getRadius(), 2) 
				- Math.pow((circle.getCenterX()-this.positionX), 2))))+1) {
			this.positionY--;
			System.out.println("The point moved one position down.");
		} else {
			System.out.println("The point can't move down, it will be outside the circle.");
		}
	}
	
	@Override
	public void moveLeft() {

		if (this.positionX > (circle.getCenterX() - (Math.sqrt(Math.pow(circle.getRadius(), 2) 
				- Math.pow((this.positionY-circle.getCenterY()), 2))))+1) {
			this.positionX--;
			System.out.println("The point moved one position to the left.");
		} else {
			System.out.println("The point can't move left, it will be outside the circle.");
		}
	}

	@Override
	public void moveRight() {
		if (this.positionX < (circle.getCenterX() + (Math.sqrt(Math.pow(circle.getRadius(), 2) 
				- Math.pow((this.positionY-circle.getCenterY()), 2))))-1) {
			this.positionX++;
			System.out.println("The point moved one position to the right.");
		} else {
			System.out.println("The point can't move right, it will be outside the circle.");
		}
	}
	
	/*
	 * Method checks if distance from Point to center of Circle is shorter than radius of Circle 
	 * and sets Circle as variable of Point object, if it is true.
	 */
	public void setCircle(Circle circle) {
		if (Math.sqrt(Math.pow((this.getPositionY()-circle.getCenterY()), 2) + Math.pow((circle.getCenterX() - this.getPositionX()), 2))
			< circle.getRadius()) {
			this.circle = circle;
		} else {
			System.out.println("This point is outside the circle.");
		}
	}
	
	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	@Override
	public String toString() {
		return "Point [positionX = " + positionX + ", positionY = " + positionY + "]";
	}

	public Circle getCircle() {
		return circle;
	}
}
