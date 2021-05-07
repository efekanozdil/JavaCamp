package nLayeredHomework.business.abstracts;

import nLayeredHomework.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email,String password);
	void delete(User user);
	User getByEmail(String email);
	
}
