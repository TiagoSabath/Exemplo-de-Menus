package com.example.exemplodemenus;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_aplicacao, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        int id = item.getItemId();
        if (id == R.id.item_novo){
            builder.setTitle("Aviso");
            builder.setMessage("Você selecionou o menu Novo!");
            builder.setNeutralButton("Ok", null);
            builder.show();
        } else if (id == R.id.item_abrir) {
            builder.setTitle("Aviso");
            builder.setMessage("Você selecionou o menu Abrir!");
            builder.setNeutralButton("Ok", null);
            builder.show();
        } else if (id == R.id.item_salvar_copia) {
            builder.setTitle("Aviso");
            builder.setMessage("Você selecionou o o submenu Salvar Cópia!");
            builder.setNeutralButton("Ok", null);
            builder.show();
        }else if (id == R.id.item_salvar_como) {
            builder.setTitle("Aviso");
            builder.setMessage("Você selecionou o submenu Salvar Como!");
            builder.setNeutralButton("Ok", null);
            builder.show();
        }
        return super.onOptionsItemSelected(item);
    }
}