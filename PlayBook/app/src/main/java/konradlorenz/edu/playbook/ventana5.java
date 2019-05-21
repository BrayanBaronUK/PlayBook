package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana5);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana5.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(ventana5.this, ventana6.class);
        startActivity(miIntent);
    }

    public void onClickref (View view) {
        Intent miIntent = new Intent(ventana5.this, ventana17.class);
        startActivity(miIntent);
    }


}
