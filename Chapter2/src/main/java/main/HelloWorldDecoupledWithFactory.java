package main;

import decoupled.MessageProvider;
import decoupled.MessageRenderer;
import decoupled.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {

  public static void main(String... args) {
    MessageRenderer mr
            = MessageSupportFactory.getInstance().getMessageRenderer();
    MessageProvider mp
            = MessageSupportFactory.getInstance().getMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
