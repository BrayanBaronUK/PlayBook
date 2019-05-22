package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class buscar_evento extends AppCompatActivity {

    private RecyclerView recyclerView;
    private inicio_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_evento);

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
    public void onClickCrearEvento(View view) {
        Intent miIntent = new Intent(this, crear_evento.class);
        startActivity(miIntent);
    }
    public void onClick(View view) {
        Intent miIntent = new Intent(buscar_evento.this, libros_principal_recycler.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(buscar_evento.this, libros_principal_recycler.class);
        startActivity(miIntent);
    }

    public void onClick2 (View view) {
        Intent miIntent = new Intent(buscar_evento.this, inicio_sesion.class);
        startActivity(miIntent);
    }



}
