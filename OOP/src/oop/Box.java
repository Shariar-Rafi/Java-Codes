package oop;

public class Box {
	
	public double height,widht,depth;  //instance variable 

	public Box(double h,double wd,double dph){
		this.height=h;
		this.widht= wd;
		this.depth = dph;
		
	}
	
	
	void display() {
		System.out.println();
		System.out.println("Height : "+height);
		System.out.println("Width : "+widht);
		System.out.println("Depth : "+depth);
	double vol = height*widht*depth;
	System.out.println("Volume = "+vol);
		
	}

}
