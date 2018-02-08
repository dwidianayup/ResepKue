package com.project.dwidianayu.resepkueku;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class DetailResep extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        int image = getIntent().getIntExtra("image",0);
        String judul = getIntent().getStringExtra("judul");
        String bahan = getIntent().getStringExtra("bahan");
        String procedure = getIntent().getStringExtra("procedure");

        getSupportActionBar().setTitle(judul);

        TextView textJudul = (TextView)findViewById(R.id.judul2);
        textJudul.setText(judul.toString());
        ImageView srcGambar = (ImageView)findViewById(R.id.gambar2);
        srcGambar.setImageResource(image);
        TextView textBahan = (TextView)findViewById(R.id.bahan);
        textBahan.setText(bahan.toString());
        TextView textProcedure = (TextView)findViewById(R.id.carapembuatan);
        textProcedure.setText(procedure.toString());

    }


}
