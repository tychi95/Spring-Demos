package Spring.Demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from container 
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		Coach aCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on bean
		System.out.println("theCoach : "+ theCoach);
		System.out.println("aCoach : "+ aCoach);

		 // close context
		context.close();
	}


}
