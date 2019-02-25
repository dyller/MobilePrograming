package com.easv.oe.friendsv1.GUI;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.easv.oe.friendsv1.Model.mockSongs;
import com.easv.oe.friendsv1.Model.songs;
import com.easv.oe.friendsv1.R;

import java.util.ArrayList;
import java.util.List;

public class SongListActivity extends Activity {
    ArrayList<songs> songs;
    mockSongs mSong = new mockSongs();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songcell);
        this.setTitle("Song List Activity");

        songs = new ArrayList<>();
        songs = mSong.getAllSongs();

        ListView lstView = (ListView) findViewById(R.id.lstView);

        songListAdapter adapter = new songListAdapter(this, R.layout.song_cell_extended, songs);
        lstView.setAdapter(adapter);
    }

    public class songListAdapter extends ArrayAdapter<songs>{

        private Context mContext;
        private int mResource;
        public songListAdapter(@NonNull Context context,
                               int resource,
                               @NonNull List<com.easv.oe.friendsv1.Model.songs> objects) {
            super(context, resource, objects);
            mContext = context;
            mResource = resource;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            String artist = getItem(position).getArtist();
            String title = getItem(position).getTitle();
            int year = getItem(position).getYear();
            int bpm = getItem(position).getBpm();

            //songs newSong = new songs(artist,title,year,bpm);

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

            TextView tvArtist = (TextView) convertView.findViewById(R.id.artistName);
            TextView tvTitle = (TextView) convertView.findViewById(R.id.titleSong);
            TextView tvYear = (TextView) convertView.findViewById(R.id.yearSong);
            TextView tvBpm = (TextView) convertView.findViewById(R.id.bpm);

            if(position%2==0){
                convertView.setBackgroundColor(Color.GRAY);
            }

            tvArtist.setText(artist);
            tvTitle.setText(title);
            tvYear.setText(""+year);
            tvBpm.setText(""+bpm);

            return convertView;
        }

    }
}
