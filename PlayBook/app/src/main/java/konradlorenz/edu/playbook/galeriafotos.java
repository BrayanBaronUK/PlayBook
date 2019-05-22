package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class galeriafotos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeriafotos);
    }

    public void onClickjug(View view) {
        Intent miIntent = new Intent(galeriafotos.this, inicio_principal_descripcionn.class);
        startActivity(miIntent);
    }

    public void onClickfot (View view) {
        Intent miIntent = new Intent(galeriafotos.this, informacionfoto.class);
        startActivity(miIntent);
    }

    public void onClicksal (View view) {
        Intent miIntent = new Intent(galeriafotos.this, ventana2.class);
        startActivity(miIntent);
    }


    public void onClicksalfo (View view) {
        Intent miIntent = new Intent(galeriafotos.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClicksubf(View view) {
        Intent miIntent = new Intent(galeriafotos.this, inicio_principal_descripcionn.class);
        startActivity(miIntent);
    }
}
