package konradlorenz.edu.playbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class infouser_principal_recycler extends RecyclerView.Adapter<infouser_principal_recycler.ViewHolder>{

    Context m;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView nombre;
        private TextView nacionalidad;
        private TextView edad;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);
            nombre = ItemView.findViewById(R.id.id_nombre_principal_user);
            nacionalidad = ItemView.findViewById(R.id.id_nacionalidad_principal_user);
            edad = ItemView.findViewById(R.id.id_edad_principal_user);
            foto = ItemView.findViewById(R.id.id_img_principal_user);
        }
    }

    public List<infouser_principal_atributos> catalogo;


    public infouser_principal_recycler(List<infouser_principal_atributos> catalogo) {
        this.catalogo= catalogo;
    }

    @Override
    public infouser_principal_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.infouser_item_recycle,viewGroup,false);
        infouser_principal_recycler.ViewHolder viewHolder = new infouser_principal_recycler.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(infouser_principal_recycler.ViewHolder viewHoder, int i) {
        viewHoder.foto.setImageResource((catalogo.get(i).getImg()));
        viewHoder.nombre.setText(catalogo.get(i).getNombre());
        viewHoder.nacionalidad.setText(catalogo.get(i).getNacionalidad());
        viewHoder.edad.setText(catalogo.get(i).getEdad());
    }

    @Override
    public int getItemCount() {
        return catalogo.size();
    }
}
