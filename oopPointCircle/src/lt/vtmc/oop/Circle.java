package lt.vtmc.oop;

public class Circle {
	private int radius;
	private int centerX;
	private int centerY;

	public Circle(int radius, int centerX, int centerY) {
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	public int getRadius() {
		return radius;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}
	@Override
	public String toString() {
		return "Circle [radius = " + radius + ", centerX = " + centerX + ", centerY = " + centerY + "]";
	}

}
