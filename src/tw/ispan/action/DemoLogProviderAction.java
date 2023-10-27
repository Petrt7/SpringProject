package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.util.LogProvider;

public class DemoLogProviderAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LogProvider logProvider = (LogProvider)context.getBean("logProvider");
		logProvider.log("hola");
		
		
		context.close();
	}

}

