package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class inicio_principall extends AppCompatActivity {

    private RecyclerView recyclerView;
    private inicio_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_principall);

        recyclerView = (RecyclerView)findViewById(R.id.idrcyclerprincipal);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new inicio_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<inicio_principal_atributos> obtener(){
        List<inicio_principal_atributos> series = new ArrayList<>();
        series.add(new inicio_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new inicio_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new inicio_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new inicio_principal_atributos("rtr","EL mejor juego",R.drawable.call ));
        return series;
    }
}
