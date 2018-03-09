package training.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import training.springframework.didemo.controllers.ConstructorInjectedController;
import training.springframework.didemo.controllers.MyController;
import training.springframework.didemo.controllers.PropertyInjectionController;
import training.springframework.didemo.controllers.SetterInjectedController;
import training.springframework.didemo.examplebeans.FakeDataSource;
import training.springframework.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class); 
		
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

		System.out.println(fakeJmsBroker.getUsername());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());
	}
}
