package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class perfil_usuario_local extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario_local);

    }
    public void onClickLibrosLocal (View view) {
        Intent miIntent = new Intent(this, libros_principall.class);
        startActivity(miIntent);
    }
    public void onClickJuegosLocal (View view) {
        Intent miIntent = new Intent(this, juegos_referencia_principal.class);
        startActivity(miIntent);
    }
    public void onClickFotosLocal (View view) {
        Intent miIntent = new Intent(this, galeria_fotos_principal.class);
        startActivity(miIntent);
    }

}
