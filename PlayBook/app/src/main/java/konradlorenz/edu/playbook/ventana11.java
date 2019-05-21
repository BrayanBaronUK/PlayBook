package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana11 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana11);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana11.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickcon2 (View view) {
        Intent miIntent = new Intent(ventana11.this, perfiluser.class);
        startActivity(miIntent);
    }

}
