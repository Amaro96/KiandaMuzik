package com.example.engenheiroamaro.kmuzik;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import models.Album;
import models.ArtistTrackList;
import models.Artista;
import models.Track;

public class TelaArtistaDetalhada extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView listaDeMusicas = findViewById(R.id.listaDeMusicas);
        setTitle("Forca Suprema");
        Artista fs = new Artista();
        Track urna = new Track();
        Album caveira = new Album();
        urna.setAlbum(caveira);
        urna.setArtista(fs);
        urna.setId(1);
        urna.setaName("Urna");
        urna.setTrackCover(R.drawable.fs);

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(urna);
        int trackListId;
        ArtistTrackList fsTrsacksList = new ArtistTrackList(trackListId: 1, fs.getId(), tracks);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(context:this);
        listaDeMusicas.setLayoutManager(linearLayoutManager);

    }
}
