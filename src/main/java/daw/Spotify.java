/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author FX506
 */
public class Spotify {

    public static void main(String[] args) {

        //Creación de listas musicales
        ListaReproduccion listaReproduccion1 = new ListaReproduccion();
        ListaReproduccion listaReproduccion2 = new ListaReproduccion();
        ListaReproduccion listaReproduccion3 = new ListaReproduccion();

        //Creación de elementos para las listas
        Cancion c1 = new Cancion("Me muero", "Yo ahora mismo",
                "La vida", "Country", 180);
        Cancion c2 = new Cancion("Hasta nunca", "Noelia",
                "14:45", "Pop", 150);
        Cancion c3 = new Cancion("Está dura la cosa", "Varios artistas",
                "", "Rock indie", 210);
        Cancion c4 = new Cancion("Perro salchicha gordo bachicha",
                "María Elena Walsh", "Desconocido", "", 120);
        Cancion c5 = new Cancion("Que frío", "Ariana Pequeña",
                "Enero", "Pop", 180);
        Cancion c6 = new Cancion("En llamas", "Moj*n",
                "Caminando", "R&B", 180);

        //Añadir elementos a la lista 1
        listaReproduccion1.guardarElemento(c1);
        listaReproduccion1.guardarElemento(c2);
        listaReproduccion1.guardarElemento(c3);

        //Añadir elementos a la lista 2
        listaReproduccion2.guardarElemento(c4);
        listaReproduccion2.guardarElemento(c5);

        //Mostrar por consola las listas 1 y 2
        System.out.println("-------------------Lista 1---------------------");
        listaReproduccion1.imprimirLista();

        System.out.println("-------------------Lista 2---------------------");
        listaReproduccion2.imprimirLista();

        //Comprobar si las listas contienen elementos
        System.out.println("Está vacía la lista 1? " + listaReproduccion1.estaVacio());
        System.out.println("Está vacía la lista 2? " + listaReproduccion2.estaVacio());
        System.out.println("Está vacía la lista 3? " + listaReproduccion3.estaVacio());

        //Comprobar número de elementos
        System.out.println("Numero elementos lista 1: " + listaReproduccion1.numeroElementos());
        System.out.println("Numero elementos lista 2: " + listaReproduccion2.numeroElementos());
        System.out.println("Numero elementos lista 3: " + listaReproduccion3.numeroElementos());

        //Ver elemento por posición
        System.out.println("Elemento 2 lista 1: " + listaReproduccion1.verElemento(2));
        System.out.println("Elemento 0 lista 2: " + listaReproduccion2.verElemento(1));

        //Cambiar elemento por uno nuevo
        listaReproduccion1.cambiarElemento(2, c6);
        System.out.println("Nuevo elemento 2 lista 1: " + listaReproduccion1.verElemento(2));

        //Eliminar elemento por posicion
        listaReproduccion1.eliminarElemento(2);

        //Eliminar elemento si existe en la lista
        listaReproduccion1.eliminarElemento(c1);

        System.out.println("-----------Lista 1 sin elemento c1 ni c3-------");
        listaReproduccion1.imprimirLista();

        //Vuelvo a añadir los elementos borrados a la lista 1
        //Aunque tendrán distinto orden que antes (c2, c1, c3)
        listaReproduccion1.guardarElemento(c1);
        listaReproduccion1.guardarElemento(c3);
        System.out.println("-------------------Lista 1---------------------");
        listaReproduccion1.imprimirLista();

        //Eliminar elementos de la lista 1 en base a otra lista
        //que contiene los elementos que quiero borrar.
        ArrayList<Cancion> listaElementosEliminables = new ArrayList<>();
        listaElementosEliminables.add(c2);
        listaElementosEliminables.add(c3);

        listaReproduccion1.eliminarElementos(listaElementosEliminables);

        System.out.println("---------Lista 1 sin elementos c2 y c3---------");
        listaReproduccion1.imprimirLista();

        //Vuelvo a añadir los elementos borrados a la lista 1
        listaReproduccion1.guardarElemento(c2);
        listaReproduccion1.guardarElemento(c3);
        System.out.println("-------------------Lista 1---------------------");
        listaReproduccion1.imprimirLista();

        //Eliminar todos los elementos de la lista 1
        listaReproduccion1.eliminarTodos();
        System.out.println("Está vacía la lista 1? " + listaReproduccion1.estaVacio());

        //Buscar un elemento con index of
        System.out.println("-------------------Lista 2---------------------");
        listaReproduccion2.imprimirLista();
        System.out.println("El índice del elemento c5 en la lista 2 es: "
                + listaReproduccion2.buscarElemento(c5));
        
        //Añado todos los elementos disponibles a la lista 3
        listaReproduccion3.guardarElemento(c1);
        listaReproduccion3.guardarElemento(c2);
        listaReproduccion3.guardarElemento(c3);
        listaReproduccion3.guardarElemento(c4);
        listaReproduccion3.guardarElemento(c5);
        listaReproduccion3.guardarElemento(c6);
        System.out.println("-------------------Lista 3---------------------");
        listaReproduccion3.imprimirLista();
        
        //Ordenar por título la lista 3
        listaReproduccion3.ordenarTitulo();
        System.out.println("---------Lista 3 ordenada por título-----------");
        listaReproduccion3.imprimirLista();
        
        //Odenar por duración la lista 3
        listaReproduccion3.ordenarDuracion();
        System.out.println("---------Lista 3 ordenada por intérprete-------");
        listaReproduccion3.imprimirLista();
        
        //Odenar por título e interprete la lista 3
        listaReproduccion3.ordenarTituloInterprete();
        System.out.println("---Lista 3 ordenada por título e intérpre------");
        listaReproduccion3.imprimirLista();
        
        //Buscar elemento con binary search
        System.out.println("El índice del elemento c5 en la lista 3 es: "
                + listaReproduccion3.buscarElemento(c5));
        
        
    }
}
