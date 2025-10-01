package co.edu.uniquindio.poo;

public class ListaDobleSimple<T extends Comparable<T>> {
    
    private NodoDobleEnlazado<T> primero;
    private NodoDobleEnlazado<T> ultimo;
    private int tamaño;

    public ListaDobleSimple(){
        tamaño = 0;
        primero = null;
        ultimo = null;
    }

    public void agregarInicio(T elem){
        NodoDobleEnlazado<T> newNodo = new NodoDobleEnlazado<>(elem);

        if (primero == null) {
            primero = newNodo;
            ultimo = newNodo;
        } else {
            newNodo.setSiguiente(primero);
            primero.setAnterior(newNodo);
            primero = newNodo;
        }
        tamaño++;
    }

    public void agregarFinal(T elem){
        NodoDobleEnlazado<T> newNodo = new NodoDobleEnlazado<>(elem);

        if (primero == null) {
            primero = newNodo;
            ultimo = newNodo;
        } else {
            ultimo.setSiguiente(newNodo);
            newNodo.setAnterior(ultimo);
            ultimo = newNodo;
        }
        tamaño++;
    }

    public void agregarIndice(int indice, T valor){
        if (indice < 0 || indice > tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        if (indice == 0) {
            agregarInicio(valor);
            return;
        }

        if (indice == tamaño) {
            agregarFinal(valor);
            return;
        }

        NodoDobleEnlazado<T> newNodo = new NodoDobleEnlazado<>(valor);
        NodoDobleEnlazado<T> actual = primero;

        for (int i = 0; i < indice - 1; i++) {
            actual = actual.getSiguiente();
        }

        NodoDobleEnlazado<T> siguiente = actual.getSiguiente();

        actual.setSiguiente(newNodo);
        newNodo.setAnterior(actual);

        newNodo.setSiguiente(siguiente);
        siguiente.setAnterior(newNodo);

        tamaño++;
    }

    
    public int getTamaño() {
        return tamaño;
    }

    public void imprimirLista() {
        NodoDobleEnlazado<T> actual = primero;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public void eliminarIndice(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        if (tamaño == 0) {
            return; 
        }

        if (indice == 0) {
            // Eliminar el primer nodo
            if (primero == ultimo) {
               
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSiguiente();
                primero.setAnterior(null);
            }
        } else if (indice == tamaño - 1) {
            
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
        } else {
            
            NodoDobleEnlazado<T> actual = primero;
            for (int i = 0; i < indice; i++) {
                actual = actual.getSiguiente();
            }
            NodoDobleEnlazado<T> anterior = actual.getAnterior();
            NodoDobleEnlazado<T> siguiente = actual.getSiguiente();

            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);
        }

        tamaño--;
    }

    public void agregarOrdenado(T elem) {
        NodoDobleEnlazado<T> newNodo = new NodoDobleEnlazado<>(elem);

        if (primero == null) {
            
            primero = newNodo;
            ultimo = newNodo;
        } else if (elem.compareTo(primero.getValor()) <= 0) {
            
            newNodo.setSiguiente(primero);
            primero.setAnterior(newNodo);
            primero = newNodo;
        } else if (elem.compareTo(ultimo.getValor()) >= 0) {
           
            ultimo.setSiguiente(newNodo);
            newNodo.setAnterior(ultimo);
            ultimo = newNodo;
        } else {
            
            NodoDobleEnlazado<T> actual = primero.getSiguiente();

            while (actual != null && elem.compareTo(actual.getValor()) > 0) {
                actual = actual.getSiguiente();
            }

            
            NodoDobleEnlazado<T> anterior = actual.getAnterior();

            anterior.setSiguiente(newNodo);
            newNodo.setAnterior(anterior);

            newNodo.setSiguiente(actual);
            actual.setAnterior(newNodo);
        }

        tamaño++;
    }


}
