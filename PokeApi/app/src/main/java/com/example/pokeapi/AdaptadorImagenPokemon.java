package com.example.pokeapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorImagenPokemon extends RecyclerView.Adapter<AdaptadorImagenPokemon.ViewHolder>{
    List<String> ListaImagenesPokemon;
    public AdaptadorImagenPokemon(List<String> lista) {

        this.ListaImagenesPokemon = lista;
    }


    @NonNull
    @Override
    public AdaptadorImagenPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new AdaptadorImagenPokemon.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImagenPokemon.ViewHolder holder, int position) {
        String temporal = ListaImagenesPokemon.get(position);
        holder.cargarDatos(temporal);

    }

    @Override
    public int getItemCount() {
        return ListaImagenesPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagenPokemon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenPokemon= itemView.findViewById(R.id.image_view);
        }
        public void cargarDatos(String datos) {
            Picasso.get().load(datos).into(imagenPokemon);
        }
    }
}