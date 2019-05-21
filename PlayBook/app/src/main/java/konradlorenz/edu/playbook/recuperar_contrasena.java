package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class recuperar_contrasena extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperar_contrasena);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(recuperar_contrasena.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickrec(View view) {
        Intent miIntent = new Intent(recuperar_contrasena.this, inicio_sesion.class);
        startActivity(miIntent);
    }

}
