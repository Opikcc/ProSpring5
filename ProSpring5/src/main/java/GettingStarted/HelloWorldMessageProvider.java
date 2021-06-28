package GettingStarted;

import org.springframework.stereotype.Component;

//  Simple Bean
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

  @Override
  public String getMessage() {
    return "Kamana Wae Atuh Bro!!!";
  }
}
