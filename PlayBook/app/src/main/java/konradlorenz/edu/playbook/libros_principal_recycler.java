package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class libros_principal_recycler extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.libros_principal_recyler);
    }

    public void onClicklibro(View view) {
        Intent miIntent = new Intent(libros_principal_recycler.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(libros_principal_recycler.this, disponibilidad.class);
        startActivity(miIntent);
    }

    public void onClickreflibro (View view) {
        Intent miIntent = new Intent(libros_principal_recycler.this, ventana17.class);
        startActivity(miIntent);
    }


}
