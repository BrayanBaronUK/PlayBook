package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana12 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana12);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana12.this, ventana1.class);
        startActivity(miIntent);
    }

    public void onClickinf2 (View view) {
        Intent miIntent = new Intent(ventana12.this, ventana8.class);
        startActivity(miIntent);
    }

}
