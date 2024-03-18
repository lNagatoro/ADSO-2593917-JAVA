package com.example.pokeapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    String urlNext;
    String urlPrevious;

    Button atras;

    Button adelante;
    ImageView loadListaPokemon;
    int currentPage = 0;
    int pageSize = 20; // Tamaño de la página
    int totalPokemons = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlNext = null;
        urlPrevious = null;
        atras = findViewById(R.id.atras);
        adelante = findViewById(R.id.adelante);
        recycler = findViewById(R.id.recycler_listado);
        cargarDatos("https://pokeapi.co/api/v2/pokemon/?offset=0&limit=20");

    }

    public void cargarDatos(String url){
        loadListaPokemon = findViewById(R.id.loadListaPokemon);

        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loadListaPokemon);
        loadListaPokemon.setVisibility(View.VISIBLE);
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                loadListaPokemon.setVisibility(View.GONE);
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                try {
                    urlNext = response.getString("next");
                    urlPrevious = response.optString("previous");
                    if(urlPrevious.equals("null")){
                        atras.setEnabled(false);
                    }else{
                        atras.setEnabled(true);
                    }

                    JSONArray resultsArray = response.getJSONArray("results");
                    totalPokemons = response.getInt("count");
                    List<Pokemon> listado = new ArrayList<>();
                    for (int i = 0; i < resultsArray.length(); i++) {
                        int id = currentPage * pageSize + i + 1;

                        JSONObject Resultado = resultsArray.getJSONObject(i);

                        String nombre = Resultado.getString("name");
                        String url = Resultado.getString("url");


                        listado.add(new Pokemon(id,nombre, url));


                    }


                    AdaptadorItem adaptador = new AdaptadorItem(listado);
                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }

    public void cargarSiguiente(View vista) {
        if(urlNext.equals("null")){
            adelante.setEnabled(false);
        }else{
            adelante.setEnabled(true);
        }

        if (urlNext != null && !urlNext.isEmpty()) {
            currentPage++;
            cargarDatos(urlNext);
        }
    }

    public void cargarAtras(View vista) {
        if(urlPrevious.equals("null")){
            atras.setEnabled(false);
        }else{
            atras.setEnabled(true);
        }
        if (currentPage > 0) {
            currentPage--;
            cargarDatos(urlPrevious);
        }
    }


}