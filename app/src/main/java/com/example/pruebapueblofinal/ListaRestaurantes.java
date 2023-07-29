package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.adaptadores.ResturantesAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.restaurantemolde;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<restaurantemolde> listaRestaurante=new ArrayList<>();
    RecyclerView recyclerRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerRestaurante=findViewById(R.id.listadinamicahoteles);
        recyclerRestaurante.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        ResturantesAdaptador adaptador=new ResturantesAdaptador(listaRestaurante);
        recyclerRestaurante.setAdapter(adaptador);

    }
    public void crearLista(){
        listaRestaurante.add(new restaurantemolde("restaurante la esquina","bandeja paisa", "50000",R.drawable.images));
        listaRestaurante.add(new restaurantemolde("restaurante la esquina","bandeja paisa", "50000",R.drawable.restaurante2));
        listaRestaurante.add(new restaurantemolde("restaurante la esquina","bandeja paisa", "50000",R.drawable.restaurante3));
        listaRestaurante.add(new restaurantemolde("restaurante la esquina","bandeja paisa", "50000",R.drawable.restaurante4));
        listaRestaurante.add(new restaurantemolde("restaurante la esquina","bandeja paisa", "50000",R.drawable.restaurante5));


    }

}