package konradlorenz.edu.playbook;

public class infouser_principal_atributos {
    private String nombre;
    private String nacionalidad;
    private String edad;
    private String titulo;
    private int imgDescrocion;
    private int img;

    public infouser_principal_atributos() {
    }

    public infouser_principal_atributos(String nombre, String nacionalidad, String edad, String titulo, int imgDescrocion, int img) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.titulo = titulo;
        this.imgDescrocion = imgDescrocion;
        this.img = img;
    }

    public infouser_principal_atributos(String titulo, int imgDescrocion) {
        this.titulo = titulo;
        this.imgDescrocion = imgDescrocion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImgDescrocion() {
        return imgDescrocion;
    }

    public void setImgDescrocion(int imgDescrocion) {
        this.imgDescrocion = imgDescrocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
