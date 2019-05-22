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

public class buscar_personas_recycler extends RecyclerView.Adapter<buscar_personas_recycler.ViewHolder>{

    Context m;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView nombre;
        private TextView nacionalidad;
        private TextView edad;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);
            nombre = (TextView) ItemView.findViewById(R.id.id_nombre_buscar);
            nacionalidad = (TextView) ItemView.findViewById(R.id.id_nacionalidad_buscar);
            edad = (TextView) ItemView.findViewById(R.id.id_edad_buscar);
            foto = (ImageView) ItemView.findViewById(R.id.id_img_buscar);
            elementView = ItemView;
        }
    }

    public List<buscar_personas_atributos> catalogo;


    public buscar_personas_recycler(Context m , List<buscar_personas_atributos> catalogo) {
        this.catalogo= catalogo;
        this.m = m;
    }

    @Override
    public buscar_personas_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.buscar_personas_recycler,viewGroup,false);
        buscar_personas_recycler.ViewHolder viewHolder = new buscar_personas_recycler.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(buscar_personas_recycler.ViewHolder viewHoder, int i) {
        final buscar_personas_atributos serie = catalogo.get(i);
        viewHoder.nombre.setText(catalogo.get(i).getNombre());
        viewHoder.nacionalidad.setText(catalogo.get(i).getNacionalidad());
        viewHoder.edad.setText(catalogo.get(i).getEdad());
        viewHoder.foto.setImageResource(catalogo.get(i).getImg());

        viewHoder.elementView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){


                Toast.makeText(m ,"Selecionado"+serie.getNombre(), Toast.LENGTH_SHORT).show();
                Intent miIntent = new Intent(view.getContext(), infouser_principal.class);
                miIntent.putExtra("nombre", serie.getNombre());
                miIntent.putExtra("nacionalidad", serie.getNacionalidad());
                miIntent.putExtra("edad", serie.getEdad());
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
