package myspring;

import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ClassicalMusic implements Music {

  @PostConstruct
  public void doMyInit() {
    System.out.println("Do init");
  }

  @PreDestroy
  public void doMyDestroy() {
    System.out.println("Do my destroy");
  }

  @Override
  public ArrayList<String> getSong() {
    ArrayList<String> song = new ArrayList<>(
        Arrays.asList("classcalMusic1", "classcalMusic2", "classcalMusic3"));
    return song;
  }
}
