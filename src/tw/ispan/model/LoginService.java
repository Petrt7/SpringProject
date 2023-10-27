package tw.ispan.model;

public class LoginService {

	private LoginDao loginDao;

	public LoginService() {
	}

	// contructor DI
	public LoginService(LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}

	// setter(property) DI
	//一定要搭配不帶參數的建構子
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public boolean checkLogin(String user, String pwd) {
		return loginDao.checkLogin(user, pwd);
	}
}
