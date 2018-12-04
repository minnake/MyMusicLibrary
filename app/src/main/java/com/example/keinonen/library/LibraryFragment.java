package com.example.keinonen.library;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LibraryFragment extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.music_list, container, false);

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent myIntent = new Intent(getActivity(), PlayActivity.class);
                startActivity(myIntent);
            }
        });

        return rootView;
    }
}