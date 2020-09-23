/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra2_12011273;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class BinarioCorreo{
    
    private ArrayList<Correo> listaCorreos = new ArrayList(); //memoria ram
    private File archivo = null;//memoria rom

    public BinarioCorreo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Correo> getListaCorreos() {
        return listaCorreos;
    }

    public void setListaCorreos(ArrayList<Correo> listaCorreos) {
        this.listaCorreos = listaCorreos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCorreos=" + listaCorreos;
    }

    //extra mutador
    public void setCorreo(Correo p) {
        this.listaCorreos.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaCorreos = new ArrayList();//limpiar el arraylist
            Correo temp;
            if (archivo.exists()) {//para evitar exception
                FileInputStream entrada = new FileInputStream(archivo); //apuntar al archivo
                ObjectInputStream objeto = new ObjectInputStream(entrada);//apuntando hacia el canal
                try {
                    //leyendo de objeto en objeto
                    while ((temp = (Correo) objeto.readObject()) != null) {//iterar lo que esta en el buffer
                        listaCorreos.add(temp);//se agrega cada objeto al arraylist
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();//cerrar el canal
                entrada.close();//cerrar el objeto
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);//apuntando hacia el archivo
            bw = new ObjectOutputStream(fw);//apuntando hacia el canal
            //sobreescribir sobre el archivo
            for (Correo t : listaCorreos) {
                bw.writeObject(t);//escribiendo objetos
            }
            //cada nodo del arraylist se escribe
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
