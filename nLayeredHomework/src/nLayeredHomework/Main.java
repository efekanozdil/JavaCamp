package nLayeredHomework;

import java.util.ArrayList;

import nLayeredHomework.business.abstracts.UserService;
import nLayeredHomework.business.concretes.UserManager;
import nLayeredHomework.core.GoogleManagerAdapter;
import nLayeredHomework.dataAccess.concretes.InMemoryUserDao;
import nLayeredHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User u1 = new User(1,"efekan","özdil","efekanozdil@gmail.com","123456");
	
		
		ArrayList<User> users = new ArrayList<User>();
		
		
		UserService userService= new UserManager(new InMemoryUserDao(users),new GoogleManagerAdapter());
		
		userService.register(u1);
		userService.login("efekanozdil@gmail.com", "123456");

	}

}
