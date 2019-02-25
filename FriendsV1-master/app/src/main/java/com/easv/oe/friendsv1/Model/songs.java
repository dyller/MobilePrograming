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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String songName) {
        this.artist = songName;
    }

    public int getYear() { return year;}

    public void setYear(int year) {this.year = year; }

    public int getBpm() { return bpm;}

    public void setBpm(int bpm) { this.bpm = bpm; }
}
