package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

	
	private int rollNumber;
	
	//optional filed
	
	private int age;
	private String name;
	private String fatherName;
	private String motherName;
	private List<String> subjects;
	
	public StudentBuilder setRoolNumber(int roolNumber) {
		this.rollNumber = roolNumber;
		return this;
	}
	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setFatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}
	public StudentBuilder setMotherName(String motherName) {
		this.motherName = motherName;
		return this;
	}
	
	
	
	abstract public StudentBuilder setSubject();
	
	
	public Student build(){
		return new Student(this);
	}

	
	
}
