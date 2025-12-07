//7. ARRAYDEQUE - Music Player Navigation

import java.util.*;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> songs = new ArrayDeque<>();

        // 1. Input 4 songs
        for (int i = 0; i < 4; i++) {
            songs.addLast(sc.next());
        }

        // 2. Press BACK twice (remove last played song)
        songs.removeLast();  
        songs.removeLast();

        // 3. Add a new song
        String newSong = sc.next();
        songs.addLast(newSong);

        // 4. Show current song
        System.out.println("Current Song: " + songs.getLast());
    }
}
