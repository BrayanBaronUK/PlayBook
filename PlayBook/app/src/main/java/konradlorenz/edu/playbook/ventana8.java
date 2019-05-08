package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana8 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana8);
    }

    public void onClickcon (View view) {
        Intent miIntent = new Intent(ventana8.this, ventana11.class);
        startActivity(miIntent);
    }

    public void onClickinf (View view) {
        Intent miIntent = new Intent(ventana8.this, ventana12.class);
        startActivity(miIntent);
    }

    public void onClicksal3 (View view) {
        Intent miIntent = new Intent(ventana8.this, MainActivity.class);
        startActivity(miIntent);
    }


}
