package test.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jonah
 * @date 2022-07-09
 * @since JDK1.8
 */
@Service("test.inject.BService")
public class BService {

    @Autowired
    private AService aService;
    
    public String sayHelloB() {
        System.out.println("hello___B");
        return "hello___B";
    }
    
}
