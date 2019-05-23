package konradlorenz.edu.playbook;

import android.content.Intent;
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

public class libros_principall extends AppCompatActivity {

    private RecyclerView recyclerView;
    private libros_principal_recycler adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_principall);

        recyclerView = findViewById(R.id.idrcyclerprincipallibro);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(m);
        adaptador = new libros_principal_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);
    }
    public List<libros_principal_atributos> obtener(){
        List<libros_principal_atributos> series = new ArrayList<>();
        series.add(new libros_principal_atributos("100 Años portada","Libro de ciencias naturales para la mayor diversion de los alumnos",R.drawable.libroa5));
        series.add(new libros_principal_atributos("Ejecutivo Trotamundo","De ejecutivo a trotamundos narra la historia de Francisco, ejecutivo en lo más alto de esa espiral socioeconómica en la que tienen puestos los ojos nuestros padres y abuelos",R.drawable.libroa6));
        series.add(new libros_principal_atributos("Nuestra Señora Paris","Libro para solo creyentes de Dios y quienes van a misa",R.drawable.libroa7));
        series.add(new libros_principal_atributos("La Banda que Escriba Torcido","Para aquellos amantes de la litetura moderna",R.drawable.libroa8 ));
        series.add(new libros_principal_atributos("100 Años portada","Cien años de soledad es una novela del escritor colombiano Gabriel García Márquez, ganador del Premio Nobel de Literatura en 1982.",R.drawable.libroa9));
        series.add(new libros_principal_atributos("Ejecutivo Trotamund","DE EJECUTIVO A TROTAMUNDOS \"¿Qué hago con mi vida? Voy a cumplir los 40. Me queda la otra mitad. Quiero vivir, vivir. Giro total\". ",R.drawable.libroa10));
        series.add(new libros_principal_atributos("Nuestra Señora Paris","Nuestra Señora de París es una novela de Victor Hugo, publicada en 1831 y compuesta por once libros que se centra en la desdichada historia de Esmeralda",R.drawable.libroa11));
        series.add(new libros_principal_atributos("100 años de soledad","Cien años de soledad es una novela del escritor colombiano Gabriel García Márquez, ganador del Premio Nobel de Literatura en 1982.",R.drawable.libroa12 ));
        return series;
    }

    public void onClicklibro(View view) {
        Intent miIntent = new Intent(this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(this, disponibilidad.class);
        startActivity(miIntent);
    }

    public void onClickreflibro (View view) {
        Intent miIntent = new Intent(this, ventana17.class);
        startActivity(miIntent);
    }

}
