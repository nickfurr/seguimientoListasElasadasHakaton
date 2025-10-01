package co.edu.uniquindio.poo;
// agregar al inicio,  quitar al final, lo que hay que hacer

public class BiCola<T extends Comparable>{
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tam;

    public BiCola() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }



    // Método para agregar al final(encolar)
    public void agregarFinal(T elem) {
        Nodo<T> nuevo = new Nodo<>(elem);
        if (ultimo == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setProximo(nuevo);
            ultimo = nuevo;
        }
        tam++;
    }

    // Método para quitar del inicio (desencolar)
    public T quitarInicio() {
        if (primero == null) return null;
        T dato = primero.getDato();
        primero = primero.getProximo();
        if (primero == null) {
            ultimo = null;
        }
        tam--;
        return dato;
    }

    // Método para quitar del final
    public T quitarFinal() {
        if (ultimo == null) return null;
        T dato = ultimo.getDato();
        if (primero == ultimo) {
            primero = ultimo = null;
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != ultimo) {
                actual = actual.getProximo();
            }
            actual.setProximo(null);
            ultimo = actual;
        }
        tam--;
        return dato;
    }

        // Método para agregar al inicio
    public void agregarInicio(T elem) {
        Nodo<T> nuevo = new Nodo<>(elem);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero = nuevo;
        }
        tam++;
    }

    public int size() {
        return tam;
    }

    public boolean isEmpty() {
        return tam == 0;
    }
}