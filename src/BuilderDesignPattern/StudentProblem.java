package BuilderDesignPattern;

import java.util.List;

public class StudentProblem {

	
	private int roolNumber;
	
	//optional filed
	
	private int age;
	private String name;
	private String fatherName;
	private String montherName;
	private List<String> subjects;
	private String mobileNumber;
	
	
	public StudentProblem(int roolNumber, int age, String name, String fatherName, String montherName, List<String> subjects,
			String mobileNumber) {
		this.roolNumber = roolNumber;
		this.age = age;
		this.name = name;
		this.fatherName = fatherName;
		this.montherName = montherName;
		this.subjects = subjects;
		this.mobileNumber = mobileNumber;
	}


	public int getRoolNumber() {
		return roolNumber;
	}


	public void setRoolNumber(int roolNumber) {
		this.roolNumber = roolNumber;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMontherName() {
		return montherName;
	}


	public void setMontherName(String montherName) {
		this.montherName = montherName;
	}


	public List<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
