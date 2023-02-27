package com.automation.world;


class Box{
	
	int width;
	int height;
	int depth;	
}



public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b;
		b=new Box();
		
		b.width=10;
		b.height=20;
		b.depth=20;
		double volume;
		
	    volume=b.width*b.height*b.depth;
	    System.out.println("Volume of Box b is:"+volume);
	    
	    Box b1;
	    b1=new Box();

		b1.width=20;
		b1.height=30;
		b1.depth=40;
		
		volume=b1.width*b1.height*b1.depth;
	    System.out.println("Volume of Box b1 is:"+volume);
	    
	   
		Box b2;
	    b2=b1;
	    System.out.println("Volume of Box b2 is:"+volume);
	    
	    b2=null;
	    
	    
	    

	}

}
