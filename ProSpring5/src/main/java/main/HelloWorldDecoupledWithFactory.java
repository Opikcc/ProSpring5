package main;

import GettingStarted.MessageProvider;
import GettingStarted.MessageRenderer;
import GettingStarted.MessageSupportFactory;

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
