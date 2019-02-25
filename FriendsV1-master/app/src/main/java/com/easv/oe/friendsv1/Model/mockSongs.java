package com.easv.oe.friendsv1.Model;

import java.util.ArrayList;

public class mockSongs {
    ArrayList<songs> songList = new ArrayList<songs>();

    public mockSongs() {
        this.songList.add(new songs("Genki Rockets","Heavenly Star",2007,   120));
        this.songList.add(new songs("2 Chainz","Im Different",1999,   80));
        this.songList.add(new songs("Antarzis","Sexy Moon (Alien Mix)",	2019,   128));
        this.songList.add(new songs("Antarzis","One More Year",	2018,   128));
        this.songList.add(new songs("Disney","Hakuna Matata",	1995,   101));
        this.songList.add(new songs("Phil Collins","You'll Be in My Heart",	1995,   95));
        this.songList.add(new songs("PJ Sin Suela","La Pelua",	2019,   90));
        this.songList.add(new songs("Mitchell Tenpenny","Alcohol You Later",	2019,   100));
        this.songList.add(new songs("Master Music","Top 2019 Song",	2019,   1));
        this.songList.add(new songs("cisuM retsaM","gnoS 9102 poT",	9102,   1));
        this.songList.add(new songs("Cool faces","The dirty duck",	1998,   78));

    }
    public ArrayList<songs> getAllSongs()
    {
        return songList;

    }

}
