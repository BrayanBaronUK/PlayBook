package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class galeria_fotos_principal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private juegos_referencia_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_fotos_principal);

        recyclerView = findViewById(R.id.id_galeria_fotos_principal_recycler);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(m);
        adaptador = new juegos_referencia_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }

    public List<juegos_referencia_principal_atributos> obtener(){
        List<juegos_referencia_principal_atributos> series = new ArrayList<>();
        series.add(new juegos_referencia_principal_atributos("Call Of Duty","EL mejor juego",R.drawable.juegoa8));
        series.add(new juegos_referencia_principal_atributos("Fifa 16","FIFA 16 es un videojuego de fútbol desarrollado por EA Canadá y publicado por EA Sports. Es el 23.º de la serie y salió a la venta el 22 de septiembre en América del Norte y el 24 de septiembre en Europa.",R.drawable.juegoa9));
        series.add(new juegos_referencia_principal_atributos("Tom Raider","Warcraft es una franquicia de videojuegos, novelas y otros medios creados por Blizzard Entertainment. La serie se compone de cinco juegos principales",R.drawable.juegoa10));
        series.add(new juegos_referencia_principal_atributos("Seins Reins","Tomb Raider, también conocida como Lara Croft: Tomb Raider entre 2001 y 2007, es una franquicia de medios que se originó con una serie de videojuegos",R.drawable.juegoa11 ));
        series.add(new juegos_referencia_principal_atributos("Call Of Duty","Warcraft es una franquicia de videojuegos, novelas y otros medios creados por Blizzard Entertainment. La serie se compone de cinco juegos principales",R.drawable.libroa1));
        series.add(new juegos_referencia_principal_atributos("Fifa 16","Tomb Raider, también conocida como Lara Croft: Tomb Raider entre 2001 y 2007, es una franquicia de medios que se originó con una serie de videojuegos",R.drawable.libroa2));
        series.add(new juegos_referencia_principal_atributos("Tom Raider","Warcraft es una franquicia de videojuegos, novelas y otros medios creados por Blizzard Entertainment. La serie se compone de cinco juegos principales",R.drawable.libroa3));
        series.add(new juegos_referencia_principal_atributos("Tom Raider","Tomb Raider, también conocida como Lara Croft: Tomb Raider entre 2001 y 2007, es una franquicia de medios que se originó con una serie de videojuegos",R.drawable.libroa4 ));
        return series;
    }
}
