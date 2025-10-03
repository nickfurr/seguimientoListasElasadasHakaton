package co.edu.uniquindio.poo;

public class LIstaSimpleEnlazadaCircular<T extends Comparable<T>> {
    private Nodo<T> primero; 
    private int tam;

    public LIstaSimpleEnlazadaCircular() {
        this.primero = null;
        this.tam = 0;
    }

    public void agregarInicio(T elem){
        Nodo<T> newNodo = new Nodo<>(elem);
        if (primero == null) {
            primero = newNodo;
            newNodo.setProximo(primero);
        } else {
            Nodo<T> buff = primero;
            while (buff.getProximo() != primero) {
                buff = buff.getProximo();
            }
            newNodo.setProximo(primero);
            buff.setProximo(newNodo);
            primero = newNodo;
        }
        tam++;
    }

    public void agregarFinal(T elem){
        Nodo<T> next = new Nodo<>(elem);
        if (primero == null) {
            primero = next;
            next.setProximo(primero);
        } else {
            Nodo<T> buff = primero;
            while (buff.getProximo() != primero) {
                buff = buff.getProximo();
            }
            buff.setProximo(next);
            next.setProximo(primero);
        }
        tam++;
    }

    public void mostrar(){
        if (primero == null) {
            System.out.println();
            return;
        }
        Nodo<T> buffer = primero;
        String mensaje = "";
        int contador = 0;
        do {
            mensaje += buffer.getDato() + " ";
            buffer = buffer.getProximo();
            contador++;
        } while (buffer != primero && contador < tam);
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
        Nodo<T> actual = primero;
        Nodo<T> anterior = null;
        int contador = 0;
        do {
            if (actual.getDato().equals(datoBusqueda)) {
                if (anterior == null) { // eliminar primero
                    Nodo<T> ultimo = primero;
                    while (ultimo.getProximo() != primero) {
                        ultimo = ultimo.getProximo();
                    }
                    if (primero == primero.getProximo()) { // solo uno
                        primero = null;
                    } else {
                        primero = actual.getProximo();
                        ultimo.setProximo(primero);
                    }
                } else {
                    anterior.setProximo(actual.getProximo());
                }
                tam--;
                return true;
            }
            anterior = actual;
            actual = actual.getProximo();
            contador++;
        } while (actual != primero && contador < tam);
        return false;
    }

    public void insertarNaturalOld(T elem){
        Nodo<T> nuevo = new Nodo<>(elem);
        if (primero == null) {
            primero = nuevo;
            nuevo.setProximo(primero);
            tam++;
            return;
        }
        Nodo<T> actual = primero;
        Nodo<T> anterior = null;
        int contador = 0;
        do {
            if (actual.getDato().compareTo(nuevo.getDato()) > 0) {
                if (anterior == null) {
                    agregarInicio(elem);
                } else {
                    anterior.setProximo(nuevo);
                    nuevo.setProximo(actual);
                    tam++;
                }
                return;
            }
            anterior = actual;
            actual = actual.getProximo();
            contador++;
        } while (actual != primero && contador < tam);
        // insertar al final
        agregarFinal(elem);
    }

    public int localizar(T elem){
        Nodo<T> buffer = primero;
        int indice = 0;
        int contador = 0;
        do {
            if (buffer.getDato().equals(elem)) {
                return indice;
            }
            buffer = buffer.getProximo();
            indice++;
            contador++;
        } while (buffer != primero && contador < tam);
        return -1;
    }

    public boolean contains(T elem){
        Nodo<T> buffer = primero;
        int contador = 0;
        do {
            if (buffer.getDato().equals(elem)) {
                return true;
            }
            buffer = buffer.getProximo();
            contador++;
        } while (buffer != primero && contador < tam);
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

    public void ordenarAscendente() {
        if (primero == null || primero.getProximo() == primero) return;
        boolean swapped;
        do {
            swapped = false;
            Nodo<T> actual = primero;
            int contador = 0;
            do {
                Nodo<T> siguiente = actual.getProximo();
                if (siguiente != primero && actual.getDato().compareTo(siguiente.getDato()) > 0) {
                    T temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                    swapped = true;
                }
                actual = actual.getProximo();
                contador++;
            } while (actual != primero && contador < tam);
        } while (swapped);
    }

    public void insertarPorValor(T valor) {
        insertarNaturalOld(valor);
    }

    
}
