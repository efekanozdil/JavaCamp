package lecture3Homework2;

public class UserManager {
		
		public void add(User user) {
			System.out.println("Kullanýcý sisteme eklendi:  "+ user.getFirstName() + " " + user.getLastName());
		}
		
		public void delete(User user) {
			System.out.println("Kullanýcý sistemden silindi:  "+ user.getFirstName() + " " + user.getLastName());
		}
		
		public void update(User user) {
			System.out.println("Kullanýcý bilgileri güncellendi:  "+ user.getFirstName() + " " + user.getLastName());
		}
		
		public void addMultiple(User[] users) {
			for (User user : users) {
				add(user);
			}
		}
		
}
