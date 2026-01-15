package com.accessspecifier2;
import com.accessspecifier.A;
//same pack non sub class 
class E {
	E(){
		E a1=new E();
		System.out.println("A' state "+ a1.i + " " +a1. j +" " +a1.k+" "+a1.l+ " "); 
	}

}
