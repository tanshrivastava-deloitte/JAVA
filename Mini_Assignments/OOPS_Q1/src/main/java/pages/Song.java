package pages;

import java.util.logging.Logger;

public class Song {
    private static final Logger logger=Logger.getLogger(String.valueOf(Album.class));
    public String name;
    public int duration; // duration in seconds

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;

//        System.out.println("new song added: " + name + " / " + duration);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    @Override
    public String toString() {
        return this.name + ": " + this.duration;
    }
}
