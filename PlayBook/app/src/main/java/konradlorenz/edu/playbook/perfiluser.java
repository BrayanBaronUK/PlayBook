package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class perfiluser extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfiluser);
    }

    public void onClickcon (View view) {
        Intent miIntent = new Intent(perfiluser.this, ventana11.class);
        startActivity(miIntent);
    }

    public void onClickinf (View view) {
        Intent miIntent = new Intent(perfiluser.this, ventana12.class);
        startActivity(miIntent);
    }

    public void onClicksal3 (View view) {
        Intent miIntent = new Intent(perfiluser.this, MainActivity.class);
        startActivity(miIntent);
    }


}
