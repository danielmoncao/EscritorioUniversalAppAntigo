package atmempresaconsultoria.livroandroid.com.escritoriouniversalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class OutrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outros);

        // adiciona botao up navigation - funciona
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    // faz parte botao up navigation - funciona
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            // o metodo finish() vai encerrar essa activity
            finish();
            return (true);
        }
        return super.onOptionsItemSelected(item);}









    public void browser1(View view){

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse ( "https://nfstock.alterdata.com.br/"));

        startActivity(browserIntent);}


    public void browser2(View view){

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse ( "https://packup.alterdata.com.br/"));

        startActivity(browserIntent);


    }


    }

