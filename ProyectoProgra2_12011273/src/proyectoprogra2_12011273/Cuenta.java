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
public class Cuenta {
    
    private String nombre;
    private String apellido;
    private String user;
    private String password;
    private int edad;

    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, String user, String password, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.password = password;
        this.edad = edad;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
