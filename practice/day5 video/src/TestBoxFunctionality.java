import java.util.Scanner;

class TestBoxFunctionality
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // ✅ Cube Test
        System.out.println("Enter side of cube:");
        Box cube = new Box(sc.nextDouble());
        System.out.println("Volume of cube: " + cube.getBoxVolume());

        // ✅ Equality Test
        System.out.println("Enter 1st Box dims:");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter 2nd Box dims:");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        boolean status = b1.checkEquality(b2);

        if(status)
            System.out.println("SAME");
        else
            System.out.println("DIFFERENT");
    }
}
