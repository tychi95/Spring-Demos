package Spring.Demo1;

public class TrackCoach implements Coach {

	// define a private field for the dependancy
	private FortuneService fortuneService;
	
	// define constructor for dependancy injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
