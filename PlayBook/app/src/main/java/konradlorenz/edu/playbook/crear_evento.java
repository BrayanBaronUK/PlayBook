package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class crear_evento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_evento);


    }

    public void onClickDevolverBuscarEvento(View view) {
        Intent miIntent = new Intent(this, buscar_evento.class);
        startActivity(miIntent);
    }
}
