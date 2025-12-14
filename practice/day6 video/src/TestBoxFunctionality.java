import java.util.Scanner;

class TestBoxFunctionality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of a cube");
        Box cube = new Box(sc.nextDouble());
        System.out.println("Cube " + cube.getBoxDimensions());

        Box defInitedBox = new Box();
        System.out.println("Def Inited Box " + defInitedBox.getBoxDimensions());
	
	 System.out.println("Enter 1st box dimension: w d h ");
	Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

	 System.out.println("Enter 2nd box dimension: w d h ");
	Box b2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	
	System.out.println(b1.checkEquality(b2)?"same":"Different");
	
	System.out.println("Enter the offset from the 1st box dims : width-offset depth-offset height-offset");

	Box b3=b1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	System.out.println("New Box dims "+b3.getBoxDimensions());
	
	

        sc.close();
        System.out.println("main over");
    }
}
