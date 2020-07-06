package io;

import com.spring.io.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplcationContext.xml");
        //动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userservice");
        userService.add();
    }
}
