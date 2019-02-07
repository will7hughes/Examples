
public class Rectangle {
	public Rectangle(Point leftUpper, Point leftLower, Point rightUpper, Point rightLower) {
		this.leftUpper = leftUpper;
		this.leftLower = leftLower;
		this.rightUpper = rightUpper;
		this.rightLower = rightLower;
	}


	private Point leftUpper;
	private Point leftLower;
	private Point rightUpper;
	private Point rightLower;
	
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(new Point(0, 1), new Point(0, 0), new Point(2, 1), new Point(2, 0));
		System.out.println(rect);
		Point pointRef = rect.getLeftLower();
		pointRef.setX(100);
		pointRef.setY(100);
		
		System.out.println(rect);
		System.out.println(pointRef);
	}


	public Point getLeftUpper() {
		return new Point(leftUpper);
	}


	public void setLeftUpper(Point leftUpper) {
		this.leftUpper = leftUpper;
	}


	public Point getLeftLower() {
		return new Point(leftLower);
	}


	public void setLeftLower(Point leftLower) {
		this.leftLower = leftLower;
	}


	public Point getRightUpper() {
		return new Point(rightUpper);
	}


	public void setRightUpper(Point rightUpper) {
		this.rightUpper = rightUpper;
	}


	public Point getRightLower() {
		return new Point(rightLower);
	}


	public void setRightLower(Point rightLower) {
		this.rightLower = rightLower;
	}


	@Override
	public String toString() {
		return "Rectangle [leftUpper=" + leftUpper + ", leftLower=" + leftLower + ", rightUpper=" + rightUpper
				+ ", rightLower=" + rightLower + "]";
	}
}
