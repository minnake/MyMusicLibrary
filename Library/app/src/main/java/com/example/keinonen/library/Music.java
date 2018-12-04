package com.example.keinonen.library;

public class Music {

    private int songName;

    private int artistsName;

    private int albumName;

    private int imageResourceId;

    public Music(int ListSongName, int ListArtistsName, int ListAlbumName, int ListImageResourceId) {
        songName = ListSongName;
        artistsName = ListArtistsName;
        albumName = ListAlbumName;
        imageResourceId = ListImageResourceId;
    }

    public int getSongName() {
        return songName;
    }

    public int getArtistsName() {
        return artistsName;
    }

    public int getAlbumName () { return albumName;}

    public int getImageResourceId() {
        return imageResourceId;
    }


}

