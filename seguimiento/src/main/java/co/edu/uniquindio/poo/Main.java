package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        ListaDobleSimple<Integer> lista = new ListaDobleSimple<>();

        System.out.println("---> Prueba agregarInicio ");
        lista.agregarInicio(10);
        lista.agregarInicio(20);
        lista.agregarInicio(30);
        lista.imprimirLista();  

        System.out.println("----- Prueba agregarfinal-------");
        lista.agregarFinal(40);
        lista.agregarFinal(50);
        lista.imprimirLista(); 

        System.out.println("B===D Prueba agregar indice ");
        lista.agregarIndice(2, 25);
        lista.imprimirLista(); 

        lista.agregarIndice(0, 35);
        lista.imprimirLista();  

        lista.agregarIndice(lista.getTamaño(), 60);
        lista.imprimirLista();  

        System.out.println("*** Prueba eliminar indice **");
        lista.eliminarIndice(2);  
        lista.imprimirLista();    

        lista.eliminarIndice(0);  
        lista.imprimirLista();  

        lista.eliminarIndice(lista.getTamaño() - 1);  
        lista.imprimirLista();    

        System.out.println("=== Prueba agregarOrdenado ===");
        ListaDobleSimple<Integer> listaOrdenada = new ListaDobleSimple<>();
        listaOrdenada.agregarOrdenado(30);
        listaOrdenada.agregarOrdenado(10);
        listaOrdenada.agregarOrdenado(20);
        listaOrdenada.agregarOrdenado(40);
        listaOrdenada.agregarOrdenado(25);
        listaOrdenada.imprimirLista();  

        System.out.println("=== Tamaños finales ===");
        System.out.println("Tamaño lista principal: " + lista.getTamaño());     
        System.out.println("Tamaño lista ordenada: " + listaOrdenada.getTamaño());
    }
}
