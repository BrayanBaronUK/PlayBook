package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana6 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disponibilidad);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana6.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickchat(View view) {
        Intent miIntent = new Intent(ventana6.this, ventana7.class);
        startActivity(miIntent);
    }


    public void onClickmain (View view) {
        Intent miIntent = new Intent(ventana6.this, MainActivity.class);
        startActivity(miIntent);
    }



}
