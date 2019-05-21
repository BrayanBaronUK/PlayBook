package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana7 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana7);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana7.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickinic (View view) {
        Intent miIntent = new Intent(ventana7.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClickusuc (View view) {
        Intent miIntent = new Intent(ventana7.this, MainActivity.class);
        startActivity(miIntent);
    }


}
