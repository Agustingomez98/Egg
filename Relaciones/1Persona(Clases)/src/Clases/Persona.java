
package Clases;

import java.util.List;


public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private List<Perro> perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni, List<Perro> perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.perro = perro;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public List<Perro> getPerro() {
        return perro;
    }

    public void setPerro(List<Perro> perro) {
        this.perro = perro;
    }

   
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
    
    
}
