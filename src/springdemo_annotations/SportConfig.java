package springdemo_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:springdemo_annotations/sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
