package com.josedlpozo.backendless;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by josedelpozo on 17/4/16.
 */
public class AmigosAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Amigo> datos;

    public static class AmigosViewHolder extends RecyclerView.ViewHolder {

        TextView amigoName;
        TextView amigoTelf;
        TextView amigoCumple;

        public AmigosViewHolder(View itemView) {
            super(itemView);
            amigoName = (TextView) itemView.findViewById(R.id.amigo_name);
            amigoTelf = (TextView) itemView.findViewById(R.id.amigo_telefono);
            amigoCumple = (TextView) itemView.findViewById(R.id.amigo_cumple);
        }

        public void render(final Amigo amigo){
            amigoName.setText(amigo.getNombre());
            amigoTelf.setText(amigo.getTelefono());
            amigoCumple.setText(amigo.getCumple());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Click "+amigo.getNombre(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        private Context getContext() {
            return itemView.getContext();
        }

    }

    public AmigosAdapter() {
        this.datos = new ArrayList<>();
    }

    public void addAll(Collection<Amigo> collection) {
        datos.clear();
        datos.addAll(collection);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.amigo_item, parent, false);
        return new AmigosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AmigosViewHolder amigoViewHolder = (AmigosViewHolder) holder;
        Amigo career = datos.get(position);
        amigoViewHolder.render(career);
    }
}
