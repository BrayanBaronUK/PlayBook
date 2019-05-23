package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class juegos_referencia_principal_otro_usuario extends AppCompatActivity {

    private RecyclerView recyclerView;
    private juegos_referencia_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos_referencia_principal_otro_usuario);

        recyclerView = findViewById(R.id.id_recycñler_juegos_referencia);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(m);
        adaptador = new juegos_referencia_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }
    public List<juegos_referencia_principal_atributos> obtener(){
        List<juegos_referencia_principal_atributos> series = new ArrayList<>();
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa8));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa9));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa10));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa11));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa12));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa13));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa14));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.juegoa15));
        return series;
    }
}
