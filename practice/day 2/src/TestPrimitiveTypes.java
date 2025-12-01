public class TestPrimitiveTypes {


public static void main(String []  args )
{

		byte b1=10;// error: incompatible types: possible lossy conversion from int to byte
		byte b2=20;
		byte b3=b1+b2;//RHS : int , LHS  : byte --javac err
		int b3=b1+b2;//no javac error
		byte b4=(byte)(b1+b2);//no javac err typecasting or widening 	 loose some of the precision 

 


} }
//compile time error