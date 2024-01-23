package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class App {

	public static void main(String[] args) {
		
		//starting IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		int i = 1;
		Car car = context.getBean(Car.class);	
		car.drive();
	}
}
