package lecture3Homework2;

public class StudentManager extends UserManager {
			
	
			@Override
			public void add(User user) {
				System.out.println("��renci sisteme kay�t oldu : "+ user.getFirstName());
			}
			
			public void delete(User user) {
				System.out.println("��renci sistemden silindi:  "+ user.getFirstName() + " " + user.getLastName());
			}
			
			public void update(User user) {
				System.out.println("��renci bilgileri g�ncellendi:  "+ user.getFirstName() + " " + user.getLastName());
			}
		
}
