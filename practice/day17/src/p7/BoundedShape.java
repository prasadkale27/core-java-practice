package p7;

public abstract class BoundedShape implements AreaComputation, PerimeterComputation {
	private int x,y;

	public BoundedShape(int x, int y) {
		super();
		this.y = y;
		this.x = x;
		
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + "]";
	}
	
}
