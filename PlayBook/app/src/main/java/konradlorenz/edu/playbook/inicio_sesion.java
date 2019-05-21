package konradlorenz.edu.playbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inicio_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);

    }

    public void onClickinicio(View view) {
        Intent miIntent = new Intent(inicio_sesion.this, inicio_principall.class);
        startActivity(miIntent);
    }

    public void onClick1(View view) {
        Intent miIntent = new Intent(inicio_sesion.this, recuperar_contrasena.class);
        startActivity(miIntent);
    }

    public void onClickregi(View view) {
        Intent miIntent = new Intent(inicio_sesion.this, ventana13.class);
        startActivity(miIntent);
    }
}
