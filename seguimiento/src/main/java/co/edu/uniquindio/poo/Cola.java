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

    // Enqueue: agregar al final
    public void encolar(T elem) {
        Nodo<T> nuevo = new Nodo<>(elem);
        if (ultimo == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setProximo(nuevo);
            ultimo = nuevo;
        }
        tam++;
    }

    // Dequeue: eliminar del inicio
    public T desencolar() {
        if (primero == null) return null;
        T dato = primero.getDato();
        primero = primero.getProximo();
        if (primero == null) ultimo = null;
        tam--;
        return dato;
    }

    // Peek: ver el primero sin eliminar
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
