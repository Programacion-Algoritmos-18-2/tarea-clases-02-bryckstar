/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFinal;

/**
 *
 * @author Bryan
 */
public class Equipo {
    
    //Se declaran las variables
    String nombre;
    int num_jugadores;
    String ciudad;
    
    //Se crean los metodos para obtener y agregar los valores de las variables
    public String obtener_nombre(){
        return nombre;
    }
    
    public void agregar_nombre(String x){
        nombre = x;
    }
    
    public int obtener_num_jugadores(){
        return num_jugadores;
    }
    
    public void agregar_num_jugadores(int a){
        num_jugadores = a;
    }
    
    public String obtener_ciudad(){
        return ciudad;
    }
    
    public void agregar_ciudad(String b){
        ciudad = b;
    }
    
    //Se inician los contructures para cada metodo
    public Equipo(){
        agregar_nombre("Chancleta FC");
        agregar_num_jugadores(21);
        agregar_ciudad("Virgenpamba");
    }
    
    public Equipo(String y){
        agregar_nombre(y);
    }
    
    public Equipo(String x, int a){
        agregar_nombre(x);
        agregar_num_jugadores(a);
    }
    
    public Equipo(String x, int a, String c){
        agregar_nombre(x);
        agregar_num_jugadores(a);
        agregar_ciudad(c);
    }
    
    
    
}
