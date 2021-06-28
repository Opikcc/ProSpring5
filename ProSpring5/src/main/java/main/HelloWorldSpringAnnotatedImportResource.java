package main;

import GettingStarted.MessageRenderer;
import IOCandDI.HelloWorldConfigurationImportResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotatedImportResource {

  public static void main(String... args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfigurationImportResource.class);
    MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
    mr.render();
  }

}
