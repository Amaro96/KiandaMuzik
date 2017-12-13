package models;

/**
 * Created by Engenheiro Amaro on 08/12/2017.
 */

public class Track {
    private int id;
    private String aPath;
    private String aName;
    private Album album;
    private Artista artista;
    private int trackCover;

    public Track(int id, String aPath, String aName, Album album, Artista artista, int trackCover) {
        this.id = id;
        this.aPath = aPath;
        this.aName = aName;
        this.album = album;
        this.artista = artista;
        this.trackCover = trackCover;
    }
    public Track(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaPath() {
        return aPath;
    }

    public void setaPath(String aPath) {
        this.aPath = aPath;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getTrackCover() {
        return trackCover;
    }

    public void setTrackCover(int trackCover) {
        this.trackCover = trackCover;
    }
}
