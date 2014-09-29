import java.util.Scanner;


public class Main {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		 System.out.println("Triangle Calc!!");
		 
		 System.out.println("Enter the first side: ");
		 double side1 = in.nextDouble();
		 
		 System.out.println("Enter the second side: ");
		 double side2 = in.nextDouble();
		 
		 System.out.println("Enter the third side: ");
		 double side3 = in.nextDouble();
		 
		 
	     Triangle tri1 = new Triangle();
	     Triangle tri2 = new Triangle(side1,side2,side3);
	     double Area = tri2.getArea();
	     System.out.println("The area of the triangle is: "+ Area );
	     
	     double Perimeter = tri2.getPerimeter();
	     System.out.println("The perimeter of the triangle is: "+ Perimeter );
	     
	     String s1 = tri2.toString();
	     System.out.println(s1 );
		 
	}
}
