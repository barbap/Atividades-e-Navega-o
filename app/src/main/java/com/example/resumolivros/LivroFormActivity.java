package com.example.resumolivros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LivroFormActivity extends AppCompatActivity {
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro_form);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        String url1 = "https://i.pinimg.com/564x/dc/23/93/dc2393741cce82bae02acaf3aaa78e76.jpg";
        String url2 = "https://a-static.mlcdn.com.br/618x463/livro-harry-potter-e-a-pedra-filosofal-capa-dura-edicao-comemorativa-dos-20-anos-da-colecao-harry-potter/magazineluiza/225550000/ed59f9ab0832d0d7fb979e42f2a74a64.jpg";

        Picasso.get().load(url1).into(img1);
        Picasso.get().load(url2).into(img2);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),DetalhesImagemActivity.class);
                String datapubli = "1992";
                String descricao = "Volume 1 da saga Harry Potter";
                it.putExtra("DATA" , datapubli);
                it.putExtra("DESCRICAO" , descricao);
                it.putExtra("IMAGEM",url1);
                startActivity(it);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(),DetalhesImagemActivity.class);
                String datapubli = "1992";
                String descricao = "Volume 1 da saga Harry Potter";
                it.putExtra("DATA" , datapubli);
                it.putExtra("DESCRICAO", descricao);
                it.putExtra("IMAGEM",url2);
                startActivity(it);
            }
        });

    }
}