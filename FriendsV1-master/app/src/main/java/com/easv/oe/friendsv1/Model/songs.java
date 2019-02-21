package com.easv.oe.friendsv1.Model;

public class songs {

    private String artist;
    private String title;
    private int year;
    private int bpm ;

    public songs(String artist, String title, int year, int bpm) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongName() {
        return artist;
    }

    public void setSongName(String songName) {
        this.artist = songName;
    }
}
