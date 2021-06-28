package main;

import GettingStarted.MessageRenderer;
import IOCandDI.HelloWorldConfigurationComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotatedComponentScan {

  public static void main(String... args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfigurationComponentScan.class);
    MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
    mr.render();
  }

}
