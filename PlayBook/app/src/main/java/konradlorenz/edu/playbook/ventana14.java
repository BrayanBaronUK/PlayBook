package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana14 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana14);
    }

    public void onClickjug(View view) {
        Intent miIntent = new Intent(ventana14.this, ventana15.class);
        startActivity(miIntent);
    }

    public void onClickfot (View view) {
        Intent miIntent = new Intent(ventana14.this, ventana16.class);
        startActivity(miIntent);
    }

    public void onClicksal (View view) {
        Intent miIntent = new Intent(ventana14.this, ventana2.class);
        startActivity(miIntent);
    }


    public void onClicksalfo (View view) {
        Intent miIntent = new Intent(ventana14.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClicksubf(View view) {
        Intent miIntent = new Intent(ventana14.this, ventana15.class);
        startActivity(miIntent);
    }
}