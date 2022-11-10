/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listaligada;

/**
 *
 * @author herna
 */
public class ListaLigada<T>{
    private Nodo head;//apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (ultimo nodo)
    private Nodo actual;//Apuntador al nodo seleccioado actualmente
    private int size;//tamano de la lista (numero de nodos en la lista)
    
    public ListaLigada(){
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;      
    }
    /*
    public void addFirst(int dato){
        Nodo nodo = new Nodo(dato);
        this.head = nodo;
        this.tail = nodo;
        this.actual = nodo;
        this.size++;
    }
    
    */
    public void add(T dato){
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        tail = nuevoNodo;// se mueve e apauntador al ultimo nodo
        
        if(head == null){//La lista esat vacia, cerramos el primer nodo
            head = nuevoNodo;
            actual = head;
        }
        else{
            actual.setSiguiente(nuevoNodo);//actual apunta al nuevoNodo
        actual = nuevoNodo;//ahora actual es el nuevoNodo
        }
        
    }
    public void add(T dato, int posicion){
        Nodo nuevoNodo = new Nodo(dato);
        int i = 1;
        actual = head;
        while (i < posicion - 1){
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    public void printList(){
        int posicion = 1;
        actual = head;
        while (actual != null){
            T elemento = (T) actual.getDato();
            System.out.println("Dato = " + elemento + "almacenado en nodo: " + posicion);
            actual = actual.getSiguiente();
            posicion++;
        }
    }
}
