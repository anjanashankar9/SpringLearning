package springdemo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    TennisCoach() {
        System.out.println("Inside constructor");
    }

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter");
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public void methodInjection(FortuneService fortuneService) {
        System.out.println("Inside Method");
        this.fortuneService = fortuneService;
    }*/

        @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
