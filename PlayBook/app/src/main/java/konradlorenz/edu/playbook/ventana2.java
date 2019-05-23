package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana2);
    }
    public void onClickevej (View view) {
        Intent miIntent = new Intent(ventana2.this, juegos_referencia_principal.class);
        startActivity(miIntent);
    }


    public void onClick1(View view) {
        Intent miIntent = new Intent(ventana2.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClicksal2 (View view) {
        Intent miIntent = new Intent(ventana2.this, inicio_sesion.class);
        startActivity(miIntent);
    }

}
