
package Modelo;

public class Materia {

    private int id_materia;
    private String nombre_materia;
    private String year;
    private boolean estado;

    public Materia(int id_materia, String nombre_materia, String year, boolean estado) {
        this.id_materia = id_materia;
        this.nombre_materia = nombre_materia;
        this.year = year;
        this.estado = estado;
    }

    public Materia(String nombre_materia, String year, boolean estado) {
        this.nombre_materia = nombre_materia;
        this.year = year;
        this.estado = estado;
    }

    public Materia() {
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return getNombre_materia();
    }
    
    
    
}
