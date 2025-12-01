// default access specifier available within the same packages 
class Box 
{
// state of the Box : tight encapsulation 

private double width , depth , height ;// instance variables
//parameterized constructor to init complete state of the box 

Box(double w, double d, double h)
{

width=w;
depth=d;
this.height=height;

//this keyword is used to un-hide instance var from local var 
//height=height;// no error but it give you wrong result means method local variable its shadowing 
}
//behaviour : methods  
//write a non static (instance method) to return Box details in String form (dimensions of Box)

	String getBoxDimension(){
	return "Box Dims "+this.width+ ""+depth+""+height;
	}
//write a non-static method To return computed volume of the box. 
	double getBoxVolume()
	{
	
	return this.width*this.depth*height;


	}


}