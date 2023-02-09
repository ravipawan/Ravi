package javapractise;

public class Employee11 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1(39,"Abdul","Nabirasool",20000);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getAnnualSalary());
		System.out.println(emp.raiseSalary(50));
		System.out.println(emp.toString());

	}

}
