package BuilderDesignPattern;

import java.util.List;

public class Student {

	
	 int rollNumber;
	
	//optional filed
	
	 int age;
	 String name;
	 String fatherName;
	 String motherName;
	 List<String> subjects;
	
	
	public Student(StudentBuilder builder) {
		this.rollNumber = builder.;
		this.age = builder.setRoolNumber(rollNumber);
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.subjects = subjects;
	}
	
	
	
	
}
