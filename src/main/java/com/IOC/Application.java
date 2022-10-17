package com.IOC;//import com.pluralsight.service.SpeakerService;
//import com.pluralsight.service.SpeakerServiceimpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
//        SpeakerService service =new SpeakerServiceimpl();
//        System.out.println(service.findAll().get(0).getFirstname());
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("Applicationcontext.xml");
        sport football=context.getBean("mySport",sport.class);
        football.start();
        context.close();


    }
}
