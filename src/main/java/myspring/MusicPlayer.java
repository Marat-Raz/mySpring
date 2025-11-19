package myspring;

import static myspring.Genres.CLASSICAL;
import static myspring.Genres.ROCK;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

  private Music music1;
  private Music music2;

  @Autowired
  public MusicPlayer(@Qualifier("classicalMusic") Music music1,
      @Qualifier("rockMusic") Music music2) {
    this.music1 = music1;
    this.music2 = music2;
  }

  public String playMusic(Genres genre) {
    String result = "";
    Random random = new Random();
    if (genre.equals(CLASSICAL)) {
      int randomIndex = random.nextInt(music1.getSong().size());
      result = music1.getSong().get(randomIndex);
    } else if (genre.equals(ROCK)) {
      int randomIndex = random.nextInt(music2.getSong().size());
      result = music2.getSong().get(randomIndex);
    }
    return "Playing: " + result;
  }
}
