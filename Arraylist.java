import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Perfect");
        playlist.add("Faded");
        System.out.println("Playlist:");
        System.out.println(playlist);
         playlist.add(1, "Thunder");
        playlist.remove("Perfect");
        System.out.println("\nSongs in Playlist:");

        for (String song : playlist) {
            System.out.println(song);
        }
        System.out.println("\nTotal Songs: " + playlist.size());
        System.out.println("First Song: " + playlist.get(0));
    }
}