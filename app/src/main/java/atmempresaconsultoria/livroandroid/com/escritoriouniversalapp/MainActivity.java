package atmempresaconsultoria.livroandroid.com.escritoriouniversalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoEmpresa;
    private ImageView botaoOutros;
    private ImageView botaoContato;
    private ImageView botaoServicos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoEmpresa = (ImageView) findViewById(R.id.empresaid);
        botaoOutros = (ImageView) findViewById(R.id.outrosid);
        botaoContato = (ImageView) findViewById(R.id.contatoid);
        botaoServicos = (ImageView) findViewById(R.id.servicosid);











        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        botaoOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, OutrosActivity.class));
            }
        });

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

        botaoServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });








    





    }
}
