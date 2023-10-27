package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.WorkerDao;

public class DemoWorkerAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		WorkerDao wDao = context.getBean("wDao", WorkerDao.class);
		wDao.showDetails();

		context.close();
	}

}
