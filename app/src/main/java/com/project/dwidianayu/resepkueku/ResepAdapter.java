package com.project.dwidianayu.resepkueku;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder> {
    private Context context;
    private ArrayList<ModelResep> reseplist;

    public ResepAdapter(Context context, ArrayList<ModelResep> reseplist) {
        this.context = context;
        this.reseplist = reseplist;
    }

    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_resep,parent,false);
        return new ResepViewHolder(view);
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView judul;
        TextView deskripsi;

        public ResepViewHolder(View itemView){
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.gambar);
            judul = (TextView)itemView.findViewById(R.id.judul);
            deskripsi = (TextView)itemView.findViewById(R.id.deskripsi);
        }
    }


    @Override
    public void onBindViewHolder(ResepAdapter.ResepViewHolder holder, final int position) {
        holder.image.setImageResource(reseplist.get(position).getImage());
        holder.judul.setText(reseplist.get(position).getJudul());
        holder.deskripsi.setText(reseplist.get(position).getDeskripsi());



        holder.judul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailResep.class);

                intent.putExtra("judul",reseplist.get(position).getJudul());
                intent.putExtra("gambar",reseplist.get(position).getImage());
                intent.putExtra("bahan",reseplist.get(position).getBahan());
                intent.putExtra("procedure",reseplist.get(position).getProcedure());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return reseplist.size();
    }

}
