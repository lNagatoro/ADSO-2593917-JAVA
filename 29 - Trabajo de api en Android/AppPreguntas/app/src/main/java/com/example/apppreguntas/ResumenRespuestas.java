package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ResumenRespuestas extends AppCompatActivity {

    TextView nombre_usuario;
    TextView fecha_inicio;
    TextView cant_preguntas;
    TextView correctas;
    TextView incorrectas;
    LinearLayout contenedor;
    Config config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_respuestas);

        nombre_usuario = findViewById(R.id.nombre_usuario);
        fecha_inicio = findViewById(R.id.fecha_inicio);
        cant_preguntas = findViewById(R.id.preguntas);
        correctas = findViewById(R.id.correctas);
        incorrectas = findViewById(R.id.incorrectas);
        contenedor = findViewById(R.id.layout_principal);
        config = new Config(getApplicationContext());

        Intent intent = getIntent();
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);

        nombre_usuario.setText(archivo.getString("nombres", ""));
        String id = intent.getStringExtra("id");
        String fecha_inicio= intent.getStringExtra("fecha_inicio");
        String cant_preguntas = intent.getStringExtra("cant_preguntas");

        obtenerDatos(id, fecha_inicio, cant_preguntas);
    }


    public void obtenerDatos(String id, String fecha_inicio, String cant_preguntas){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas/mostrardatos.php");

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");
                    if (valorBooleano) {
                        imprimirDatos(jsonObject, fecha_inicio);
                    } else {
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
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id);
                return params;
            }
        };
        queue.add(solicitud);
    }

    public void imprimirDatos(JSONObject objeto, String fecha_inicio){
        this.fecha_inicio.setText(fecha_inicio);
        int cont_cant_preguntas = 0;
        int cont_ok = 0;
        int cont_error = 0;

        JSONArray arreglo = null;
        try {
            JSONArray respuestasArray = objeto.getJSONArray("respuestas");

            for (int i = 0; i < respuestasArray.length(); i++) {
                JSONObject respuesta = respuestasArray.getJSONObject(i);
                JSONObject pregunta = respuesta.getJSONObject("pregunta");
                int id_correcta = pregunta.getInt("id_correcta");
                int respuesta_dada = pregunta.getInt("respuesta");
                JSONArray opcionesArray = respuesta.getJSONArray("opciones");

                String estado = pregunta.getString("estado");
                String descripcion = pregunta.getString("descripcion");

                if (estado.equals("OK")){
                    cont_ok += 1;
                } else {
                    cont_error += 1;
                }

                String cant_ok = String.valueOf(cont_ok);
                String cant_error = String.valueOf(cont_error);
                correctas.setText(cant_ok);
                incorrectas.setText(cant_error);
                cont_cant_preguntas += 1;

                TextView titulo_preguntas = new TextView(getApplicationContext());
                String titulo = "Preguntas " + cont_cant_preguntas;
                LinearLayout.LayoutParams layoutParamsTitulo = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, // Ancho
                        LinearLayout.LayoutParams.WRAP_CONTENT  // Alto
                );
                layoutParamsTitulo.setMargins(0, 20, 0, 20);
                titulo_preguntas.setText(titulo);
                titulo_preguntas.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                titulo_preguntas.setTypeface(null, Typeface.BOLD);
                titulo_preguntas.setLayoutParams(layoutParamsTitulo);

                TextView text_descripcion = new TextView(getApplicationContext());
                String descripcionInfo = descripcion;
                LinearLayout.LayoutParams layoutParamsDescripcion = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, // Ancho
                        LinearLayout.LayoutParams.WRAP_CONTENT  // Alto
                );
                layoutParamsDescripcion.setMargins(0, 20, 0, 20);
                text_descripcion.setText(descripcionInfo);
                text_descripcion.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
                text_descripcion.setLayoutParams(layoutParamsDescripcion);

                contenedor.addView(titulo_preguntas);
                contenedor.addView(text_descripcion);

                for (int j = 0; j < opcionesArray.length(); j++) {
                    JSONObject opcion = opcionesArray.getJSONObject(j);
                    int id_opcion = opcion.getInt("id");
                    String descripcion_opciones = opcion.getString("descripcion");

                    TextView text_opcion = new TextView(getApplicationContext());
                    LinearLayout.LayoutParams layoutParamsOpcion = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, // Ancho
                            LinearLayout.LayoutParams.WRAP_CONTENT  // Alto
                    );
                    layoutParamsOpcion.setMargins(0, 20, 0, 20);

                    String textoConcatenado = "    " + descripcion_opciones;
                    text_opcion.setText(textoConcatenado);

                    text_opcion.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
                    text_opcion.setLayoutParams(layoutParamsOpcion);

                    if (respuesta_dada == id_opcion) {
                        if (respuesta_dada == id_correcta) {
                            text_opcion.setTextColor(Color.GREEN);
                        } else {
                            text_opcion.setTextColor(Color.RED);
                        }
                    }
                    contenedor.addView(text_opcion);
                }


            }

            String canntidad_preguntas = String.valueOf(cont_cant_preguntas);
            cant_preguntas.setText(canntidad_preguntas);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void cambiarActivity(View vista){
        Intent intencion = new Intent(getApplicationContext(), Resumen.class);
        startActivity(intencion);

        finish();
    }

}