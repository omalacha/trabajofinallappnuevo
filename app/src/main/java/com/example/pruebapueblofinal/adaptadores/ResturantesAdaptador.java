package com.example.pruebapueblofinal.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebapueblofinal.ListaRestaurantes;
import com.example.pruebapueblofinal.R;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.restaurantemolde;

import java.util.ArrayList;

public class ResturantesAdaptador extends RecyclerView.Adapter<ResturantesAdaptador.viewHolder> {
    //ATRIBUTOS
    public ArrayList<restaurantemolde> listaRestaurantes;

    //CONSTRUCTOR
    public ResturantesAdaptador(ArrayList<restaurantemolde> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public ResturantesAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_restaurantemolde,null,false);
        return new viewHolder(vista);
    }


    @Override
    public void onBindViewHolder(@NonNull ResturantesAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestaurantes;
        TextView precioRestaurantes;
        TextView nombreplato;

        ImageView fotoRestaurantes;

        public  viewHolder(View item){
            super(item);
            fotoRestaurantes=item.findViewById(R.id.fotorestaurante);
            nombreRestaurantes=item.findViewById(R.id.nombrerestaurante);
            precioRestaurantes=item.findViewById(R.id.precioplato);
            nombreplato=item.findViewById(R.id.nombreplato);
        }
        public void actualizarDatos(restaurantemolde restaurantemolde) {
            fotoRestaurantes.setImageResource(restaurantemolde.getFoto());
            nombreRestaurantes.setText(restaurantemolde.getNombre());
            nombreplato.setText(restaurantemolde.getDescripcion());
            precioRestaurantes.setText(restaurantemolde.getRangoPrecios());
        }
    }
}
