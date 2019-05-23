package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class juegos_referencia_principal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private juegos_referencia_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos_referencia_principal);

        recyclerView = findViewById(R.id.id_recycñler_juegos_referencia);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(m);
        adaptador = new juegos_referencia_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<juegos_referencia_principal_atributos> obtener(){
        List<juegos_referencia_principal_atributos> series = new ArrayList<>();
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegosa1));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegos2));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa3 ));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa4));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa5));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa6));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa7 ));
        return series;
    }

}
