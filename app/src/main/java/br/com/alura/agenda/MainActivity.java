package br.com.alura.agenda;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private String[] alunos = {"João", "Maria", "Carlos", "Ana", "Pedro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.activity_main_lista_de_alunos);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
        listView.setAdapter(adapter);
    }
}

