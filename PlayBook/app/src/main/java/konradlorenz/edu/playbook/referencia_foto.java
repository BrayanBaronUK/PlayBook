package konradlorenz.edu.playbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class referencia_foto extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.referencia_fotos);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(referencia_foto.this, inicio_sesion.class);
        startActivity(miIntent);
    }


    public void onClickVolverR (View view) {
        Intent miIntent = new Intent(referencia_foto.this, perfil_usuario_local.class);
        startActivity(miIntent);
        finish();
    }


}
