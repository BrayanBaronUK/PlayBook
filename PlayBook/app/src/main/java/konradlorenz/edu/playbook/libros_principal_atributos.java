package konradlorenz.edu.playbook;

public class libros_principal_atributos {

    private String titulo;
    private String text;
    private int img;

    public libros_principal_atributos() {
    }

    public libros_principal_atributos(String titulo, String text, int img) {
        this.titulo = titulo;
        this.text = text;
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
