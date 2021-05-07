package nLayeredHomework.business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredHomework.business.abstracts.UserService;
import nLayeredHomework.core.AuthService;
import nLayeredHomework.dataAccess.abstracts.UserDao;
import nLayeredHomework.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	
	public UserManager(UserDao userDao, AuthService authService) {
		this.userDao = userDao;
		this.authService = authService;
	}
	
	private static final String EMAIL_PATTERN =
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern  pattern = Pattern.compile(EMAIL_PATTERN);
	
	public static boolean isValidEmail(final String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}

	@Override
	public void register(User user) {
		
		if(!isValidEmail(user.geteMail())) {
			System.out.println("Geçerli bir mail giriniz");
			return;
		}
		
		if(user.getPassword().length()<6) {
			System.out.println("En az 6 karakterli bir þifre oluþturunuz.");
			return;
		}
		
		if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("En az 2 karakterli bir isim ve soyisim girmeniz gerekmektedir.");
			return;
		}
		
		if (user.geteMail()==null && user.getPassword()==null && user.getFirstName()==null & user.getLastName()==null) {
			System.out.println("Ad, soyad, email ve parola boþ býrakýlamamaktadýr.");
			return;
		}
		
		if(userDao.getByEmail(user.geteMail())!=null) {
			System.out.println("Bu eposta adresi kayýtlýdýr.");
			return;
		}
	
		
		userDao.register(user);
		
	}

	@Override
	public void login(String email,String password) {
		//userDao.login(email, password);
		authService.loginToSystem();
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}




}
