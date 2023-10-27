package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Person;
import tw.ispan.model.PersonDao;
import tw.ispan.model.PersonService;

public class DemoPersonAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		Person person1 = context.getBean("person", Person.class);
		person1.setId(1001);
		person1.setAge(18);
		person1.setName("Mary");
		System.out.println(person1.getId() + " " + person1.getName() + " " + person1.getAge());

		PersonDao personDao = context.getBean("personDao", PersonDao.class);
		personDao.printResult();
		
		PersonService personService = context.getBean("personService", PersonService.class);
		personService.printResult();

		context.close();
	}

}
