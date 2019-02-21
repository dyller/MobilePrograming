package com.easv.oe.friendsv1.Model;

import java.util.ArrayList;

public class mockSongs {
    ArrayList<songs> songList = new ArrayList<songs>();

    public mockSongs() {
        this.songList.add(new songs("Genki Rockets","Heavenly Star",2007,   120));
        this.songList.add(new songs("2 Chainz","Im Different",1999,   80));
        this.songList.add(new songs("Antarzis","Sexy Moon (Alien Mix)",	2019,   128));
        this.songList.add(new songs("Antarzis","One More Year",	2018,   128));
        this.songList.add(new songs("Byron Juane ft. nobigdyl.","Attention",	2019,   81));
    }
    public ArrayList<songs> getAllSongs()
    {
        return songList;

    }

}
