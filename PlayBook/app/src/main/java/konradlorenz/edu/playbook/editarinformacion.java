package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class editarinformacion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editarinformacion);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(editarinformacion.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickinf2 (View view) {
        Intent miIntent = new Intent(editarinformacion.this, perfiluser.class);
        startActivity(miIntent);
    }

}
