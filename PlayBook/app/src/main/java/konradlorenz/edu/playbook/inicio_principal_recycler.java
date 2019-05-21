package konradlorenz.edu.playbook;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class inicio_principal_recycler extends RecyclerView.Adapter<inicio_principal_recycler.ViewHolder> {

    Context m;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo;
        private TextView text;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);
            titulo = (TextView) ItemView.findViewById(R.id.inicio_titulo_principal_recycler);
            text     = (TextView) ItemView.findViewById(R.id.inicio_text_principal_recycler);
            foto = (ImageView) ItemView.findViewById(R.id.inicio_img_principal_recycler);
            elementView = ItemView;

        }
    }

    public List<inicio_principal_atributos> inicio;


    public inicio_principal_recycler(Context m,List<inicio_principal_atributos> inicio) {
        this.inicio = inicio;
        this.m = m;

    }

    @Override
    public inicio_principal_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inicio_principal_recycler,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHoder, int i) {
        final inicio_principal_atributos serie = inicio.get(i);
        viewHoder.titulo.setText(inicio.get(i).getTitulo());
        viewHoder.text.setText(inicio.get(i).getText());
        viewHoder.foto.setImageResource(inicio.get(i).getImg());

        viewHoder.elementView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){


                Toast.makeText(m ,"Selecionado"+serie.getTitulo(), Toast.LENGTH_SHORT).show();
                Intent miIntent = new Intent(view.getContext(), inicio_principal_descripcionn.class);
                miIntent.putExtra("titulo", serie.getTitulo());
                miIntent.putExtra("text", serie.getText());
                miIntent.putExtra("foto", serie.getImg());
                m.startActivity(miIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return inicio.size();
    }

}
