package konradlorenz.edu.playbook;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

import java.util.ArrayList;
import java.util.List;

public class buscar_personas extends AppCompatActivity {
    private RecyclerView recyclerView;
    private buscar_personas_recycler adaptador;
    private Transition transition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_personas);

        recyclerView = findViewById(R.id.id_recicler_personas);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new buscar_personas_recycler(this,obtener());
        recyclerView.setAdapter(adaptador);

        Slide slideBottom = new Slide();
        slideBottom.setDuration(inicio_principall.DURATION_TRANSITION);
        slideBottom.setInterpolator(new DecelerateInterpolator());
        getWindow().setReenterTransition(slideBottom);

        getWindow().setAllowReturnTransitionOverlap(false);

        Slide slideTop = new Slide(Gravity.BOTTOM);
        slideTop.setDuration(inicio_principall.DURATION_TRANSITION);
        slideTop.setInterpolator(new DecelerateInterpolator());


        Slide slideTop2 = new Slide(Gravity.TOP);
        slideTop.setDuration(inicio_principall.DURATION_TRANSITION);
        slideTop.setInterpolator(new DecelerateInterpolator());

        getWindow().setEnterTransition(slideTop2);
        getWindow().setReturnTransition(slideTop);
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
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onLibro(View view) {
        Intent miIntent = new Intent(this, libros_principall.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onJuego(View view) {
        Intent miIntent = new Intent(this, disponibilidad.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onFoto(View view) {
        Intent miIntent = new Intent(this, galeria_fotos_principal.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onPerfillocal(View view) {
        Intent miIntent = new Intent(this, perfil_usuario_local.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onSalir(View view) {
        Intent miIntent = new Intent(this, inicio_sesion.class);
        startActivity(miIntent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onConfiguracion(View view) {
        Intent miIntent = new Intent(this, perfiluser.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    //CSANCEHZC


    public void onExplodeClicked(View view){
        transition = new Explode();
        iniciarActividadSecundaria();
    }

    public void onSlideClicked(View view){
        transition = new Slide(Gravity.START);
        iniciarActividadSecundaria();
    }

    public void onFadeClicked(View view){
        transition = new Fade(Fade.OUT);
        iniciarActividadSecundaria();
    }

    private void iniciarActividadSecundaria(){
        transition.setDuration(inicio_principall.DURATION_TRANSITION);
        transition.setInterpolator(new DecelerateInterpolator());

        getWindow().setExitTransition(transition);
    }
}
