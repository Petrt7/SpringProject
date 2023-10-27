package tw.ispan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "personDao") // <bean id="personDao" class="tw.ispan.model.PersonDao"/>
public class PersonDao {

	@Autowired
	private Person person;

	public void printResult() {
		System.out.println(person.getId() + "-" + person.getName() + "-" + person.getAge());
	}
}
