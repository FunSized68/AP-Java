package last;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Remove Song");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter song title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter artist: ");
                        String artist = scanner.nextLine();
                        System.out.print("Enter genre: ");
                        String genre = scanner.nextLine();
                        if (title.isEmpty() || artist.isEmpty() || genre.isEmpty()) {
                            System.out.println("Fields cannot be empty.");
                        } else {
                            playlist.addSong(new Song(title, artist, genre));
                            System.out.println("Song added.");
                        }
                        break;
                    case 2:
                        playlist.displayPlaylist();
                        break;
                    case 3:
                        System.out.print("Enter song index to remove: ");
                        playlist.removeSong(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }


}
