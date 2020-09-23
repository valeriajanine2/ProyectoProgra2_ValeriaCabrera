/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra2_12011273;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Correo {
    
    private Cuenta emisor;
    private ArrayList<Cuenta> receptores = new ArrayList();
    private String asunto;
    private String mensaje;

    public Correo() {
    }

    public Correo(Cuenta emisor, String asunto, String mensaje) {
        this.emisor = emisor;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public Cuenta getEmisor() {
        return emisor;
    }

    public void setEmisor(Cuenta emisor) {
        this.emisor = emisor;
    }

    public ArrayList<Cuenta> getReceptores() {
        return receptores;
    }

    public void setReceptores(ArrayList<Cuenta> receptores) {
        this.receptores = receptores;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Correo{" + "emisor=" + emisor + ", receptores=" + receptores + ", asunto=" + asunto + ", mensaje=" + mensaje + '}';
    }
    
    
    
}
