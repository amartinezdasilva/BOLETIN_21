/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author AAron
 */

public class Metodos {
     private final String []nombres = new String [5];
     
     
     public void escribirFichero(){
         PrintWriter aux_Prueba=null;
         try{
             aux_Prueba= new PrintWriter (new File ("nombres.txt"));
              for(int i=0;i<nombres.length;i++){
                aux_Prueba.println(i+ " " + nombres[i]);
         }
     } catch(FileNotFoundException k){
         JOptionPane.showMessageDialog(null,"No se encuentra el archivo"+k.toString());
     }
        finally{
            aux_Prueba.close();
         
}
     }

     public void cargarArray(){
          for(int i=0;i<nombres.length;i++){
            nombres[i]=JOptionPane.showInputDialog("Nombre :" + (i));
     }
}
     public void ordenar(){
         Arrays.sort(nombres);
         
     }
     public void leerFichero(String nombreFichero){
        File f = new File(nombreFichero);
        Scanner sc= null;
        try {
            f = new File (nombreFichero);
             sc = new Scanner(f);
             
             while(sc.hasNextLine()){
                 String res = sc.nextLine();
                 System.out.println(res);
              
             }
        } catch (FileNotFoundException k) {
            System.out.println("Error de fichero " + k.toString());
        }
        finally {
            sc.close();
        }
    }
}