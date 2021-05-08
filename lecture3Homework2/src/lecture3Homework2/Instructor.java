package lecture3Homework2;

public class Instructor extends User{
			private String givenCourseName;
			
			public Instructor() {
				
			}

			public Instructor(String givenCourseName) {
			
				this.givenCourseName = givenCourseName;
			}

			public String getGivenCourseName() {
				return givenCourseName;
			}

			public void setGivenCourseName(String givenCourseName) {
				this.givenCourseName = givenCourseName;
			}
			
			
			
}
