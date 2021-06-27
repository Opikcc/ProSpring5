package main;

import decoupled.HelloWorldMessageProvider;
import decoupled.MessageProvider;
import decoupled.MessageRenderer;
import decoupled.StandardOutMessageRenderer;

public class HelloWorldDecoupled {

  public static void main(String... args) {
    MessageRenderer mr = new StandardOutMessageRenderer();
    MessageProvider mp = new HelloWorldMessageProvider();
    mr.setMessageProvider(mp);
    mr.render();
  }
}
