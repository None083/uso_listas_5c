/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author FX506
 */
public class ListaReproduccion {

    private ArrayList<Cancion> listaReproduccion;

    public ListaReproduccion() {
        this.listaReproduccion = new ArrayList<>();
    }

    public int numeroElementos() {
        return this.listaReproduccion.size();
    }

    public boolean estaVacio() {
        return this.listaReproduccion.isEmpty();
    }

    public Cancion verElemento(int posicion) {
        return this.listaReproduccion.get(posicion);
    }

    public void cambiarElemento(int posicion, Cancion c) {
        this.listaReproduccion.set(posicion, c);
    }

    public void guardarElemento(Cancion c) {
        this.listaReproduccion.add(c);
    }

    public void eliminarElemento(int posicion) {
        this.listaReproduccion.remove(posicion);
    }

    public void eliminarElemento(Cancion c) {
        this.listaReproduccion.remove(c);
    }

    public void eliminarElementos(ArrayList<Cancion> listaElementos) {
        for (Cancion c : listaElementos) {
            this.listaReproduccion.remove(c);
        }
    }

    public void eliminarTodos() {
        this.listaReproduccion.clear();
    }

    public void imprimirLista() {
        this.listaReproduccion.forEach(System.out::println);
    }

    public int buscarElemento(Cancion c) {
        return this.listaReproduccion.indexOf(c);
    }

    public void ordenarTitulo() {
        Collections.sort(this.listaReproduccion,
                (m1, m2) -> m1.getTitulo().compareToIgnoreCase(m2.getTitulo()));
    }

    public void ordenarDuracion() {
        Collections.sort(this.listaReproduccion,
                (m1, m2) -> Integer.compare(m1.getDuracion(), m2.getDuracion()));
    }

    public void ordenarTituloInterprete() {
        Comparator<Cancion> criterioTitulo
                = (m1, m2) -> m1.getTitulo().compareToIgnoreCase(m2.getTitulo());
        Comparator<Cancion> criterioInterprete
                = (m1, m2) -> m1.getInterprete().compareToIgnoreCase(m2.getInterprete());
        Comparator<Cancion> criterioTituloInterprete
                = criterioTitulo.thenComparing(criterioInterprete);

        Collections.sort(this.listaReproduccion, criterioTituloInterprete);
    }

    public int buscarElementoBinario(Cancion c) {
        return Collections.binarySearch(this.listaReproduccion,
                c,
                (e1, e2) -> e1.getInterprete().compareToIgnoreCase(e2.getInterprete()));
    }

}
