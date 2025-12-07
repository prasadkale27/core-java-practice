//import java.util.Scanner;

//class CreateBox	
//{

//public static void main(String [] args )
//{

	//create scanner's instance to wrap std i/p
	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Box Dimensions: w d h");
//	Box box1;//ref type of var (class type of ref ) , no object created so far, method local var :
//	//mem allocated of the stack :as per jvm specification 32 bit - 4 bytes and 64 bit jvm amd 64 bit - 
//	//System.out.println(box1);javac error 
//	box1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//box class loaded in method area its instance is created in heap 
//	//print box dimension 
//	System.out.println(box1.getBoxDimension());
	//print box volume 
	//System.out.println("volume" + Box.getBoxVolume());// compile time error becuase its not a static method 
//	System.out.println("volume :" + box1.getBoxVolume());// ref type of variable it works at all 
	



	//Resource leak: sc is never closed
	//close scanner 
//	sc.close();
	

//}




//}






import java.util.Scanner;

class CreateBox
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Box Dimensions: w d h");

        Box box1 = new Box(
            sc.nextDouble(),
            sc.nextDouble(),
            sc.nextDouble()
        );

        // Print box dimensions
        System.out.println("Box 1 dimension " + box1.getBoxDimension());

        // Print box volume
        System.out.println("volume : " + box1.getBoxVolume());

	Box box2=new Box(4,5,6);
	System.out.println("Box 2 dimension " + box2.getBoxDimension());
	Box box3=box1;//copy of ref 
	System.out.println("Box 3 dimension " + box3.getBoxDimension());
	box1=box3=null;//How many objects are marked for GC 
	System.out.println("Box 1 dimension " + box1.getBoxDimension());//java.lang.Null Pointer exception 



        sc.close();
	System.out.println("main over");

    }
}
 