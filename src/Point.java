
public class Point {
	private int x;
	private int y;
	
	static private int counter;
	
	public Point() {
//		this.x = 999999;
//		this.y = 999999;
		this(0,0); // Use other constructor
	}
	
	public Point(Point p) {
		this(p.getX(), p.getY());
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
		++counter;
		System.out.println("Counter is: " + counter);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return String.format("x: %d, y: %d", this.x, this.y);
	}
}
