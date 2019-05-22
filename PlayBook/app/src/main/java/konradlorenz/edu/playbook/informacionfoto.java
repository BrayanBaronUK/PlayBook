package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class informacionfoto extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacion_foto);
    }

    public void onClickt14 (View view) {
        Intent miIntent = new Intent(informacionfoto.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClick (View view) {
        Intent miIntent = new Intent(informacionfoto.this, inicio_sesion.class);
        startActivity(miIntent);
    }

}
