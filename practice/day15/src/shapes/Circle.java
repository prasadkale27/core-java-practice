package shapes;
import static java.lang.Math.PI; 
public class Circle extends BoundedShape {
	// additional state
	private double radius;

	public Circle(int x, int y, double radius) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.radius = radius;
		}
	@Override  //implementing inherited abstract method 
	public double area () {
		return  PI*radius*radius;
	}
	public String toString() {
		return "Circle"+super.toString()+"radius="+radius ;
	}
}
