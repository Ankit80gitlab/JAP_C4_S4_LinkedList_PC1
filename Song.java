package com.jap.linkedlist;

public class Song {
    // Define songName and songDuration as attributes
    private String songName;
    private String songDuration;

    // Define a parameterized constructor
    public Song(String songName, String songDuration) {
        this.songName=songName;
        this.songDuration=songDuration;
    }


    // Getter and Setter methods


    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }


    // Define the toString Method
    @Override
    public String toString() {
        return ("Song name - "+songName+", Song duration - "+songDuration);
    }
}
