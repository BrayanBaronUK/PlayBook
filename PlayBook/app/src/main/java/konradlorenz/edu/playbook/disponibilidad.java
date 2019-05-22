package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class disponibilidad extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disponibilidad);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(disponibilidad.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickchat(View view) {
        Intent miIntent = new Intent(disponibilidad.this, chat_messages.class);
        startActivity(miIntent);
    }


    public void onClickmain (View view) {
        Intent miIntent = new Intent(disponibilidad.this, MainActivity.class);
        startActivity(miIntent);
    }



}
