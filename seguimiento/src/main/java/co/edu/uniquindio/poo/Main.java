package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
      /* 
        ListaSimpleEnlazada<Integer> listaSimple = new ListaSimpleEnlazada<>();
        listaSimple.agregarFinal(5);
        listaSimple.agregarFinal(2);
        listaSimple.agregarFinal(8);
        listaSimple.agregarFinal(1);

        System.out.println("Lista simple original:");
        listaSimple.mostrar();

        listaSimple.ordenarAscendente();
        System.out.println("Lista simple ordenada:");
        listaSimple.mostrar();

        listaSimple.insertarPorValor(4);
        System.out.println("Lista simple tras insertar 4 ordenadamente:");
        listaSimple.mostrar();

    
        LIstaSimpleEnlazadaCircular<Integer> listaCircular = new LIstaSimpleEnlazadaCircular<>();
        listaCircular.agregarFinal(7);
        listaCircular.agregarFinal(3);
        listaCircular.agregarFinal(9);
        listaCircular.agregarFinal(2);

        System.out.println("Lista circular original:");
        listaCircular.mostrar();

        listaCircular.ordenarAscendente();
        System.out.println("Lista circular ordenada:");
        listaCircular.mostrar();

        listaCircular.insertarPorValor(5);
        System.out.println("Lista circular tras insertar 5 ordenadamente:");
        listaCircular.mostrar();

        /*
         * ista simple original:
5 2 8 1
Lista simple ordenada:
1 2 5 8
Lista simple tras insertar 4 ordenadamente:
1 2 4 5 8
Lista circular original:
7 3 9 2
Lista circular ordenada:
2 3 7 9
Lista circular tras insertar 5 ordenadamente:
2 3 5 7 9
         */
        // la salida   gracas creo q ahora si xd 

        ListaDobleCircCliente listaDobleCircCliente = new ListaDobleCircCliente();
        listaDobleCircCliente.ejecutar();
        
    }
}
