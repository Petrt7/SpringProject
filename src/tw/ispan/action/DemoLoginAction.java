package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.LoginDao;
import tw.ispan.model.LoginService;

public class DemoLoginAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		LoginService loginService1 = context.getBean("loginService1", LoginService.class);
		boolean result1 = loginService1.checkLogin("john", "test123");
		System.out.println(result1);

		LoginDao loginDao1 = context.getBean("loginDao", LoginDao.class);
		boolean result2 = loginDao1.checkLogin("john", "test123");
		System.out.println(result2);

		LoginService loginService2 = context.getBean("loginService2", LoginService.class);
		boolean result3 = loginService2.checkLogin("mary", "test123");
		System.out.println(result3);

		context.close();
	}

}
