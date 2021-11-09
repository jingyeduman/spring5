import com.example.aopanno.User;
import com.example.jdbc.BookService;
import com.example.jdbc.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {
    @Test
    public void testAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemp.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        UserEntity user = new UserEntity();
        user.setUsername("test");
        int add = bookService.add(user);
        System.out.println("add ret " + add);
    }

    @Test
    public void testCount() {
        ApplicationContext context = getContext();
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.count();
        System.out.println(count);
    }

    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemp.xml");
        return context;
    }

    @Test
    public void testQueryOne() {
        ApplicationContext context = getContext();
        BookService bean = context.getBean(BookService.class);
        UserEntity userEntity = bean.queryRow(1);
        System.out.println(userEntity);
    }
}
