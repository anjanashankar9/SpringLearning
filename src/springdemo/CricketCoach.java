package springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach inside no-arg instructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowlong for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
