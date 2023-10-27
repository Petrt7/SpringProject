package tw.ispan.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("tree")
@PropertySource("classpath:tree.properties") // 不用寫在xml的方法
public class TreeBean {

//	@Value("#{props.name}")
	@Value("${name}")
	private String name;
//	@Value("#{props.age}")
	@Value("${age}")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
