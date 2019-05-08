package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana15 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana15);
    }

    public void onClickto14 (View view) {
        Intent miIntent = new Intent(ventana15.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClick (View view) {
        Intent miIntent = new Intent(ventana15.this, ventana1.class);
        startActivity(miIntent);
    }

}
