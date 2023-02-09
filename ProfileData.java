package javapractise;

import java.util.ArrayList;
import java.util.List;

public class ProfileData {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("Nabi");
		s1.setId(34355);
		s1.setAge(29);
		s1.setGraduate(true);
		
		Student s2 = new Student();
		
		s2.setName("Ravi");
		s2.setId(34356);
		s2.setAge(30);
		s2.setGraduate(true);
		
		Student s3 = new Student();
		
		s3.setName("Sadik");
		s3.setId(34350);
		s3.setAge(24);
		s3.setGraduate(true);
		
		List<Student> Students = new ArrayList<>();
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		System.out.println(Students.size());
		Students.forEach(t->{
			System.out.println(t.toString());
		});
		
			System.out.println(Students.get(2));

	}

}
