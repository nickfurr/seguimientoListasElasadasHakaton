package co.edu.uniquindio.poo;

import java.util.Iterator;

public class ListaSimpleEnlazada<T extends Comparable<T>> implements Iterable<T> {

    protected Nodo<T> primero; 
    private int tam;

    public ListaSimpleEnlazada() {
        this.primero = null;
        this.tam = 0;
    }

    public void agregarInicio(T elem){
        Nodo<T> newNodo = new Nodo<>(elem);
        newNodo.setProximo(primero);
        primero = newNodo;
        tam++;
    }

    public void agregarFinal(T elem){
        Nodo<T> next = new Nodo<>(elem);
        if (primero == null) {
            primero = next;
        } else {
            Nodo<T> buff = primero;
            while (buff.getProximo() != null) {
                buff = buff.getProximo();
            }
            buff.setProximo(next);
        }
        tam++;
    }

    public void mostrar(){
        Nodo<T> buffer = primero;
        String mensaje = "";
        while (buffer != null) {
            mensaje += buffer.getDato() + " ";
            buffer = buffer.getProximo();
        }
        System.out.println(mensaje.trim());
    }

    public void agregarIndice(int indice, T valor){
        if (indice < 0 || indice > tam) throw new IndexOutOfBoundsException();
        Nodo<T> valorN = new Nodo<>(valor);
        if (indice == 0) {
            agregarInicio(valor);
            return;
        }
        Nodo<T> bufferNodo = primero;
        for (int i = 0; i < indice - 1; i++) {
            bufferNodo = bufferNodo.getProximo();
        }
        valorN.setProximo(bufferNodo.getProximo());
        bufferNodo.setProximo(valorN);
        tam++;
    }

    public boolean eliminar(T datoBusqueda){
        if (primero == null) return false;
        if (primero.getDato().equals(datoBusqueda)) {
            primero = primero.getProximo();
            tam--;
            return true;
        }
        Nodo<T> actual = primero;
        while (actual.getProximo() != null) {
            if (actual.getProximo().getDato().equals(datoBusqueda)) {
                actual.setProximo(actual.getProximo().getProximo());
                tam--;
                return true;
            }
            actual = actual.getProximo();
        }
        return false;
    }

    public void insertarNaturalOld(T elem){
        Nodo<T> nuevo = new Nodo<>(elem);
        if (primero == null) {
            primero = nuevo;
            tam++;
            return;
        }
        if (primero.getProximo() == null) {
            int comparacion = primero.getDato().compareTo(nuevo.getDato());
            if (comparacion > 0) {
                nuevo.setProximo(primero);
                primero = nuevo;
            } else {
                primero.setProximo(nuevo);
            }
            tam++;
            return;
        }
        Nodo<T> actual = primero;
        Nodo<T> anterior = null;
        while (actual != null && actual.getDato().compareTo(nuevo.getDato()) < 0) {
            anterior = actual;
            actual = actual.getProximo();
        }
        if (anterior == null) {
            nuevo.setProximo(primero);
            primero = nuevo;
        } else {
            anterior.setProximo(nuevo);
            nuevo.setProximo(actual);
        }
        tam++;
    }

    public int localizar(T elem){
        Nodo<T> buffer = primero;
        int indice = 0;
        while (buffer != null) {
            if (buffer.getDato().equals(elem)) {
                return indice;
            }
            buffer = buffer.getProximo();
            indice++;
        }
        return -1;
    }

    public boolean contains(T elem){
        Nodo<T> buffer = primero;
        while (buffer != null) {
            if (buffer.getDato().equals(elem)) {
                return true;
            }
            buffer = buffer.getProximo();
        }
        return false;
    }

    public int tamaño(){
        return tam;
    }

    public T obtenerIndice(int i){
        if (i < 0 || i >= tam) throw new IndexOutOfBoundsException();
        Nodo<T> buffer = primero;
        for (int idx = 0; idx < i; idx++) {
            buffer = buffer.getProximo();
        }
        return buffer.getDato();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaSimpleEnlazadaIterator<>(this);
    }

    public void ordenarAscendente() {
        if (primero == null || primero.getProximo() == null) return;
        boolean swapped;
        do {
            swapped = false;
            Nodo<T> actual = primero;
            while (actual.getProximo() != null) {
                if (actual.getDato().compareTo(actual.getProximo().getDato()) > 0) {
                    T temp = actual.getDato();
                    actual.setDato(actual.getProximo().getDato());
                    actual.getProximo().setDato(temp);
                    swapped = true;
                }
                actual = actual.getProximo();
            }
        } while (swapped);
    }

    public void insertarPorValor(T valor) {
        insertarNaturalOld(valor);
    }

    
}
