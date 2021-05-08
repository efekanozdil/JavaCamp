package lecture3Homework2;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("Eðitmen sisteme kayýt oldu : "+ user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Eðitmen sistemden silindi:  "+ user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Eðitmen bilgileri güncellendi:  "+ user.getFirstName() + " " + user.getLastName());
	}
}
