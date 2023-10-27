package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Animal;

public class DemoAnimalAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		Animal animal1 = context.getBean("animal1", Animal.class);
		System.out.println(animal1.getId() + " " + animal1.getName() + " " + animal1.getContinent());

		Animal animal2 = context.getBean("animal2", Animal.class);
		System.out.println(animal2.getId() + " " + animal2.getName() + " " + animal2.getContinent());

		Animal animal3 = context.getBean("animal3", Animal.class);
		System.out.println(
				animal3.getId() + " " + animal3.getName() + " " + animal3.getContinent() + "" + animal3.getDate());

		context.close();
	}

}
