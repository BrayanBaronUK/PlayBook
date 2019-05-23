package konradlorenz.edu.playbook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class galeria_fotos_principal_otro_usuario extends AppCompatActivity {

    private RecyclerView recyclerView;
    private juegos_referencia_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_fotos_principal_otro_usuario);


        recyclerView = (RecyclerView)findViewById(R.id.id_galeria_fotos_principal_recycler);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(m);
        adaptador = new juegos_referencia_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<juegos_referencia_principal_atributos> obtener(){
        List<juegos_referencia_principal_atributos> series = new ArrayList<>();
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call ));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call));
        series.add(new juegos_referencia_principal_atributos("rtr","EL mejor juego",R.drawable.call ));
        return series;
    }

}
