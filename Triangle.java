package javapractise;

public class Triangle {

	
		int a;
		int b;
		int c;
		Triangle(){
			this.a=3;
			this.b=4;
			this.c=5;
		}
		
		Triangle(int a, int b, int c)
		{
			this.a=a;
			this.b=b;
			this.c=c;
		}
		
		public int area() {
			return a*b*c;
		}
		public int perimeter() {
			return a+b+c;
		}
		public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println("Areaof triangle"+t.area());
		System.out.println("Perimeter of triangle"+t.perimeter());
		Triangle t2 = new Triangle(8,7,6);
		System.out.println("Areaof triangle"+t2.area());
		System.out.println("Perimeter of triangle"+t2.perimeter());
		
		}
	

}
