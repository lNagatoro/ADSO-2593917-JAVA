package com.example.pokeapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokeapi.HabilidadesPokemon;

import java.util.List;

public class AdaptadorHabilidadesPokemon extends RecyclerView.Adapter<AdaptadorHabilidadesPokemon.ViewHolder>{

    List<HabilidadesPokemon> ListaHabilidadesPokemon;
    public AdaptadorHabilidadesPokemon(List<HabilidadesPokemon> lista) {

        this.ListaHabilidadesPokemon = lista;
    }

    @NonNull
    @Override
    public AdaptadorHabilidadesPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_ability, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidadesPokemon.ViewHolder holder, int position) {
        HabilidadesPokemon temporal = ListaHabilidadesPokemon.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return ListaHabilidadesPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView habilidadesPokemon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            habilidadesPokemon= itemView.findViewById(R.id.ability_text_view);
        }

        public void cargarDatos(HabilidadesPokemon datos) {
            habilidadesPokemon.setText(datos.getHabilidades());
        }
    }
}