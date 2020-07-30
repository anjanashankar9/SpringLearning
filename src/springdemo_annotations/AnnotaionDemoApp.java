package springdemo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springdemo_annotations/applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);


        // call a method on the bean
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach.getDailyFortune());

        boolean result = (theCoach == alphaCoach);
        System.out.println("\n Pointing to the same object : "+result);
        System.out.println("\n Memory of theCoach : "+theCoach);
        System.out.println("\n Memory of alphaCoach : "+alphaCoach);


        //close the context
        context.close();
    }
}
