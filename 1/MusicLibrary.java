import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<String> songs = new ArrayList<>();
    private Random random = new Random();

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs available.");
        } else {
            int index = random.nextInt(songs.size());
            System.out.println("Playing: " + songs.get(index));
        }
    }

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong("Shape of You");
        library.addSong("Believer");
        library.addSong("Levitating");
        library.playRandomSong();
        library.removeSong("Believer");
        library.playRandomSong();
    }
}
