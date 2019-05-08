package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana17 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana17);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana17.this, ventana1.class);
        startActivity(miIntent);
    }


    public void onClickref1 (View view) {
        Intent miIntent = new Intent(ventana17.this, MainActivity.class);
        startActivity(miIntent);
    }

}
