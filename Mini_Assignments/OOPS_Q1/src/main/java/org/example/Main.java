package org.example;

import pages.Album;
import pages.Song;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Logger;

public class Main {
    private static Logger logger=Logger.getLogger(String.valueOf(Album.class));
    private static LinkedList<Album> albums = new LinkedList<>();
    public static void main(String[] args) {
// ADDING SONGS
            Album album = new Album("Kill Em All", "ACDC");
            album.addSong("Money Fame", 12);
            album.addSong("Circles", 13);
            album.addSong("Gasolina", 14);
            albums.add(album);
            album = new Album("Save Your Tears", "Metallica");
            album.addSong("295", 123);
            album.addSong("Manjha", 123);
            album.addSong("Tokyo drift", 123);
            albums.add(album);
            printEverything(albums);
            LinkedList<Song> playlist = new LinkedList<Song>();
//Adding to playlist
            albums.get(0).addToPlaylist("Seek & Destory", playlist);
            albums.get(0).addToPlaylist(2, playlist);
            albums.get(1).addToPlaylist(2, playlist);
            printListPlaylist(playlist);
            play(playlist);
        }
        public static void play(LinkedList<Song> playlist) {
            ListIterator<Song> listIterator = playlist.listIterator();
            if (playlist.size() == 0) {
                logger.info("NO SONG IN PLAYLIST");
                return;
            } else {
                logger.info("NOW PLAYING " + listIterator.next().toString());
            }
        }
        public static void printEverything(LinkedList<Album> linkedList) {
            Iterator<Album> i = linkedList.iterator();
            int j = 0;
            while (i.hasNext()) {
                j++;
                Album currentAlbum = i.next();
                logger.info(j + ": " + currentAlbum.getName());
                currentAlbum.getSongsFromInside();

            }
        }

    public static void printListPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> i = playlist.iterator();
        int j = 0;
        while (i.hasNext()) {

            j++;
            Song currentSong = i.next();
            logger.info(j + ": " + currentSong.getName());
        }
    }
}