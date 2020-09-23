/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra2_12011273;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Tareas {
    
    private String asunto;
    private String descripcion;
    private String estado;
    private Date inicio;
    private Date fin;

    public Tareas() {
    }

    public Tareas(String asunto, String descripcion, String estado, Date inicio, Date fin) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.estado = estado;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Tareas{" + "asunto=" + asunto + ", descripcion=" + descripcion + ", estado=" + estado + ", inicio=" + inicio + ", fin=" + fin + '}';
    }
    
    
    
}
