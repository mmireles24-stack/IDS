import controllers.AuthView;

public class AuthController {
	
	public AuthView vista;
	public AuthController() {
		vista = new AuthView();
		
	}
	
	public void showLogin() {
		vista.loginView();
	}
	
	
}