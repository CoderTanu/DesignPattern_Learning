package BuilderDesignPattern;

public class Director {

	StudentBuilder studentBuilder;
	public Director(StudentBuilder studentBuilder) {
		this.studentBuilder= studentBuilder;
	}


	public Student createStudent() {
		if(studentBuilder instanceof )
	}


	private Student createEngStudent() {

	}

	private Student creatMBAStudent() {
       return studentBuilder.setRoolNumber(2);
	}

}
