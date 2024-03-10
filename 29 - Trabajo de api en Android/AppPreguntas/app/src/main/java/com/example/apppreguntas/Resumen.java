package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Resumen extends AppCompatActivity {

    TextView nombre_usuario;
    LinearLayout contenedor;

    Config config;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        nombre_usuario = findViewById(R.id.nombre_usuario);
        config = new Config(getApplicationContext());
        contenedor = findViewById(R.id.contenedor_cuestionarios);

        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);
        nombre_usuario.setText(archivo.getString("nombres", ""));


        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas/getCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");
                    if (valorBooleano){
                        agregarCuestionario(jsonObject);
                    }else{
                        System.out.println("Error en el estado");
                    }

                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_usuario", id_usuario);
                return params;
            }
        };

        queue.add(solicitud);

    }

    public void cerrarSesion(View vista){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.commit();

        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);

        finish();

    }
    public void agregarCuestionario(JSONObject objeto){
        JSONArray arreglo = null;
        try {
            arreglo = objeto.getJSONArray("cuestionarios");

            for (int i = 0; i < arreglo.length(); i++) {
                JSONObject cuestionario = arreglo.getJSONObject(i);

                TextView textView = new TextView(contenedor.getContext());

                String texto = "ID: " + cuestionario.getString("id") + "\n" +
                        "Cant Preguntas: " + cuestionario.getString("cant_preguntas") + "\n" +
                        "Cant Ok: " + cuestionario.getString("cant_ok") + "\n" +
                        "Cant Error: " + cuestionario.getString("cant_error") + "\n" +
                        "Fecha De Inicio: " + cuestionario.getString("fecha_inicio") + "\n" +
                        "Fecha De Fin: " + cuestionario.getString("fecha_fin");

                int color = ContextCompat.getColor(contenedor.getContext(), R.color.blue);
                textView.setBackgroundColor(color);

                textView.setText(texto);

                contenedor.addView(textView);

                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.setMargins(36, 30, 30, 36);
                textView.setLayoutParams(layoutParams);

                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), ResumenRespuestas.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }


    public void crearCuestionario(View view) {
        Intent intencion = new Intent(getApplicationContext(), CrearCuestionario.class);
        startActivity(intencion);

        finish();
    }

}