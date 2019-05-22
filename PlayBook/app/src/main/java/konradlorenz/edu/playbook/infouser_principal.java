package konradlorenz.edu.playbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class infouser_principal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private infouser_principal_recycler adaptador;

    private inicio_principal_recycler adaptador2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infouser_principal);

        recyclerView = (RecyclerView)findViewById(R.id.id_principal_user_recycler);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new infouser_principal_recycler(obtener());
        recyclerView.setAdapter(adaptador);


    }

    public List<infouser_principal_atributos> obtener(){
        String nombre = getIntent().getStringExtra("nombre");
        String nacionalidad = getIntent().getStringExtra("nacionalidad");
        String edad = getIntent().getStringExtra("edad");
        int foto = getIntent().getIntExtra("foto",0);
        List<infouser_principal_atributos> series = new ArrayList<>();
        series.add(new infouser_principal_atributos(nombre,nacionalidad,edad,"EL mejordfhfdhdfhfd",R.drawable.call,foto));
        return series;
    }

}
