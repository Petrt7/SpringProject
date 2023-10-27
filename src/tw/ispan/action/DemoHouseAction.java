package tw.ispan.action;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.House;
import tw.ispan.model.HouseService;

public class DemoHouseAction {

	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		HouseService houserService = context.getBean("houseService", HouseService.class);
		House resultBean = houserService.selectById(1003);
		if (resultBean != null) {
			System.out.println(resultBean.getHouseid() + " " + resultBean.getHousename());
		} else {
			System.out.println("no result");
		}

		context.close();
	}

}
