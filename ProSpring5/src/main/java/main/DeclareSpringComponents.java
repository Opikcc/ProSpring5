package main;

import GettingStarted.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

  public static void main(String... args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:resources/app-context-xml.xml");
    ctx.refresh();
    MessageRenderer messageRenderer = ctx.getBean("renderer",
            MessageRenderer.class);
    messageRenderer.render();
    ctx.close();
  }
}
