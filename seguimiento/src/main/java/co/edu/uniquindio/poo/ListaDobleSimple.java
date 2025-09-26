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
        
        Nodo<T> newNodo = new Nodo(elem);

        if (primero == null) {
            primero = newNodo;
            tam ++;

        }else{
            
            newNodo.setProximo(primero);
            primero = newNodo;
            tam ++;

        }
   }
   //agregarFinal
   public void agregarFinal(T elem){

        
   }

    public <T> void mostrar(){
        Nodo buffer = primero;
        String mensage= "";

        while (buffer != null) {
            mensage += buffer.getDato();
            System.out.println(buffer.getDato());
            buffer = buffer.getProximo();
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

}
