package models;

/**
 * Created by Engenheiro Amaro on 08/12/2017.
 */

public class Album {
    private int id;
    private String name;
    private int artistId;
    private int artistaId;
    private String relaseDate;
    private String price;

    public Album(int id, String name, int artistId, int artistaId, String relaseDate, String price) {
        this.id = id;
        this.name = name;
        this.artistId = artistId;
        this.artistaId = artistaId;
        this.relaseDate = relaseDate;
        this.price = price;
    }

    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(int artistaId) {
        this.artistaId = artistaId;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
