package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class registrar_usuario extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar_usuario);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(registrar_usuario.this, MainActivity.class);
        startActivity(miIntent);
    }




}
