package konradlorenz.edu.playbook;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class perfil_usuario_local extends AppCompatActivity {

    private Transition transition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario_local);

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
    public void onClickLibrosLocal (View view) {
        Intent miIntent = new Intent(this, libros_principall.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickJuegosLocal (View view) {
        Intent miIntent = new Intent(this, juegos_referencia_principal.class);
        startActivity(miIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickFotosLocal (View view) {
        Intent miIntent = new Intent(this, galeria_fotos_principal.class);
        startActivity(miIntent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
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
    public void onInicio(View view) {
        Intent miIntent = new Intent(this, inicio_principall.class);
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
