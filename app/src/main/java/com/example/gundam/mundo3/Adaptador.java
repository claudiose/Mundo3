package com.example.gundam.mundo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter{

    private Context context;
    private ArrayList <Entidad> ListItems;


    //contructor

    public Adaptador(Context context, ArrayList<Entidad> listItems) {
        this.context = context;
        ListItems = listItems;
    }

    //metodos para poblar datos de arraylist hacia el listview

    @Override
    public int getCount() {
        return ListItems.size();
        // este metodo indica al listview cuantos metodos se van a cargar
    }

    @Override
    public Object getItem(int position) {
        return ListItems.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //este metodo ejecuta el creado de las vistas tantas veces como indica el metodo getcount

        Entidad Item =(Entidad) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView imgFoto =(ImageView) convertView.findViewById(R.id.imgFoto);
        TextView  tvTitulo  =(TextView) convertView.findViewById(R.id.tvTitulo);
        TextView  tvContenido  =(TextView) convertView.findViewById(R.id.tvContenido);

        //llenar listview

        imgFoto.setImageResource(Item.getImgFoto());
        tvTitulo.setText(Item.getTitulo());
        tvContenido.setText(Item.getContenido());

     return convertView;
    }
}
