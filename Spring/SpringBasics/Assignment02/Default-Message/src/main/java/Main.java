import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DefaultMessage defaultMessage = context.getBean(DefaultMessage.class);
		System.out.println(defaultMessage.getMessage());
	}

}
