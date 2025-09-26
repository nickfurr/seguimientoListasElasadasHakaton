package co.edu.uniquindio.poo;

public class NodoDobleEnlazado <T extends Comparable>{
    T valor;
    NodoDobleEnlazado anterior;
    NodoDobleEnlazado siguiente;

    public NodoDobleEnlazado(T dato) {
        this.valor = dato;
        siguiente = null;// iniialmente
        anterior = null;// 
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoDobleEnlazado getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleEnlazado anterior) {
        this.anterior = anterior;
    }

    public NodoDobleEnlazado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleEnlazado siguiente) {
        this.siguiente = siguiente;
    }

    
}
