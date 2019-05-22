package konradlorenz.edu.playbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class libros_principal_recycler extends RecyclerView.Adapter<libros_principal_recycler.ViewHolder> {


    Context m;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView titulo;
        private TextView text;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);
            foto = (ImageView) ItemView.findViewById(R.id.id_principal_img_libros);
        }
    }

    public List<libros_principal_atributos> catalogo;


    public libros_principal_recycler(List<libros_principal_atributos> catalogo) {
        this.catalogo= catalogo;
    }

    @Override
    public libros_principal_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.libros_item_recycler,viewGroup,false);
        libros_principal_recycler.ViewHolder viewHolder = new libros_principal_recycler.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(libros_principal_recycler.ViewHolder viewHoder, int i) {
        viewHoder.foto.setImageResource(catalogo.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return catalogo.size();
    }
}
