package test.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author Jonah
 * @date 2022-07-09
 * @since JDK1.8
 */
@Service("test.inject.AService")
public class AService {
    @Autowired
    private BService bService;
    
    
    public String sayHelloA() {
        System.out.println("hello___A");
        return "hello___A";
    }
}
