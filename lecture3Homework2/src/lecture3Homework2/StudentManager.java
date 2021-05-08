package lecture3Homework2;

public class StudentManager extends UserManager {
			
	
			@Override
			public void add(User user) {
				System.out.println("Öðrenci sisteme kayýt oldu : "+ user.getFirstName());
			}
			
			public void delete(User user) {
				System.out.println("Öðrenci sistemden silindi:  "+ user.getFirstName() + " " + user.getLastName());
			}
			
			public void update(User user) {
				System.out.println("Öðrenci bilgileri güncellendi:  "+ user.getFirstName() + " " + user.getLastName());
			}
		
}
