package co.edu.uniquindio.poo;


import java.util.Iterator;

public class ListaSimpleEnlazadaIterator <T extends Comparable> implements Iterator<T> {
    private ListaSimpleEnlazada<T> lista;
    private int tamaño;
    private int indice;

    public ListaSimpleEnlazadaIterator(ListaSimpleEnlazada lista){
        this.lista = lista;
        this.tamaño = lista.tamaño();
        indice = 0;
    }
    @Override
    public boolean hasNext() {
        return indice<tamaño;
    }

    @Override
    public T next() {
        T valor = lista.obtenerIndice(indice);
        indice ++;
        return valor;
    }

}
