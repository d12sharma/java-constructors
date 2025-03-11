import java.util.*;
class  AreaOfCircle{
	private int radius;
	
	AreaOfCircle(){
		this.radius=5;
	}
	
	public AreaOfCircle (int radius){
		this.radius = radius;
	}
	
	public void displayDetails(){
		System.out.println("The Area of circle is :"+Math.PI*radius*radius);
		System.out.println("The Circumference of circle is "+ 2*Math.PI*radius);
	}
	public static void main(String[] args){
		AreaOfCircle area1 = new AreaOfCircle();
		area1.displayDetails();
		AreaOfCircle area2 = new AreaOfCircle(10);
		area2.displayDetails();
	}
	
}
/*
Output
The Area of circle is :78.53981633974483
The Circumference of circle is 31.41592653589793
The Area of circle is :314.1592653589793
The Circumference of circle is 62.83185307179586
*/