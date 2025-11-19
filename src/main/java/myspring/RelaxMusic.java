package myspring;

import java.util.ArrayList;
import java.util.Arrays;

public class RelaxMusic implements Music {

  @Override
  public ArrayList<String> getSong() {
    return new ArrayList<>(Arrays.asList("Relax music"));
  }
}
