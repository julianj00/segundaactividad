package com.example.proyecc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.MyViewholder> {
    Context context;
    ArrayList<usuario> list;

    public adapter(Context context, ArrayList<usuario> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       Viewv = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
       return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        usuario user= list.get(position);
        holder.Nombre.setText(user.getNombre());
        holder.Genero.setText(user.getGenero());
        holder.Edad.setText(user.getEdad());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{
        textView Nombre, Genero, Edad;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            Nombre= itemView.findViewById(R.id.tvnombre);
            Genero= itemView.findViewById(R.id.tvgenero);
            Edad= itemView.findViewById(R.id.tvedad);
        }
    }
}
