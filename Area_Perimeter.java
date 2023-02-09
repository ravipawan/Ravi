package javapractise;

public class Area_Perimeter {

	public static void main(String[] args) {
		Circle  mc =new Circle(4);
		System.out.println("Area of Circle"+mc.getArea() );
		System.out.println("Perimeter of Circle"+mc.getPerimeter());

		Rectangle mr =new Rectangle(4,8);

		System.out.println("Area of Rectangle"+mr.getArea());
		System.out.println("Perimeter of rectangle"+mr.getPerimeter());


		System.out.println(mc.toString());
		System.out.println(mr.toString());


	}


}