package test.inject;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Jonah
 * @date 2022-07-09
 * @since JDK1.8
 */
//@Aspect
//@Component("test.inject.TestAop")
public class TestAop {
    
    @Pointcut("execution(* test.inject.AService.sayHelloA())")
    public void pointCut() {
    
    }
    
    @Before("pointCut()")
    public void beforeaaaa() {
        System.out.println("before");
    }
    
}
