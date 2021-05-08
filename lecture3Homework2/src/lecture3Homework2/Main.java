package lecture3Homework2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);
		student.setFirstName("efekan");
		student.setLastName("�zdil");
		student.setGetCourseName("JAVA/React");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setId(2);
		instructor.setLastName("Demiro�");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setGivenCourseName("Java/React");
		
		User[] users= {
				student,
				instructor
		};
		
		UserManager usermanager = new UserManager();
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		InstructorManager instructormanager = new InstructorManager();
		instructormanager.add(instructor);
		
		System.out.println("��rencinin ald��� ders : "+ student.getGetCourseName());
		System.out.println("E�itmenin verdi�i ders : "+instructor.getGivenCourseName());
		
		usermanager.addMultiple(users);
		
		
	}

}
