package konradlorenz.edu.playbook;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class buscar_evento extends AppCompatActivity {

    private RecyclerView recyclerView;
    private inicio_principal_recycler adaptador;
    private Transition transition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_evento);

        recyclerView = findViewById(R.id.idrcyclerprincipal);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new inicio_principal_recycler(this,obtener());
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
