package co.edu.uniquindio.poo;

public class NodoDobleEnlazado<T extends Comparable<T>> {
    private T valor;
    private NodoDobleEnlazado<T> anterior;
    private NodoDobleEnlazado<T> siguiente;

    public NodoDobleEnlazado(T dato) {
        this.valor = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoDobleEnlazado<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleEnlazado<T> anterior) {
        this.anterior = anterior;
    }

    public NodoDobleEnlazado<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleEnlazado<T> siguiente) {
        this.siguiente = siguiente;
    }
}
