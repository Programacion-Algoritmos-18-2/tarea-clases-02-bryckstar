/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author Bryan
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Precio p;
        p = new Precio();
        System.out.println(p.euro);
        p.euro = 10.1;
        System.out.println(p.euro);
        
    }
    
}
