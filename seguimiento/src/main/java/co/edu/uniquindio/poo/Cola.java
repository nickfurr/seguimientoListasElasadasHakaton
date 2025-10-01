package co.edu.uniquindio.poo;

public class Cola<T extends Comparable> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tam;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void encolar(T elem) {
        Nodo<T> nuevo = new Nodo<>(elem);
        if (ultimo == null) {
            primero = ultimo = nuevo;
        } 
        ultimo.setProximo(nuevo);
        ultimo = nuevo;
        tam++;
    }
   
    public T desencolar() {
        if (primero == null) return null;
        T dato = primero.getDato();
        primero = primero.getProximo();
        if (primero == null) ultimo = null;
        tam--;
        return dato;
    }

    public T peek() {
        return (primero != null) ? primero.getDato() : null;
    }

    public boolean estaVacia() {
        return tam == 0;
    }

    public int tamaño() {
        return tam;
    }
}
