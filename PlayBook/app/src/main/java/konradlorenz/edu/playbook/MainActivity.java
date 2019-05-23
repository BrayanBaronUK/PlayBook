package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import konradlorenz.edu.playbook.content.ChatFragment;
import konradlorenz.edu.playbook.content.FotosFragment;
import konradlorenz.edu.playbook.content.InfoFragment;
import konradlorenz.edu.playbook.content.JuegosFragment;
import konradlorenz.edu.playbook.content.LibrosFragment;
import konradlorenz.edu.playbook.content.SalirFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        this.drawer = findViewById(R.id.drawer);
        this.toogle = new ActionBarDrawerToggle(
                this, drawer,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // llamar libros
        //el manejador de sopórte (v4): getSupportFragmentManager();
        //el manejador de fragmentos nativo: getFragmentManager();

        if (id == R.id.nav_libros) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flContent, new LibrosFragment())
                    .commit();
        } else if (id == R.id.nav_juegos) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flContent, new JuegosFragment())
                    .commit();

        } else if (id == R.id.nav_fotos) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flContent, new FotosFragment())
                    .commit();

        } else if (id == R.id.nav_info) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flContent, new InfoFragment())
                    .commit();

        } else if (id == R.id.nav_chat) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flContent, new ChatFragment())
                    .commit();

        }else if (id == R.id.nav_salir) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flContent, new SalirFragment())
                    .commit();

        }

        DrawerLayout drawer = findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(MainActivity.this, libros_principall.class);
        startActivity(miIntent);
    }

    public void onClick1 (View view) {
        Intent miIntent = new Intent(MainActivity.this, juegos_referencia_principal.class);
        startActivity(miIntent);
    }
    public void onClicksal2 (View view) {
        Intent miIntent = new Intent(MainActivity.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickjug(View view) {
        Intent miIntent = new Intent(MainActivity.this, inicio_principal_descripcionn.class);
        startActivity(miIntent);
    }

    public void onClickfot (View view) {
        Intent miIntent = new Intent(MainActivity.this, informacionfoto.class);
        startActivity(miIntent);
    }

    public void onClicksal (View view) {
        Intent miIntent = new Intent(MainActivity.this, ventana2.class);
        startActivity(miIntent);
    }

    public void onClickto14 (View view) {
        Intent miIntent = new Intent(MainActivity.this, galeriafotos.class);
        startActivity(miIntent);
    }

    public void onClickt14 (View view) {
        Intent miIntent = new Intent(MainActivity.this, galeriafotos.class);
        startActivity(miIntent);
    }

    public void onClickcon (View view) {
        Intent miIntent = new Intent(MainActivity.this, ventana11.class);
        startActivity(miIntent);
    }

    public void onClickinf (View view) {
        Intent miIntent = new Intent(MainActivity.this, editarinformacion.class);
        startActivity(miIntent);
    }
    public void onClicksal3 (View view) {
        Intent miIntent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClickchat(View view) {
        Intent miIntent = new Intent(MainActivity.this, chat_messages.class);
        startActivity(miIntent);
    }

    public void onClickper (View view) {
        Intent miIntent = new Intent(MainActivity.this, disponibilidad.class);
        startActivity(miIntent);
    }

    public void onClickeve (View view) {
        Intent miIntent = new Intent(MainActivity.this, ventana2.class);
        startActivity(miIntent);
    }

    public void onClickfinal (View view) {
        Intent miIntent = new Intent(MainActivity.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickevej (View view) {
        Intent miIntent = new Intent(MainActivity.this, juegos_referencia_principal.class);
        startActivity(miIntent);
    }

    public void onClickregi(View view) {
        Intent miIntent = new Intent(MainActivity.this, registrar_usuario.class);
        startActivity(miIntent);
    }

    public void onClicksubf(View view) {
        Intent miIntent = new Intent(MainActivity.this, inicio_principal_descripcionn.class);
        startActivity(miIntent);
    }




}
