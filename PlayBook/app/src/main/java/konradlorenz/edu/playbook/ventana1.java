package konradlorenz.edu.playbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ventana1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciosesion);

    }

    public void onClickinicio(View view) {
        Intent miIntent = new Intent(ventana1.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClick1(View view) {
        Intent miIntent = new Intent(ventana1.this, ventana10.class);
        startActivity(miIntent);
    }

    public void onClickregi(View view) {
        Intent miIntent = new Intent(ventana1.this, ventana13.class);
        startActivity(miIntent);
    }
}
