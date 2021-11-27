import com.app.com.app.util.CalenderFactory;
import com.app.repository.ISpeakerRepository;
import com.app.repository.SpeakerRepository;
import com.app.service.ISpeakerService;
import com.app.service.SpeakerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan("com.app")
public class AppConfig {

    @Bean(name = "cal")
    public CalenderFactory calFactory(){
        CalenderFactory factory = new CalenderFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }


//    @Bean(name = "speakerService")
//    public ISpeakerService getSpeakerService(){
//        SpeakerService speakerService = new SpeakerService(this.getSpeakerRepository());
//       // speakerService.setSpeakerRepository(this.getSpeakerRepository());
//        return speakerService;
//    }
//
//    @Bean(name = "speakerRepository")
//    public ISpeakerRepository getSpeakerRepository(){
//        return  new SpeakerRepository();
//    }
}
