package BuilderDesignPattern;

public class ClientMain {

	public static void main(String[] args) {
	Director directorObj1 = new Director(new EngineerStudentBuilder());
	Director directorObj2 = new Director(new MBAStudentBuilder());
	
	Student engineerStudent = directorObj1.createStudent();
    Student mbaStudent = directorObj2.createStudent();
    
    System.out.println(engineerStudent.toString());
    System.out.println(mbaStudent.toString());
	
	
	
	
	}

}
