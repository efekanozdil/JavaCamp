package lecture3Homework2;

public class UserManager {
		
		public void add(User user) {
			System.out.println("Kullanıcı sisteme eklendi:  "+ user.getFirstName() + " " + user.getLastName());
		}
		
		public void delete(User user) {
			System.out.println("Kullanıcı sistemden silindi:  "+ user.getFirstName() + " " + user.getLastName());
		}
		
		public void update(User user) {
			System.out.println("Kullanıcı bilgileri güncellendi:  "+ user.getFirstName() + " " + user.getLastName());
		}
		
		public void addMultiple(User[] users) {
			for (User user : users) {
				add(user);
			}
		}
		
}
