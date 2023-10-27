package tw.ispan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="personService")
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	public void printResult() {
		personDao.printResult();
	}
	
}
