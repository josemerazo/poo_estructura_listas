/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerlistasenlazada;

/**
 *
 * @author Docente
 */
public class ListaCircular {

    private Nodo cabecera;

    public ListaCircular(int num) {
        cabecera.dato = num;
        cabecera.siguiente = cabecera;
    }

    public ListaCircular() {
        cabecera = null;
    }

    public void agregarInicio(int num) {
        Nodo nuevoNodo = new Nodo(num);
        nuevoNodo.siguiente = nuevoNodo;
        if (cabecera == null) {
            cabecera = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabecera;
            Nodo temp = cabecera;
            while (temp.siguiente != cabecera) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            cabecera = nuevoNodo;
        }
    }

    public void mostrar() {
        Nodo temp = cabecera;
        do {
            System.out.println(temp.dato);
            temp = temp.siguiente;
        } while (temp != cabecera);
        System.out.println();
    }

    public void recorrerN(int n) {
        Nodo tmp = cabecera;

        for (int i = 0; i < n; i++) {
            tmp = tmp.siguiente;
        }
        System.out.println(tmp.dato);
    }
}
