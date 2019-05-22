package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class juegosreferencia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegos_referencia);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(juegosreferencia.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(juegosreferencia.this, ventana17.class);
        startActivity(miIntent);
    }
}
