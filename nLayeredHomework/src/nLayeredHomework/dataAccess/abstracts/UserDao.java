package nLayeredHomework.dataAccess.abstracts;

import java.util.List;

import nLayeredHomework.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login(String email,String password);
	void delete(User user);
	User getByEmail(String email);

}
