package konradlorenz.edu.playbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class inicio_principall extends AppCompatActivity {

    private RecyclerView recyclerView;
    private inicio_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_principall);

        recyclerView = findViewById(R.id.idrcyclerprincipal);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new inicio_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }
    public void onClickBuscarEvento (View view) {
        Intent miIntent = new Intent(this, buscar_evento.class);
        startActivity(miIntent);
    }
    public void onClickBuscarPersona (View view) {
        Intent miIntent = new Intent(this, buscar_personas.class);
        startActivity(miIntent);
    }

    public List<inicio_principal_atributos> obtener(){
        List<inicio_principal_atributos> series = new ArrayList<>();
        series.add(new inicio_principal_atributos("Call Of Duty","Call of Duty es una serie de videojuegos de disparos en primera persona, de estilo bélico, creada por Ben Chichoski, desarrollada principal e inicialmente por Infinity Ward.",R.drawable.juegoa16));
        series.add(new inicio_principal_atributos("Fifa 16","FIFA 16 es un videojuego de fútbol desarrollado por EA Canadá y publicado por EA Sports. Es el 23.º de la serie y salió a la venta el 22 de septiembre en América del Norte y el 24 de septiembre en Europa.",R.drawable.juegoa17));
        series.add(new inicio_principal_atributos("Tom Raider","FIFA 16 es un videojuego de fútbol desarrollado por EA Canadá y publicado por EA Sports. Es el 23.º de la serie y salió a la venta el 22 de septiembre en América del Norte y el 24 de septiembre en Europa.",R.drawable.juegoa18));
        series.add(new inicio_principal_atributos("Steins Gate","Steins;Gate es una novela visual japonesa desarrollada por 5pb. y Nitroplus, y fue lanzada el 15 de octubre de 2009 para la Xbox 360.",R.drawable.juegoa19 ));
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
    public void onPerfillocal(View view) {
        Intent miIntent = new Intent(this, perfil_usuario_local.class);
        startActivity(miIntent);
    }
    public void onSalir(View view) {
        Intent miIntent = new Intent(this, inicio_sesion.class);
        startActivity(miIntent);
    }
    public void onConfiguracion(View view) {
        Intent miIntent = new Intent(this, perfiluser.class);
        startActivity(miIntent);
    }
    //CSANCEHZC
}
