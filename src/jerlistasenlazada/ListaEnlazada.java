/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerlistasenlazada;

/**
 *
 * @author Docente
 */
public class ListaEnlazada {

    Nodo cabecera;

    public ListaEnlazada() {
        cabecera = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabecera == null) {
            cabecera = nuevoNodo;
        } else {
            Nodo temp = cabecera;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void agregarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabecera == null) {
            cabecera = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabecera;
            cabecera = nuevoNodo;
        }

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
