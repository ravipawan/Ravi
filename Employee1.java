package javapractise;

/**
 * @author DELL
 *
 */
public class Employee1 {
private int id;
private String firstName;
private String lastName;
private int Salary;

Employee1(int id,String firstName,String lastName, int Salary){
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.Salary = Salary;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

public int getId() {
	return id;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getName() {
	return this.firstName+" "+this.lastName;
}
public int getAnnualSalary() {
	return this.Salary*12;
}
public int raiseSalary(int percentage) {
	float increment = this.Salary * (percentage/100);
	return this.Salary += (this.Salary * increment);
}

@Override
public String toString() {
	return "Employee1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary=" + Salary + "]";
}
}