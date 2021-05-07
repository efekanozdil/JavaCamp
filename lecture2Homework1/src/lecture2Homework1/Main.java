package lecture2Homework1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1= new Course(
				1,
				"Yazýlým Geliþtirici Yetiþtirme Kampý-C#/Angular",
				"2 ay sürecek kampýn takip,döküman ve duyurularý burada",
				1,
				"Engin Demiroð"
				);
		
		Course course2=new Course(
				2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý-JAVA/React",
				"2 ay sürecek kampýn takip,döküman ve duyurularý burada",
				1,
				"Engin Demiroð"
				);
		
	
		
		Course course3=new Course(
				3,
				"Programlamaya Giriþ için Temel Kurs",
				"Python,Java,C# gibi tüm programlama dilleri için temel programlama mantýðýný anlatýlýr.",
				1,
				"Engin Demiroð"
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
