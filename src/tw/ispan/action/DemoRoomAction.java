package tw.ispan.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tw.ispan.config.SpringJavaConfig;
import tw.ispan.model.Room;

public class DemoRoomAction {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
//		Room room1 = context.getBean("room1", Room.class);
//		System.out.println(room1.getRoomId() + " " + room1.getRoomName() + " " + room1.getSize());
		
		Room room1_1 = context.getBean("room1",Room.class);
		Room room1_2 = context.getBean("room1",Room.class);
		
		System.out.println(room1_1.hashCode());
		System.out.println(room1_2.hashCode());
		
		context.close();
	}

}
