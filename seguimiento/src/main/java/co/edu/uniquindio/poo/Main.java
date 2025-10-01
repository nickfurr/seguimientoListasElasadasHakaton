package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        // Encolar elementos
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Elemento al frente de la cola: " + cola.peek()); // Debería imprimir 10

        // Desencolar elementos
        System.out.println("Desencolado: " + cola.desencolar()); // Debería imprimir 10
        System.out.println("Desencolado: " + cola.desencolar()); // Debería imprimir 20

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? " + cola.estaVacia()); // Debería imprimir false

        // Tamaño de la cola
        System.out.println("Tamaño de la cola: " + cola.tamaño()); // Debería imprimir 1

        // Desencolar el último elemento
        System.out.println("Desencolado: " + cola.desencolar()); // Debería imprimir 30
        System.out.println("¿La cola está vacía? " + cola.estaVacia()); // Debería imprimir true
    }
}
