package nLayeredHomework.dataAccess.concretes;

import java.util.ArrayList;

import nLayeredHomework.dataAccess.abstracts.UserDao;
import nLayeredHomework.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	private ArrayList<User> users;
	
	public InMemoryUserDao(ArrayList<User> users) {
		this.users = users;
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanýcý eklendi : " + user.getFirstName());
		
	}

	@Override
	public void login(String email,String password) {
		for (User user : users) {
			if(user.geteMail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Giriþ baþarýlý : " + email);
				return;
			}
		}
		System.out.println("Giriþ baþarýsýz");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý silindi : " + user.getFirstName());
		
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if(user.geteMail().equals(email))
				return user;
		}
		return null;
	}

}
