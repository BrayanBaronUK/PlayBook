package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana3);

    }
    public void onClick(View view) {
        Intent miIntent = new Intent(ventana3.this, ventana5.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(ventana3.this, ventana5.class);
        startActivity(miIntent);
    }

    public void onClick2 (View view) {
        Intent miIntent = new Intent(ventana3.this, ventana1.class);
        startActivity(miIntent);
    }



}
