package com.example.resumolivros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button livro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        livro = findViewById(R.id.Livro);

        livro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent (getBaseContext(), LivroFormActivity.class); //onde estou e para onde vou
                startActivity(it);
            }
        });
    }

    public void Sair (View v) {
        finish();
    }
}