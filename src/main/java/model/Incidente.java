/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author karen
 */
public class Incidente {
    private Cliente cliente;
    private String servicios;
    private String descripcion;
    private String tipoProblema;
    private Tecnico tecnicoAsignado;
    private String fechaResolucion;

    public Incidente(Cliente cliente, String servicios, String descripcion, String tipoProblema, Tecnico tecnicoAsignado, String fechaResolucion) {
        this.cliente = cliente;
        this.servicios = servicios;
        this.descripcion = descripcion;
        this.tipoProblema = tipoProblema;
        this.tecnicoAsignado = tecnicoAsignado;
        this.fechaResolucion = fechaResolucion;
    }

    public Incidente() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }
    
    
    
}
