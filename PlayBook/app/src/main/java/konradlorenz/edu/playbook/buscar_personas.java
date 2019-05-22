package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class buscar_personas extends AppCompatActivity {
    private RecyclerView recyclerView;
    private buscar_personas_recycler adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_personas);

        recyclerView = (RecyclerView)findViewById(R.id.id_recicler_personas);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new buscar_personas_recycler(obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<buscar_personas_atributos> obtener(){
        List<buscar_personas_atributos> series = new ArrayList<>();
        series.add(new buscar_personas_atributos("Nombre: Juliana","Nacionadlidad : Colombiana","Edad: 30",R.drawable.call));
        series.add(new buscar_personas_atributos("Nombre: Carlos", "Nacionalidad: Alemana", "Edad: 20",R.drawable.call));
        series.add(new buscar_personas_atributos("Nombre: Maria", "Nacionalidad: Colombiana", "Edad: 25",R.drawable.call));
        series.add(new buscar_personas_atributos("Nombre: Cesar", "Nacionalidad: Colombiano","Edad: 19",R.drawable.call ));
        return series;
    }
}
