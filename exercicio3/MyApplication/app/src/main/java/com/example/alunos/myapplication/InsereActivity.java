package com.example.alunos.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by alunos on 27/09/17.
 */

public class InsereActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_insere);

        Button botao = (Button)findViewById(R.id.butSalvar);

        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText titulo = (EditText)findViewById(R.id.alteraTitulo);
                EditText autor = (EditText)findViewById(R.id.alteraAutor);
                EditText editora = (EditText)findViewById(R.id.alteraEditora);
                String tituloString = titulo.getText().toString();
                String autorString= autor.getText().toString();
                String editoraString= editora.getText().toString();
                String resultado;

                resultado = crud.insereDado(tituloString, autorString, editoraString);

                Toast.makeText(getApplicationContext(),resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
