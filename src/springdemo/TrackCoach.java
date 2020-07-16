package springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    private TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartUpStuff() {
        System.out.println("Inside startup method");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("Inside cleanup method");
    }
}
