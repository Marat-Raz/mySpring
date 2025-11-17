package myspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

    System.out.println(classicalMusic.getSong());

    //ClassicalMusic classicalMusic1 = new ClassicalMusic();

/*    MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    MusicPlayer sercondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    firstMusicPlayer.playMusic();

    boolean compasion = firstMusicPlayer == sercondMusicPlayer;
    System.out.println(compasion);

    System.out.println(firstMusicPlayer);
    System.out.println(sercondMusicPlayer);

    firstMusicPlayer.setVolume(10);

    System.out.println(firstMusicPlayer.getVolume());
    System.out.println(sercondMusicPlayer.getVolume());*/

    context.close();

  }
}
