/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;




/**
 *
 * @author Bryan
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Precio p = new Precio(); // Se llama a la clase 
        Precio n = new Precio (255);
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
    
}
