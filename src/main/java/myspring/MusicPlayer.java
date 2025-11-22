package myspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//@Component
public class MusicPlayer {

  @Value("${musicPlayer.name}")
  private String name;

  @Value("${musicPlayer.volume}")
  private String volume;

  private Music music1;
  private Music music2;

  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  //@Autowired
  public MusicPlayer(@Qualifier("classicalMusic") Music music1,
      @Qualifier("rockMusic") Music music2) {
    this.music1 = music1;
    this.music2 = music2;
  }

  public String playMusic(Genres genre) {
    return "Playing: " + music1.getSong() + ", " + music2.getSong();
  }
}
