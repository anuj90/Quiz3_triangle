
public class Triangle extends GeometricObject {
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	public Triangle() {
		
	}
	
     public Triangle(double s1, double s2, double s3) {
    	 side1 = s1;
    	 side2 = s2;
    	 side3 = s3;
    	 System.out.println("The sides of the triangle are: (" + side1+"," + side2+"," + side3 +")" );
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea(){
		double area = 0;
		area = side1*side2*side3;
		return area;		
	}
	
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = side1 + side2 + side3;
		return perimeter;	
	}
	
	public String toString() {
		String s = "Triangle formed!!";		
		return s;
		
		
	}

}
