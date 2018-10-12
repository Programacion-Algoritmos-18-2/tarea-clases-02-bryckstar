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
public class Precio {
    
    private double euro;
    
    public double obtener(){
        return euro;
    }
    
    public void agregar(double x){
        euro = x;
    }
    
    public Precio(){
        agregar(30.2);
    }
    
    public Precio(double y){
        agregar(y);
    }
    
}
