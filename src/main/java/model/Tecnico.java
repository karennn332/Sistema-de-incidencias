
package model;

import java.util.List;


public class Tecnico {
  
    private String nombre;
    private List<String> especialidades;

    public Tecnico(String nombre, List<String> especialidades) {
        this.nombre = nombre;
        this.especialidades = especialidades;
    }

   public Tecnico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }
    
    
}
