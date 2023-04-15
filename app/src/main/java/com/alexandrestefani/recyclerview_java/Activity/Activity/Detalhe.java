package com.alexandrestefani.recyclerview_java.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alexandrestefani.recyclerview_java.Activity.Model.Filmes;
import com.alexandrestefani.recyclerview_java.R;

import java.util.ArrayList;
import java.util.List;

public class Detalhe extends AppCompatActivity {
    private TextView title, gender, year, synopsis;
    private ImageView image;

    private List<Filmes> MovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        //recuperar a position selecionada
        Bundle dados = getIntent().getExtras();
        int position = dados.getInt("reference");
        String titleMovie = dados.getString("reftitle");
        String yearMovie = dados.getString("refyear");
        String genderMovie = dados.getString("refgender");
        String synopsisMovie = dados.getString("refsynopsis");
        int imageMovie = dados.getInt("refimage");
        System.out.println("iuppiii"+ position );

        title = findViewById(R.id.title_detalhes);
        gender = findViewById(R.id.genero_detalhes);
        year = findViewById(R.id.ano_detalhes);
        synopsis = findViewById(R.id.synopsis_detalhe);
        image = findViewById(R.id.image_detalhes);

        title.setText(titleMovie);
        year.setText(yearMovie);
        gender.setText(genderMovie);
        synopsis.setText(synopsisMovie);
        image.setImageResource(imageMovie);

    }
    public void goBackToStart(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivityOriginal.class);
        startActivity(intent);
    }

}