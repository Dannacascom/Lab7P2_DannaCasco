
import java.util.ArrayList;


public class Carpeta {
    private String nombre,link;
    private ArrayList<Archivo> archivo = new ArrayList();
    private ArrayList<Carpeta> carpeta = new ArrayList();

    public Carpeta() {
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivo> archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Carpeta> getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(ArrayList<Carpeta> carpeta) {
        this.carpeta = carpeta;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
