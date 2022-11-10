/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listaligada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author herna
 */
public class TestingListaLigada {
    
    public static void main(String[]args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
        
        ListaLigada lista = new ListaLigada();
        
        while (true){//Ciclo infinito      
        System.out.println("Escribe un dato entero");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("?Quieres agregar mas datos? (s/n): ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if( respuesta == 'n' || respuesta == 'N')
                break;
        }
        
        System.out.println("--------------------------------------");
        System.out.println("COntenido de la lista ligada");
        lista.printList();
        
        /*
        System.out.println("--------------------------------------");
        System.out.println("Insercion de un nuevo nodo");
        System.out.println("Escribe el elemento a insertar");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        System.out.println("Escriba la posicion en donde quieres insertar");
        entrada= bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(dato,p);
        
        System.out.println("--------------");
        System.out.println("Cotenido de la lista ligada :  ");
        lista.printList();
*/
        
        //Otra lista ligada, ahora almacena String
        ListaLigada <String> lista2 = new ListaLigada<>();
        System.out.println("-----Creando una lista de String-----");
        for(;;){
            System.out.println("Escriba dato DString para agregar a la lista");
            entrada = bufer.readLine();
            lista2.add(entrada);
            System.out.println("Quieres insertar mas datos?");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if (respuesta == 'n' || respuesta == 'N')
                break;
        }
        
        System.out.println("Contenido de la lista de String: ");
        lista2.printList();
        
    }
}