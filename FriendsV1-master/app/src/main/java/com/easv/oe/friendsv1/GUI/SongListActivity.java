package com.easv.oe.friendsv1.GUI;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;

import com.easv.oe.friendsv1.Model.mockSongs;
import com.easv.oe.friendsv1.Model.songs;
import com.easv.oe.friendsv1.R;

import java.util.ArrayList;

public class SongListActivity extends ListActivity {
    ArrayList<songs> songs;
    mockSongs mSong = new mockSongs();
    songAdaptor sa;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Friend Activity 01");
        songs.addAll(mSong.getAllSongs());
        sa = new songAdaptor(this, R.layout.songcell,songs);
                 // setListAdapter(adapter);


    }

    public static class songAdaptor {
        Context context;
        int id ;
        ArrayList<songs> data;

        public songAdaptor(Context context, int id, ArrayList<songs> data ) {
            this.context = context;
            this.id = id ;
            this.data = data;
        }
    }
}
