package nLayeredHomework.core;

import nLayeredHomework.googleManager.GoogleManager;

public class GoogleManagerAdapter implements AuthService{

	@Override
	public void loginToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.login();
		
	}
	
	

}
