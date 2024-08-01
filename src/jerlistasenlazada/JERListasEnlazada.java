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

        System.out.println("Lista doble enlazada");
        ListaDobleEnlazada dobleEnlazada = new ListaDobleEnlazada();

        dobleEnlazada.agregarFinal(62);
        dobleEnlazada.agregarInicio(5);
        dobleEnlazada.agregarInicio(10);
        dobleEnlazada.agregarInicio(9);
        dobleEnlazada.agregarInicio(6);
        dobleEnlazada.agregarFinal(20);
        dobleEnlazada.mostrar();

        System.out.println("Lista circular enlazada");
        ListaCircular circular = new ListaCircular();
        circular.agregarInicio(5);
        circular.agregarInicio(9);
        circular.agregarInicio(4);
        circular.agregarInicio(76);
        circular.agregarInicio(0);
        circular.agregarInicio(10);

        int aleatorio = (int) (Math.random() * 100);
        circular.recorrerN(aleatorio);
        //circular.mostrar();

    }

}
