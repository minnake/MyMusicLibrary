package com.example.keinonen.library;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_shop, container, false);

        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music(R.string.song_name01, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name02, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name03, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name04, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name05, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name06, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name07, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name08, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name09, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name10, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));
        musics.add(new Music(R.string.song_name11, R.string.artists_name01, R.string.album_name01, R.drawable.ic_add_shopping_cart_black_24dp));

        MusicAdapter adapter = new MusicAdapter(getActivity(), musics);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}