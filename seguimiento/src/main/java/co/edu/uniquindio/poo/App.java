package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        LIstaSimpleEnlazadaCircular listaCircular = new LIstaSimpleEnlazadaCircular<>();
        listaCircular.agregarFinal(1);
        listaCircular.agregarFinal(2);
        listaCircular.agregarFinal(3);
        listaCircular.agregarFinal(4);
        listaCircular.mostrar();
    }
}
