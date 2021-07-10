import com.zd.entity.User;
import com.zd.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test01 {
    @Autowired
    @Qualifier("userService")//根据名称匹配
    private UserService userService;

    @Test


    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         UserService userService=(UserService) context.getBean("userService");
        //UserService userService1=(UserService) context.getBean("userService");
       // System.out.println(userService1==userService);
        List<User> users = userService.queryUsers();
         users.forEach(System.out::println);
    }

    @Test
    public void test02(){
        User user=userService.getUser();
        System.out.println(user);
    }
}
