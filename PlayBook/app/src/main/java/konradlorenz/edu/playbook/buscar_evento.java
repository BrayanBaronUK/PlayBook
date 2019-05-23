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

        recyclerView = findViewById(R.id.idrcyclerprincipal);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new inicio_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }
    public List<inicio_principal_atributos> obtener(){
        List<inicio_principal_atributos> series = new ArrayList<>();
        series.add(new inicio_principal_atributos("100 Años portada","Libro de ciencias naturales para la mayor diversion de los alumnos",R.drawable.libroa15));
        series.add(new inicio_principal_atributos("Ejecutivo Trotamundo","De ejecutivo a trotamundos narra la historia de Francisco, ejecutivo en lo más alto de esa espiral socioeconómica en la que tienen puestos los ojos nuestros padres y abuelos ",R.drawable.libroa16));
        series.add(new inicio_principal_atributos("Nuestra Señora Paris","Nuestra Señora de París es una novela de Victor Hugo, publicada en 1831 y compuesta por once libros que se centra en la desdichada historia de Esmeralda",R.drawable.libroa17));
        series.add(new inicio_principal_atributos("La Banda que Escriba Torcido","Wolfe y muchos de sus contemporáneos reconocieron un hecho destacado en el acontecer de los años sesenta: las herramientas tradicionales.",R.drawable.libroa18));
        return series;
    }
    public void onClickCrearEvento(View view) {
        Intent miIntent = new Intent(this, crear_evento.class);
        startActivity(miIntent);
        finish();
    }
    public void onClick(View view) {
        Intent miIntent = new Intent(buscar_evento.this, libros_principall.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(buscar_evento.this, libros_principall.class);
        startActivity(miIntent);
    }

    public void onClick2 (View view) {
        Intent miIntent = new Intent(buscar_evento.this, inicio_sesion.class);
        startActivity(miIntent);
    }



}
