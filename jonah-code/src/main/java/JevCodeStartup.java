import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.inject.AService;
import test.inject.BService;

/**
 * @author Jonah
 * @date 2022-07-09
 * @since JDK1.8
 */
public class JevCodeStartup {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring.xml");
//        BService bService = context.getBean(BService.class);
        AService aService = context.getBean(AService.class);
//        System.out.println("main====>" + bService);
        System.out.println("main====>" + aService);
    }
    
}
