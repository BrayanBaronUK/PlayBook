package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ventana13 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana13);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(ventana13.this, MainActivity.class);
        startActivity(miIntent);
    }




}
