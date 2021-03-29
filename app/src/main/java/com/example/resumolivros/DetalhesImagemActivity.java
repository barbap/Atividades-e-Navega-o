package com.example.resumolivros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetalhesImagemActivity extends AppCompatActivity {

    private TextView datapubli;
    private TextView descricao;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_imagem);

        datapubli = findViewById(R.id.datapubli);
        descricao = findViewById(R.id.descricao);
        imagem = findViewById(R.id.img);

        Intent it = getIntent();

        String dt = it.getStringExtra("DATA");
        String dc = it.getStringExtra("DESCRICAO");
        String im = it.getStringExtra("IMAGEM");

        datapubli.setText(dt);
        descricao.setText(dc);
        Picasso.get().load(im).into(imagem);
    }
}