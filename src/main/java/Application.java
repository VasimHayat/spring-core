import com.app.service.ISpeakerService;
import com.app.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        ISpeakerService speakerService =  applicationContext.getBean("speakerService",ISpeakerService.class);
       // ISpeakerService speakerService = new SpeakerService();

        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
