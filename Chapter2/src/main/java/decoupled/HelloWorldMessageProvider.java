package decoupled;

public class HelloWorldMessageProvider implements MessageProvider {

  @Override
  public String getMessage() {
    return "Kamana Wae Atuh Bro!!!";
  }
}
