package konradlorenz.edu.playbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class buscar_personas extends AppCompatActivity {
    private RecyclerView recyclerView;
    private buscar_personas_recycler adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_personas);

        recyclerView = findViewById(R.id.id_recicler_personas);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new buscar_personas_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<buscar_personas_atributos> obtener(){
        List<buscar_personas_atributos> series = new ArrayList<>();
        series.add(new buscar_personas_atributos("Nombre: Jim Carrey","Nacionadlidad : Ecuatoriana","Edad: 30",R.drawable.acto1));
        series.add(new buscar_personas_atributos("Nombre: Sandra Torres", "Nacionalidad: Alemana", "Edad: 20",R.drawable.actor2));
        series.add(new buscar_personas_atributos("Nombre: Arnold", "Nacionalidad: Africana", "Edad: 25",R.drawable.actor3));
        series.add(new buscar_personas_atributos("Nombre: Andrea Johanson", "Nacionalidad: Estadounidense","Edad: 19",R.drawable.actor4));
        return series;
    }
    //CSANCHEZC
    public void onChat(View view) {
        Intent miIntent = new Intent(this, disponibilidad.class);
        startActivity(miIntent);
    }
    public void onLibro(View view) {
        Intent miIntent = new Intent(this, libros_principall.class);
        startActivity(miIntent);
    }
    public void onJuego(View view) {
        Intent miIntent = new Intent(this, disponibilidad.class);
        startActivity(miIntent);
    }
    public void onFoto(View view) {
        Intent miIntent = new Intent(this, galeria_fotos_principal.class);
        startActivity(miIntent);
    }
    public void onPerfil(View view) {
        Intent miIntent = new Intent(this, perfiluser.class);
        startActivity(miIntent);
    }
    public void onSalir(View view) {
        Intent miIntent = new Intent(this, inicio_sesion.class);
        startActivity(miIntent);
    }
    //CSANCEHZC
}
