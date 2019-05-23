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

public class infouser_principal extends AppCompatActivity {

    private RecyclerView recyclerView;
    private infouser_principal_recycler adaptador;
    private Transition transition;
    private inicio_principal_recycler adaptador2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infouser_principal);

        recyclerView = findViewById(R.id.id_principal_user_recycler);
        RecyclerView.LayoutManager m = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(m);
        adaptador = new infouser_principal_recycler(obtener());
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

    public void onClickLibros (View view) {
        Intent miIntent = new Intent(this, libros_referencia_principal_otro_usuario.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickJuegos (View view) {
        Intent miIntent = new Intent(this, juegos_referencia_principal_otro_usuario.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickFotos (View view) {
        Intent miIntent = new Intent(this, galeria_fotos_principal_otro_usuario.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickChat (View view) {
        Intent miIntent = new Intent(this, chat_messages.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }


    public List<infouser_principal_atributos> obtener(){
        String nombre = getIntent().getStringExtra("nombre");
        String nacionalidad = getIntent().getStringExtra("nacionalidad");
        String edad = getIntent().getStringExtra("edad");
        int foto = getIntent().getIntExtra("foto",0);
        List<infouser_principal_atributos> series = new ArrayList<>();
        series.add(new infouser_principal_atributos(nombre,nacionalidad,edad,foto));
        return series;
    }
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
