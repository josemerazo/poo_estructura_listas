/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerlistasenlazada;

/**
 *
 * @author Docente
 */
public class ListaOrdenada {

    Nodo cabecera;

    public ListaOrdenada() {
        cabecera = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Caso 1: Lista vacía
        if (cabecera == null) {
            cabecera = nuevoNodo;
            return;
        }

        // Caso 2: Inserción al inicio
        if (nuevoNodo.dato < cabecera.dato) {
            nuevoNodo.siguiente = cabecera;
            cabecera = nuevoNodo;
            return;
        }

        // Caso 3: Inserción en el medio o al final
        Nodo temp = cabecera;
        while (temp.siguiente != null && temp.siguiente.dato < nuevoNodo.dato) {
            temp = temp.siguiente;
        }

        nuevoNodo.siguiente = temp.siguiente;
        temp.siguiente = nuevoNodo;
    }

    public void mostrar() {
        Nodo temp = cabecera;
        while (temp != null) {
            System.out.println(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}
