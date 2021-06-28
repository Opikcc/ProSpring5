package main;

import GettingStarted.HelloWorldMessageProvider;
import GettingStarted.MessageProvider;
import GettingStarted.MessageRenderer;
import GettingStarted.StandardOutMessageRenderer;

public class HelloWorldDecoupled {

  public static void main(String... args) {
    MessageRenderer mr = new StandardOutMessageRenderer();
    MessageProvider mp = new HelloWorldMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
