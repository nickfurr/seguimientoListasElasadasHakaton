package co.edu.uniquindio.poo;

import java.util.Iterator;

public class LIstaSimpleEnlazadaCircular <T extends Comparable> {
    private Nodo primero; 
    private int tam;
    
    
    public LIstaSimpleEnlazadaCircular() {
        this.primero = null;
        this.tam = 0;
        

    }

    // insertarNatural
    public void agregarInicio(T elem){
        
        Nodo<T> newNodo = new Nodo(elem);

        if (primero == null) {
            primero = newNodo;
            tam ++;

        }else{
            
            Nodo<T> buff = primero;

            while (buff.getProximo() != null) {
                buff = buff.getProximo();
            }
                buff.setProximo(primero);
    
            newNodo.setProximo(primero);
            primero = newNodo;
            tam ++;

        }
   }
   //agregarFinal
   public void agregarFinal(T elem){

        Nodo<T> next = new Nodo<>(elem);
        
       if (primero == null) {
            primero = next;
            tam ++;
       }else{

        Nodo<T> buff = primero;

        while (buff.getProximo() != null) {
            buff = buff.getProximo();
        }
            buff.setProximo(next);
            next.setProximo(primero);
            tam++;
       }
   }

    public <T> void mostrar(){
        Nodo buffer = primero;
        String mensage= "";

        int contador = 0;

        while (contador < tam) {
            mensage += buffer.getDato();
            System.out.println(buffer.getDato());
            buffer = buffer.getProximo();
            contador ++;
        }

        System.out.println(mensage);
    }
    //agregarIndice
    public void agregarIndice(int indice, T valor){
        Nodo<T> valorN = new Nodo<>(valor);

        int contador = 0;

        Nodo<T> bufferNodo = primero;
        Nodo<T> noseComoLLamarlo = null;
        while (contador != indice-1) {
            bufferNodo = bufferNodo.getProximo();
            contador ++;
        }
        noseComoLLamarlo = bufferNodo.getProximo();
        bufferNodo.setProximo(valorN);
        valorN.setProximo(noseComoLLamarlo);
        tam ++;
        
   }

   
    public boolean eliminar(T datoBusqueda){
        Nodo primeroBuff = primero;
        if (primero == null) return false;

        if (primeroBuff.getDato().equals(datoBusqueda)) {
            primero = primeroBuff.getProximo();
            tam--;
            return true;
        }else{

            while(primeroBuff.getProximo() != null){
                if(primeroBuff.getProximo().getDato().equals(datoBusqueda)){
                    primeroBuff.setProximo(primeroBuff.getProximo().getProximo());
                    tam--;
                    return true;
                }
                primeroBuff = primeroBuff.getProximo();
            }
        }
        return false;
    }

    public void insertarNaturalOld(T elem){
        Nodo<T> nuevo = new Nodo<>(elem);

        // caso vacio
        if (primero == null) {
            primero = nuevo;
            tam ++;
        }

        //caso un solo elemento
        if (primero.getProximo() == null) {
            int comparacion = primero.getDato().compareTo(nuevo.getDato());
            if (comparacion<0) {
                agregarInicio(elem);
                tam ++;
            } else {
                agregarFinal(elem);
                tam ++;
            }
        }
        // caso donde hay varios
        else{
            Nodo<T> primeroBufer = primero;
            Nodo<T> anterior = null;
            
            while (primeroBufer.getProximo() != null ) {
                if (primeroBufer.getDato().compareTo(nuevo.getDato()) < 0) {
                    if(anterior == null){
                        Nodo buffer = primero;
                        primero = nuevo;
                        primero.setProximo(buffer);
                        tam ++;
                        return;
                    }
                    anterior.setProximo(nuevo);
                    nuevo.setProximo(primeroBufer);
                    tam ++;
                    return;
                } 
                anterior = primeroBufer;
                primeroBufer = primeroBufer.getProximo();
            }
            primeroBufer.setProximo(nuevo);
        }
    }
    
    public int localizar(T elem){
        Nodo partidaBuffer = primero;
        int indice = 0;
        while (partidaBuffer.getProximo() != null) {
            if(partidaBuffer.getProximo().equals(elem)){
                return indice;
            }
            indice ++;
            partidaBuffer = partidaBuffer.getProximo();
        }
        return indice;
    }

    public boolean contains(T elem){
        boolean confirmacion = false;
        Nodo primeroBuffer = primero;
        while (primeroBuffer.getProximo() != null) {
            if(primeroBuffer.getDato().equals(elem)){
                confirmacion = true;
            }
            primeroBuffer = primeroBuffer.getProximo();
        }
        return confirmacion;
    }

    public int tamaño(){
        return tam;
    }
    
    public T obtenerIndice(int i){
        int indice = 0;
        Nodo<T> primeroBuff = primero;
        while (primeroBuff.getProximo() != null) {
            if (indice == i) {
                return primeroBuff.getDato();
            }
            primeroBuff = primeroBuff.getProximo();
            indice ++;
        }
        if (primeroBuff.getProximo() == null) {
            return primeroBuff.getDato();
        }
        return null;
    }
    
}
