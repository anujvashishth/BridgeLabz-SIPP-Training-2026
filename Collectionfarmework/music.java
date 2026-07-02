import java.util.LinkedList;
public class music {
    LinkedList<String> list = new LinkedList<>();
    public void playSong(String song){
        if (list.size() > 10) {
            list.removeLast();
        }
        list.addFirst(song);
    }
     public void searchSong(String song) {
        if (list.contains(song)) {
            System.out.println(song + " is present in recently played list.");
        } else {
            System.out.println(song + " is not present.");
        }
    }
    public void displayHistory() {
        System.out.println("Recently Played Songs:");
        for (String song : list) {
            System.out.println(song);
        }
    }
    public static void main(String[] args) {
         music playlist = new music();

        playlist.playSong("Shape of You");
        playlist.playSong("Believer");
        playlist.playSong("Perfect");
        playlist.playSong("Senorita");
        playlist.playSong("Despacito");
        playlist.playSong("Closer");
        playlist.playSong("Faded");
        playlist.playSong("Havana");
        playlist.playSong("Thunder");
        playlist.playSong("Attention");
        playlist.playSong("Levitating"); // 11th song

        playlist.displayHistory();

        playlist.searchSong("Believer");
        playlist.searchSong("Baby");
    }
}
