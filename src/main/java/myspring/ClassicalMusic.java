package myspring;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

  @Override
  public ArrayList<String> getSong() {
    ArrayList<String> song = new ArrayList<>(
        Arrays.asList("classcalMusic1", "classcalMusic2", "classcalMusic3"));
    return song;
  }
}
