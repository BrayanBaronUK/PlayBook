package konradlorenz.edu.playbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class jeugos_referencia_description_recycler extends RecyclerView.Adapter<jeugos_referencia_description_recycler.ViewHolder> {
    Context m;

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private TextView titulo;
        private TextView text;
        ImageView foto;
        private View elementView;


        public ViewHolder(View ItemView) {
            super(ItemView);

            titulo = ItemView.findViewById(R.id.id_principal_titulo_juegos);
            text     = ItemView.findViewById(R.id.id_principal_text_juegos);
            foto = ItemView.findViewById(R.id.id_principal_img_juegos);
            elementView = ItemView;
        }
    }

    public List<juegos_referencia_principal_atributos> catalogo;


    public jeugos_referencia_description_recycler(List<juegos_referencia_principal_atributos> catalogo) {
        this.catalogo= catalogo;
    }

    @Override
    public jeugos_referencia_description_recycler.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.juegos_referencia_descripcion_recycler,viewGroup,false);
        jeugos_referencia_description_recycler.ViewHolder viewHolder = new jeugos_referencia_description_recycler.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(jeugos_referencia_description_recycler.ViewHolder viewHoder, int i) {
        viewHoder.titulo.setText(catalogo.get(i).getTitulo());
        viewHoder.text.setText(catalogo.get(i).getText());
        viewHoder.foto.setImageResource(catalogo.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return catalogo.size();
    }
}
