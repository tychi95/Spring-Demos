package Spring.Demo1;

public class BasketballCoach implements Coach{

	// define a private field for the dependancy
	private FortuneService fortuneService;
	
	// define no-arg constructor for Spring
	public BasketballCoach() {
		System.out.println("Basketball: inside no-arg constructor");
	}
	// define constructor for dependancy injection
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 20 freethrows";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
