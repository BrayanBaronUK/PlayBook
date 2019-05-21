package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class inicio_principal_descripcion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_principal_descripcion);
    }

    public void onClickto14 (View view) {
        Intent miIntent = new Intent(inicio_principal_descripcion.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClick (View view) {
        Intent miIntent = new Intent(inicio_principal_descripcion.this, ventana1.class);
        startActivity(miIntent);
    }

}
