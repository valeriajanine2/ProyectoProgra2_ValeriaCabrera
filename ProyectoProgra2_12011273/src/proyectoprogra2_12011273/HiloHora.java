/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra2_12011273;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//hilos con interfaces
public class HiloHora implements Runnable {
    private JLabel hora;
    private String stop;
    public HiloHora(JLabel hora) {
        this.hora = hora;
    }     

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }
    
    

    //sobreescribir el metodo run
    //contiene el trabajo del hilo
    @Override
    public void run() {
        while(true){//while infinito
            Date h=new Date();//leer la hora del sistema
            DateFormat f=new SimpleDateFormat("hh:mm:ss");//formato
            hora.setText( f.format(h) );//se setea al label
            if(hora.equals(stop))
                JOptionPane.showMessageDialog(null, "Recuerda tu tarea");
            try {
                //siempre debe haber un descanso
                Thread.sleep(50);//descanso de 50 milisegundos
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}

