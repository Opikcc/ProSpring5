package main;

import GettingStarted.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

  public static void main(String... args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("/resources/app-context.xml");
    MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
    mr.render();
  }

}
