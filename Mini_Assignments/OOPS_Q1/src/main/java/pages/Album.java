package pages;

import java.util.LinkedList;
import java.util.logging.Logger;

public class Album {
    private static final Logger logger=Logger.getLogger(String.valueOf(Album.class));
    LinkedList<Song> albumList = new LinkedList<>();
    private String name;

    public Album(String name, String artist) {
        this.name = name;
        logger.info("New album added");
    }

    public LinkedList<Song> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(LinkedList<Song> albumList) {
        this.albumList = albumList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(String name, int duration) {
        albumList.add(new Song(name, duration));
        logger.info("new song " + name + ": " + duration + "s" + " added to album " + this.name);

    }

    public void getSongsFromInside() {

        for (int i = 0; i < this.albumList.size(); i++) {
            logger.info("    " + this.albumList.get(i).getName());
        }


    }

    private Song findSong(String name) {

        for (Song checkedSong : this.albumList) {
            if (checkedSong.getName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

    public void addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.albumList.size())) {

            playlist.add(this.albumList.get(index));
            return;

        }
        System.out.println("this album does not contain track no: " + trackNumber);
    }


    //LinkedList<Song> playlist
    public void addToPlaylist(String songTittle, LinkedList<Song> playlist) {
        Song checkedSong = findSong(songTittle);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            System.out.println("Song " + songTittle + " added to playlist");
            return;
        }
        System.out.println("Can not find song");
    }

}