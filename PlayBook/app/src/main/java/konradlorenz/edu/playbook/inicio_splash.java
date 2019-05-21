package konradlorenz.edu.playbook;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class inicio_splash extends AppCompatActivity {

    private final int DURACION_SPLASH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_inicio_splash);

        new Handler().postDelayed(new Runnable(){
            public void run() {
                Intent intent = new Intent(inicio_splash.this , inicio_sesion.class);
                startActivity(intent);
                finish();
            };
        },DURACION_SPLASH);
    }
}
