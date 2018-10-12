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
public class Ejecutor {

    public static void main(String[] args) {
        
        // Se llama a las clases por medio de una variable
        Equipo e = new Equipo();
        Equipo n = new Equipo();
        Equipo m = new Equipo();
        Equipo o = new Equipo();

        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e.obtener_nombre(), e.obtener_num_jugadores(), e.obtener_ciudad());// Se presentan los datos del primeer quipo
        
        //Se agregan los datos del segundo equipo por medio de los metodos
        n.agregar_nombre("Liga de Loja");
        n.agregar_num_jugadores(20);
        n.agregar_ciudad("Loja");
        
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", n.obtener_nombre(), n.obtener_num_jugadores(), n.obtener_ciudad());// Se presentan los datos del segundo quipo
        
        //Se agregan los datos del tercer equipo por medio de los metodos
        m.agregar_nombre("Barcelonashhhh");
        m.agregar_num_jugadores(19);
        m.agregar_ciudad("H city");
        
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", m.obtener_nombre(), m.obtener_num_jugadores(), m.obtener_ciudad());// Se presentan los datos del tercer quipo
        
        //Se agregan los datos del cuarto equipo por medio de los metodos
        o.agregar_nombre("Campeones Fc");
        o.agregar_num_jugadores(20);
        o.agregar_ciudad("Quitoff");
        
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", o.obtener_nombre(), o.obtener_num_jugadores(), o.obtener_ciudad());// Se presentan los datos del cuarto quipo
        
        
    }

}
