package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoStringAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		String string0 = context.getBean("string0", String.class);
		String string1 = context.getBean("string1", String.class);
		String string2 = context.getBean("string2", String.class);

		System.out.println(string0);
		System.out.println(string1);
		System.out.println(string2);
		
		context.close();
	}

}
