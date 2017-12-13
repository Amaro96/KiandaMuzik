package models;

/**
 * Created by Engenheiro Amaro on 08/12/2017.
 */

public class Artista {
    private int id;
    private String nome;
    private String desc;
    private String musicaStilo;
    private int artistCoverImage;
    private boolean verificacao;

    public Artista(int id, String nome, String desc, String musicaStilo, int artistCoverImage, boolean verificacao) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
        this.musicaStilo = musicaStilo;
        this.artistCoverImage = artistCoverImage;
        this.verificacao = verificacao;
    }
public Artista(){

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMusicaStilo() {
        return musicaStilo;
    }

    public void setMusicaStilo(String musicaStilo) {
        this.musicaStilo = musicaStilo;
    }

    public int getArtistCoverImage() {
        return artistCoverImage;
    }

    public void setArtistCoverImage(int artistCoverImage) {
        this.artistCoverImage = artistCoverImage;
    }

    public boolean isVerificacao() {
        return verificacao;
    }

    public void setVerificacao(boolean verificacao) {
        this.verificacao = verificacao;
    }
}
