package com.example.keinonen.library;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_player, container, false);

        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music(R.string.song_name01, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name02, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name03, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name04, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name05, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name06, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name07, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name08, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name09, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name10, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));
        musics.add(new Music(R.string.song_name11, R.string.artists_name01, R.string.album_name01, R.drawable.ic_launcher_background));

        MusicAdapter adapter = new MusicAdapter(getActivity(), musics);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
