package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class juegos_referencia_descripcion extends AppCompatActivity {

    private RecyclerView recyclerView;
    private jeugos_referencia_description_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos_referencia_descripcion);
        recyclerView = findViewById(R.id.id_principal_description_recycler);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new jeugos_referencia_description_recycler(obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<juegos_referencia_principal_atributos> obtener(){
        String titulo = getIntent().getStringExtra("titulo");
        String text = getIntent().getStringExtra("text");
        int foto = getIntent().getIntExtra("foto",0);
        List<juegos_referencia_principal_atributos> series = new ArrayList<>();
        series.add(new juegos_referencia_principal_atributos(titulo,text,foto));
        return series;
    }
}
