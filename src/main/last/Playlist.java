package last;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

    private ArrayList<Song> songs;
    private static final String FILE_NAME = "playlist.txt";

    public Playlist() {
        songs = new ArrayList<>();
        loadPlaylist();
    }

    // Add a new song
    public void addSong(Song song) {
        songs.add(song);
        savePlaylist();
    }

    // Remove a song
    public void removeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.remove(index);
            savePlaylist();
        } else {
            System.out.println("Invalid song index.");
        }
    }

    // Display all songs
    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(i + ": " + songs.get(i));
            }
        }
    }

    // Save playlist to file
    private void savePlaylist() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Song song : songs) {
                writer.println(song.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error saving playlist: " + e.getMessage());
        }
    }

    // Load playlist from file
    private void loadPlaylist() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    songs.add(new Song(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("No existing playlist file found. Starting fresh.");
        }
    }


}
