package com.alexandrestefani.recyclerview_java.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.alexandrestefani.recyclerview_java.Activity.Adapter.Adapter;
import com.alexandrestefani.recyclerview_java.Activity.Adapter.ClickListener;
import com.alexandrestefani.recyclerview_java.Activity.Model.Filmes;
import com.alexandrestefani.recyclerview_java.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityOriginal extends AppCompatActivity {

    RecyclerView recyclerview;
    private List<Filmes> filmesDaLista2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerviewcomponent);

        //configuração de um layout criada uma variavel do tipo RecycleView Layout que é estanciada em linear layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        // agora se vincula esse layout manager estanciado a recycleview criada para dizer que esse layout é o layour da recycle
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setHasFixedSize(true);
        // agora é necessário vincular no recycler view o adapter, que deve ser criado.

        //Instanciar o adapter
        Adapter adapter = new Adapter(filmesDaLista2);
        recyclerview.setAdapter(adapter);

        //chamar a criação dos filmes
        this.criarFilmes();

        //Evento de click

        recyclerview.addOnItemTouchListener(
                new ClickListener(
                        getApplicationContext(),
                        recyclerview,
                        new ClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filmes filme = filmesDaLista2.get(position);
                                Toast.makeText(getApplicationContext(),"item pressionado" + filme.getFilme(),Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );


    }

        public void criarFilmes(){
            Filmes filme0 = new Filmes("Aventureiros do Bairro Perdido", "1987","ficção",R.drawable.aventureirosdobairroproibido);
            this.filmesDaLista2.add(filme0);
            Filmes filme1 = new Filmes("Parasita", "2019","drama",R.drawable.oparasita);
            this.filmesDaLista2.add(filme1);
            Filmes filme2 = new Filmes("MadMax: estrada de furia", "2017","drama",R.drawable.madmaxestradadafuria);
            this.filmesDaLista2.add(filme2);
            Filmes filme3 = new Filmes("O sol é para todos", "1959","drama",R.drawable.osoleparatodos);
            this.filmesDaLista2.add(filme3);

        }

}