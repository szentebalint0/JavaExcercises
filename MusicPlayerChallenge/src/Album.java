import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {

        if (songs.contains(new Song(title, duration))){
            return false;
        }else{

            songs.add(new Song(title, duration));
            return true;
        }


    }

    private Song findSong(String title) {

        for(Song song : songs) {

            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }

        }

        return null;
    }

    public boolean addToPlayList (String title, LinkedList<Song> playlist) {


        if (playlist.contains(findSong(title))){
            return false;
        }
        playlist.add(findSong(title));
        return true;
    }

    public boolean addToPlayList (int  trackNumber, LinkedList<Song> playlist) {

        if (playlist.contains(songs.get(trackNumber))){
            return false;
        }
        playlist.add(songs.get(trackNumber));
        return true;

    }
}
