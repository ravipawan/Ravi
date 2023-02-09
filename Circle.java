package javapractise;

public class Circle implements Geometric{

	double radius;

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	Circle(double radius){
		this.radius=radius;

	}

	@Override
	public double getArea() {


		 return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}

}