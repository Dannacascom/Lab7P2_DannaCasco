
import java.util.ArrayList;


public class Carpeta {
    private String nombre;
    private ArrayList<Archivo> archivo = new ArrayList();
    private ArrayList<Carpeta> carpeta = new ArrayList();

    public Carpeta() {
    }

    public Carpeta(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Carpeta{" + "nombre=" + nombre + ", archivo=" + archivo + ", carpeta=" + carpeta + '}';
    }

    
}
