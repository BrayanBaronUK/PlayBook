package konradlorenz.edu.playbook;

public class buscar_personas_atributos {
    private String nombre;
    private String nacionalidad;
    private String edad;
    private int img;

    public buscar_personas_atributos() {
    }

    public buscar_personas_atributos(String nombre, String nacionalidad, String edad, int img) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.img = img;
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
