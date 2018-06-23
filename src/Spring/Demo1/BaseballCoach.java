package Spring.Demo1;
 
public class BaseballCoach implements Coach{
	
	// define a private field for the dependancy
	private FortuneService fortuneService;
		
	// define constructor for dependancy injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
