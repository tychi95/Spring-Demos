package Spring.Demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySetterDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container 
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class); 
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		// close context
		context.close();
	}

}
