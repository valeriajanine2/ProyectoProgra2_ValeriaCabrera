/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra2_12011273;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Reuniones {
    
    private ArrayList<Cuenta> atendees = new ArrayList();
    private String asunto;
    private String ubicacion;
    private Date inicio;
    private Date fin;
    private String descripcion;

    public Reuniones() {
    }

    public Reuniones(String asunto, String ubicacion, Date inicio, Date fin, String descripcion) {
        this.asunto = asunto;
        this.ubicacion = ubicacion;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }

    public ArrayList<Cuenta> getAtendees() {
        return atendees;
    }

    public void setAtendees(ArrayList<Cuenta> atendees) {
        this.atendees = atendees;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Reuniones{" + "atendees=" + atendees + ", asunto=" + asunto + ", ubicacion=" + ubicacion + ", inicio=" + inicio + ", fin=" + fin + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
