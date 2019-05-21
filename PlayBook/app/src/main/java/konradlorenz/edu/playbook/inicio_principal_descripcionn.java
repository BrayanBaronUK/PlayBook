package konradlorenz.edu.playbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class inicio_principal_descripcionn extends AppCompatActivity {

    private RecyclerView recyclerView;
    private inicio_principal_descripcion_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_principal_descripcionn);

        recyclerView = (RecyclerView)findViewById(R.id.id_inicio_descripcion_recycler);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new inicio_principal_descripcion_recycler(obtener());
        recyclerView.setAdapter(adaptador);

    }

    public List<inicio_principal_atributos> obtener(){
        String titulo = getIntent().getStringExtra("titulo");
        String text = getIntent().getStringExtra("text");
        int foto = getIntent().getIntExtra("foto",0);
        List<inicio_principal_atributos> series = new ArrayList<>();
        series.add(new inicio_principal_atributos(titulo,text,foto));
        return series;
    }
    public void onDevolver_principal (View view) {
        Intent miIntent = new Intent(inicio_principal_descripcionn.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClick (View view) {
        Intent miIntent = new Intent(inicio_principal_descripcionn.this, inicio_sesion.class);
        startActivity(miIntent);
    }
}
