package javapractise;


public class Rectangle implements Geometric{
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	double width;
	double length;

	Rectangle(double width , double length){
		this.width=width;
		this.length=length;
	}

	@Override
	public double getArea() {

		return width * length;
	}

	@Override
	public double getPerimeter() {

		return 2 * (width + length);
	}




}