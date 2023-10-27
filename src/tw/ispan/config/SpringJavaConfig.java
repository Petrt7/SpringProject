package tw.ispan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import tw.ispan.model.Room;

@Configuration
public class SpringJavaConfig {

	@Bean
//	@Scope(value = "singleton")
	@Scope(value = "prototype")
	public Room room1() {
//		Room r1 = new Room();
		// 0開頭表示8進位
		Room r1 = new Room(001, "WarRoom", "medium");
		return r1;
	}
}
