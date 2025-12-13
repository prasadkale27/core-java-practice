import java.util.Scanner;

class TestBoxFunctionality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of a cube");
        Box cube = new Box(sc.nextDouble());
        System.out.println("Cube " + cube.getBoxDimensions());

        Box defInitedBox = new Box();
        System.out.println("Def Inited Box " + defInitedBox.getBoxDimensions());

        sc.close();
        System.out.println("main over");
    }
}
