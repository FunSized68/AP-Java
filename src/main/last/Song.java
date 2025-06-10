package last;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Song {

    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return "Title: " + title + " | Artist: " + artist + " | Genre: " + genre;
    }

    // For file storage
    public String toFileString() {
        return title + "," + artist + "," + genre;
    }
}
