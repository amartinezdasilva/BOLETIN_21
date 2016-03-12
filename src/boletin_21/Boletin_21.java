/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_21;

import javax.swing.JOptionPane;

/**
 *
 * @author AAron
 */
public class Boletin_21 {

    public static void main(String[] args) {
       Metodos prueba = new Metodos ();
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Introduce la opción que desee ejecutar \n 1.-Escribir en fichero \n 2.-Ordenar datos en fichero \n 3.-Leer fichero \n 4.-Salir de la ejecución"));
       
        switch(op){
            case 1:
                prueba.cargarArray();
                prueba.escribirFichero();
                break;
            case 2:
                prueba.ordenar();
                break;
            case 3:
                prueba.leerFichero("nombres.txt");
                break;
            case 4:
                break;
        
    } 
        
    
    
       }while(op<4);
}
}
  