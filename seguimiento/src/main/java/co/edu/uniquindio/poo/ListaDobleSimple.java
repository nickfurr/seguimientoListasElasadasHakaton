package co.edu.uniquindio.poo;

public class ListaDobleSimple<T extends Comparable> {
    
    NodoDobleEnlazado<T> primero;
    NodoDobleEnlazado<T> ultimo;
    int tamaño;


    public ListaDobleSimple(){
        tamaño = 0;
        primero = null;
        ultimo = null;
    }

    public void agregarInicio(T elem){
        
        NodoDobleEnlazado<T> newNodo = new NodoDobleEnlazado<>(elem);

        if (primero == null) {
            primero = newNodo;
            tamaño ++;

        }else{
            primero.setAnterior(newNodo); 
            primero = newNodo;
        }
   }
   //agregarFinal
   public void agregarFinal(T elem){

        NodoDobleEnlazado<T> next = new NodoDobleEnlazado<>(elem);
        
       if (primero == null) {
            primero = next;
            tamaño ++;
       }else{

        NodoDobleEnlazado<T> buff = primero;
        int contador = 0;
        while (tamaño > contador) {
            buff = buff.getSiguiente();
            contador++;
        }
            buff.setSiguiente(next);
            tamaño++;
       }
   }

   public void agregarIndice(int indice, T valor){
    NodoDobleEnlazado<T> newNodo = new NodoDobleEnlazado<>(valor);
    int contador = 0;
    NodoDobleEnlazado<T> buff = primero;

    while (contador < indice) {
        buff = buff.getSiguiente();
        contador++;
    }
    NodoDobleEnlazado<T> buffer = buff.getSiguiente();
    buff.setSiguiente(newNodo);
    newNodo.setSiguiente(buffer);
   }

  
   

}
