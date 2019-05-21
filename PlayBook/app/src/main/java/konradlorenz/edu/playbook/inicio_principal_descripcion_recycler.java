package konradlorenz.edu.playbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class inicio_principal_descripcion_recycler extends RecyclerView.Adapter<inicio_principal_descripcion_recycler.ViewHolder> {

    Context m;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView titulo;
        private TextView text;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);
            titulo = (TextView) ItemView.findViewById(R.id.id_titulo_descripcion);
            text = (TextView) ItemView.findViewById(R.id.id_text_description);
            foto = (ImageView) ItemView.findViewById(R.id.idimgdescripcion);
        }
    }

    public List<inicio_principal_atributos> catalogo;


    public inicio_principal_descripcion_recycler(List<inicio_principal_atributos> catalogo) {
        this.catalogo= catalogo;
    }

    @Override
    public inicio_principal_descripcion_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inicio_principal_descripcion_recycler,viewGroup,false);
        inicio_principal_descripcion_recycler.ViewHolder viewHolder = new inicio_principal_descripcion_recycler.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(inicio_principal_descripcion_recycler.ViewHolder viewHoder, int i) {
        viewHoder.titulo.setText(catalogo.get(i).getTitulo());
        viewHoder.text.setText(catalogo.get(i).getText());
        viewHoder.foto.setImageResource(catalogo.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return catalogo.size();
    }
}
