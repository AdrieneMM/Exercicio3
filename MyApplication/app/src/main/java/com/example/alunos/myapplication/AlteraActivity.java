package com.example.alunos.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AlteraActivity extends AppCompatActivity {
    EditText livro ;
    EditText autor;
    EditText editora;
    Button alterar;
    Cursor cursor;
    BancoController crud;
    String codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera);

        codigo = this.getIntent().getStringExtra("codigo");
        crud = new BancoController(getBaseContext());
        livro = (EditText)findViewById(R.id.alteraTitulo);
        autor = (EditText)findViewById(R.id.alteraAutor);
        editora = (EditText)findViewById(R.id.alteraEditora);

    }
}
