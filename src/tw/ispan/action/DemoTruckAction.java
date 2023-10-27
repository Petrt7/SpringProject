package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.TruckBean;

public class DemoTruckAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");

		TruckBean toyotaTruck = context.getBean("toyotaTruck", TruckBean.class);
		System.out.println(toyotaTruck.getId() + " " + toyotaTruck.getBrand());

		TruckBean nissanTruck = context.getBean("nissanTruck", TruckBean.class);
		System.out.println(nissanTruck.getId() + " " + nissanTruck.getBrand());

		TruckBean teslaTruck = context.getBean("teslaTruck", TruckBean.class);
		System.out.println(teslaTruck.getId() + " " + teslaTruck.getBrand());

		TruckBean benzTruck = context.getBean("benzTruck", TruckBean.class);
		System.out.println(benzTruck.getId() + " " + benzTruck.getBrand());

		context.close();
	}

}
