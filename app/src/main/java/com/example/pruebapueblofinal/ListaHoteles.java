package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {
    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerHoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);

    }
    public void crearLista(){
        listaHoteles.add(new MoldeHotel("Hotel la maravilla","250000",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel el sancocho","350000",R.drawable.hotel2));
        listaHoteles.add(new MoldeHotel("Hotel 3","450000",R.drawable.hotel3));
        listaHoteles.add(new MoldeHotel("Hotel 4","550000",R.drawable.hotel4));
        listaHoteles.add(new MoldeHotel("Hotel 5","650000",R.drawable.hotel5));

    }
}