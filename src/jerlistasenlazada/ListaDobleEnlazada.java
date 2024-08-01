/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerlistasenlazada;

/**
 *
 * @author Docente
 */
public class ListaDobleEnlazada {

    private NodoDoble cabeza = null;
    private NodoDoble cola = null;

    public void agregarInicio(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
    }

    public void agregarFinal(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }
        else{
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    public void mostrar() {
        NodoDoble temp = cabeza;
        while (temp != null) {
            System.out.println(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
    
   
}
