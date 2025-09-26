package co.edu.uniquindio.poo;

public class Nodo <T extends Comparable> {
    private T dato;
    private Nodo<T> proximo;// referencia al siguiente elemento
    

    public Nodo(T dato) {
        this.dato = dato;
        proximo = null;// iniialmente
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    

    
}