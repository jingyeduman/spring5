import com.example.spring1.Factory;
import com.example.spring1.Student;
import com.example.spring1.User;
import com.example.spring1.bean.Emp;
import com.example.spring1.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean(User.class);
        user.add();
        System.out.println(user.getUsername());


        /*BeanFactory beanFactoryContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user1 = beanFactoryContext.getBean(User.class);
        user1.add();*/
    }

    @Test
    public void testProObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean(UserService.class);
        userService.dump();
    }

    @Test
    public void testInnerObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean(Emp.class);
        System.out.println(emp);
    }

    @Test
    public void testStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

        Student student = context.getBean(Student.class);
        System.out.println(student);
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");

        UserService userService = (UserService) context.getBean("factoryBean", UserService.class);
        System.out.println(userService);
    }

    @Test
    public void autoWrite() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowrite.xml");

        Emp emp = (Emp) context.getBean(Emp.class);
        System.out.println(emp);
    }

    @Test
    public void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

        com.example.aopanno.User user = (com.example.aopanno.User) context.getBean(com.example.aopanno.User.class);
        user.add();
    }
}
