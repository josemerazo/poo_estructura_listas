/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jerlistasenlazada;

/**
 *
 * @author Docente
 */
public class JERListasEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaEnlazada lista = new ListaEnlazada();
       lista.agregar(14);
       lista.agregar(58);
       lista.agregar(1);
       lista.agregar(58);
       lista.agregarInicio(60);
       lista.agregar(16);
       lista.mostrar();
       lista.agregar(58);
       lista.agregar(14);
       lista.agregar(58);
       lista.agregar(1);
       lista.agregar(56);
       lista.agregar(1);
       
       lista.agregar(23);
       lista.agregarInicio(99);
       lista.agregarInicio(68);
       lista.mostrar();
       
       ListaOrdenada ordenada = new ListaOrdenada();
       ordenada.agregar(2);
       ordenada.agregar(5);
       ordenada.agregar(8);
       ordenada.agregar(3);
       ordenada.agregar(6);
       ordenada.mostrar();
       
    }
    
}
