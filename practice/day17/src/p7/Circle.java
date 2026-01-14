package p7;

public class Circle extends BoundedShape {
	private double radius;
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Circle  " + super.toString()+" radius=" + radius ;
	}
	
	
	
	
}
