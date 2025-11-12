package myspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    TestBean tetsBean = context.getBean("testBean", TestBean.class);
    System.out.println(tetsBean.getName());
    context.close();
  }
}
