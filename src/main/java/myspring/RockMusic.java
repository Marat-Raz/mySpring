package myspring;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

  @Override
  public ArrayList<String> getSong() {
    ArrayList<String> song = new ArrayList<>(
        Arrays.asList("rockMusic1", "rockMusic2", "rockMusic3"));
    return song;
  }
}
