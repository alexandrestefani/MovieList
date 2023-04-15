package com.alexandrestefani.recyclerview_java.Activity.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexandrestefani.recyclerview_java.Activity.Model.Filmes;
import com.alexandrestefani.recyclerview_java.R;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filmes> listaFilmes;

    //vincula-se a lista criada ao adapter:
    public Adapter(List<Filmes> lista) {
        this.listaFilmes = lista;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        // criar o layout, feita a criação do layout fazer
        // Fazer a conversão do layout XML em View para poder aparecer ao usuário

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista, parent,false);
        return new MyViewHolder(itemLista);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filmes filme = listaFilmes.get(position);
        holder.title.setText(filme.getFilme());
        holder.year.setText(filme.getAno());
        holder.genre.setText(filme.getGenero());
        holder.imageMovie.setImageResource(filme.getImageMovie());


    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView year;
        TextView genre;

        ImageView imageMovie;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.nomefilme);
            year = itemView.findViewById(R.id.anofilme);
            genre = itemView.findViewById(R.id.generofilme);
            imageMovie = itemView.findViewById(R.id.imagem_movie);


        }
    }

}
