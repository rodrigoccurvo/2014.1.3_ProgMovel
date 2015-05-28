package com.example.rodrigo.aula1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class AtividadePrincipal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);

        showToast("Criando");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("Iniciando");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("Continuando");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("Pausando");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("Parando");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("Reiniciando");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Destruindo");
    }


    private void showToast(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_atividade_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
