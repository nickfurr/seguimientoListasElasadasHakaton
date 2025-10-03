package co.edu.uniquindio.poo;

public class Pila <T extends Comparable>  {
    private Nodo cima; 
    private int tam;
    
    public Pila(){
        super();
    }
    
    
     public void apilar_(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setProximo(cima);
        cima = nuevo;
        tam ++;
     }

   // public T desapilar(){
        //T dato = cima.getDato();
        //cima = cima.getProximo();
        //return dato;
        //tam --;
   // }


     
    




}
