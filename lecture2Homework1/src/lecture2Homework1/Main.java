package lecture2Homework1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1= new Course(
				1,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�-C#/Angular",
				"2 ay s�recek kamp�n takip,d�k�man ve duyurular� burada",
				1,
				"Engin Demiro�"
				);
		
		Course course2=new Course(
				2,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�-JAVA/React",
				"2 ay s�recek kamp�n takip,d�k�man ve duyurular� burada",
				1,
				"Engin Demiro�"
				);
		
	
		
		Course course3=new Course(
				3,
				"Programlamaya Giri� i�in Temel Kurs",
				"Python,Java,C# gibi t�m programlama dilleri i�in temel programlama mant���n� anlat�l�r.",
				1,
				"Engin Demiro�"
				);
		
		Course[] courses = {
				course1,
				course2,
				course3
		};
		
		for (Course course : courses) {
			System.out.println("Course ID: "+course.courseID);
			System.out.println("Course Name: "+course.courseName);
			System.out.println("Course Detail: "+course.courseDetail);
			System.out.println("Course Instructor: "+course.courseInstructor);
			System.out.println("--------------------------------------------------");
			
		}
		
		CourseManager coursemanager1=new CourseManager();
		coursemanager1.joinCourse(course2);
		
		coursemanager1.signIn();
		//statu
	}

}
