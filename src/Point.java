public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int xy) {
		this.x = xy;
		this.y = xy;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() { return x; }
	public int getY() { return y; }
	public void setX(int newX) { x = newX; }
	public void setY(int newY) { y = newY; }

	public String coordinate() {
		return "(" + x + ", " + y + ")";
	}

	public String quadrant() { // else not required bc only returning
		if (x == 0 && y == 0) return "origin";
		if (x == 0 || y == 0) return "on an axis";
		if (x > 0 && y > 0) return "I";
		if (x < 0 && y > 0) return "II";
		if (x < 0 && y < 0) return "III";
		return "IV";
	}
}
