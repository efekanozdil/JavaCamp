package lecture3Homework2;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("E�itmen sisteme kay�t oldu : "+ user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("E�itmen sistemden silindi:  "+ user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("E�itmen bilgileri g�ncellendi:  "+ user.getFirstName() + " " + user.getLastName());
	}
}
