package ke.ioc.example2;

public class Example2 {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer(new ClassicMusic());
        musicPlayer.playMusic();
    }
}

interface Music {
    void playMusic();
}

class ClassicMusic implements Music {
    @Override
    public void playMusic() {
        System.out.println("Play classic music");

    }
}

class RockMusic implements Music {
    @Override
    public void playMusic() {
        System.out.println("Play rock music");
    }
}

class MusicPlayer {
    private Music music[];

    public MusicPlayer(Music... music) {
        this.music = music;
    }

    public void playMusic() {
        for (Music music : music) {
            music.playMusic();
        }
    }
}