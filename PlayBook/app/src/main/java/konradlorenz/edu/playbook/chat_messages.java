package konradlorenz.edu.playbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class chat_messages extends AppCompatActivity {
    EditText message;
    TextView chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_messages);
        this.chat    = (TextView)   findViewById(R.id.textView9);
    }

    public void onClick(View view) {
        Intent miIntent = new Intent(chat_messages.this, inicio_sesion.class);
        startActivity(miIntent);
    }

    public void onClickinic (View view) {
        Intent miIntent = new Intent(chat_messages.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onClickusuc (View view) {
        Intent miIntent = new Intent(chat_messages.this, MainActivity.class);
        startActivity(miIntent);
    }

    public void onSend (View view){

        this.message = (EditText) findViewById(R.id.editText12);

        this.chat.append("\n" + this.message.getText());
        this.message.setText("");
    }

}
