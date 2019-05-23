package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana17 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.referencia_libros_juegos);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana17.this, inicio_sesion.class);
        startActivity(miIntent);
    }


    public void onClickVolverR (View view) {
        Intent miIntent = new Intent(ventana17.this, libros_principall.class);
        startActivity(miIntent);
        finish();
    }

}
