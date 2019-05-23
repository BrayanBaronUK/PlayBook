package konradlorenz.edu.playbook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class juegos_referencia_principal_recycler extends  RecyclerView.Adapter<juegos_referencia_principal_recycler.ViewHolder> {
    Context m;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView titulo;
        private TextView text;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);
            foto = ItemView.findViewById(R.id.id_juegos_referencia_img);
            elementView = ItemView;
        }
    }

    public List<juegos_referencia_principal_atributos> catalogo;


    public juegos_referencia_principal_recycler(Context m,List<juegos_referencia_principal_atributos> catalogo) {
        this.catalogo= catalogo;
        this.m = m;
    }

    @Override
    public juegos_referencia_principal_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.juegos_referencia_recycler,viewGroup,false);
        juegos_referencia_principal_recycler.ViewHolder viewHolder = new juegos_referencia_principal_recycler.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(juegos_referencia_principal_recycler.ViewHolder viewHoder, int i) {
        final juegos_referencia_principal_atributos serie = catalogo.get(i);
        viewHoder.foto.setImageResource(catalogo.get(i).getImg());
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
        return catalogo.size();
    }
}
