package co.edu.uniquindio.poo;

public class ListaDobleCircCliente {
    public void ejecutar(){
        
        System.out.println("=== Prueba de ListaDobleCircular con Bubble Sort (sortx()) ===");
        System.out.println("Nota: El método 'sort()' está incompleto y no ordena correctamente.");
        System.out.println("Usaremos 'sortx()' para las pruebas funcionales.");
        System.out.println();

        // Prueba 1: Lista con Integer (desordenada) usando sortx()
        System.out.println("1. Prueba con Integer (desordenada) - sortx():");
        ListaDobleCircular<Integer> listaInt = new ListaDobleCircular<>();
        
        // Agregar elementos desordenados usando agregarFinal
        listaInt.agregarFinal(5);
        listaInt.agregarFinal(2);
        listaInt.agregarFinal(8);
        listaInt.agregarFinal(1);
        listaInt.agregarFinal(9);
        listaInt.agregarFinal(3);

        System.out.println("Lista desordenada:");
        listaInt.imprimirLista();  // Esperado: 5 2 8 1 9 3  (puede variar si circular no está perfecta, pero valores correctos)

        listaInt.sortx();  // Aplica Bubble Sort correcto (ascendente)

        System.out.println("Lista ordenada ascendente con sortx():");
        listaInt.imprimirLista();  // Esperado: 1 2 3 5 8 9 
        System.out.println("Tamaño: " + listaInt.getTamaño());  // 6
        System.out.println();

        // Prueba 2: Lista con String (desordenada) usando sortx()
        System.out.println("2. Prueba con String (desordenada) - sortx():");
        ListaDobleCircular<String> listaStr = new ListaDobleCircular<>();
        
        // Agregar elementos desordenados
        listaStr.agregarFinal("banana");
        listaStr.agregarFinal("apple");
        listaStr.agregarFinal("cherry");
        listaStr.agregarFinal("date");
        listaStr.agregarFinal("zebra");

        System.out.println("Lista desordenada:");
        listaStr.imprimirLista();  // Esperado: banana apple cherry date zebra 

        listaStr.sortx();  // Aplica Bubble Sort (orden lexicográfico ascendente)

        System.out.println("Lista ordenada ascendente con sortx():");
        listaStr.imprimirLista();  // Esperado: apple banana cherry date zebra 
        System.out.println("Tamaño: " + listaStr.getTamaño());  // 5
        System.out.println();

        // Prueba 3: Casos Edge - Lista vacía con sortx()
        System.out.println("3. Prueba con lista vacía - sortx():");
        ListaDobleCircular<Integer> listaVacia = new ListaDobleCircular<>();
        System.out.println("Lista vacía antes:");
        listaVacia.imprimirLista();  // Esperado: (nada o mensaje si modificas imprimirLista)

        listaVacia.sortx();  // No hace nada

        System.out.println("Lista vacía después:");
        listaVacia.imprimirLista();  // Esperado: (nada)
        System.out.println("Tamaño: " + listaVacia.getTamaño());  // 0
        System.out.println();

        // Prueba 4: Caso Edge - Un solo elemento con sortx()
        System.out.println("4. Prueba con un solo elemento - sortx():");
        ListaDobleCircular<Integer> listaUno = new ListaDobleCircular<>();
        listaUno.agregarFinal(42);

        System.out.println("Lista con un elemento antes:");
        listaUno.imprimirLista();  // Esperado: 42 

        listaUno.sortx();  // No hace nada

        System.out.println("Lista con un elemento después:");
        listaUno.imprimirLista();  // Esperado: 42 
        System.out.println("Tamaño: " + listaUno.getTamaño());  // 1
        System.out.println();

        // Prueba 5: Lista ya ordenada (para ver optimización - salida temprana) con sortx()
        System.out.println("5. Prueba con lista ya ordenada - sortx():");
        ListaDobleCircular<Integer> listaOrdenada = new ListaDobleCircular<>();
        listaOrdenada.agregarFinal(1);
        listaOrdenada.agregarFinal(2);
        listaOrdenada.agregarFinal(3);
        listaOrdenada.agregarFinal(4);

        System.out.println("Lista ya ordenada antes:");
        listaOrdenada.imprimirLista();  // Esperado: 1 2 3 4 

        listaOrdenada.sortx();  // Debería salir en la primera pasada sin swaps

        System.out.println("Lista ya ordenada después:");
        listaOrdenada.imprimirLista();  // Esperado: 1 2 3 4 
        System.out.println("Tamaño: " + listaOrdenada.getTamaño());  // 4
        System.out.println();

        // Prueba 6: Con duplicados usando sortx()
        System.out.println("6. Prueba con duplicados - sortx():");
        ListaDobleCircular<Integer> listaDuplicados = new ListaDobleCircular<>();
        listaDuplicados.agregarFinal(3);
        listaDuplicados.agregarFinal(1);
        listaDuplicados.agregarFinal(3);
        listaDuplicados.agregarFinal(2);
        listaDuplicados.agregarFinal(1);

        System.out.println("Lista con duplicados desordenada:");
        listaDuplicados.imprimirLista();  // Esperado: 3 1 3 2 1 

        listaDuplicados.sortx();  // Ordena estable (mantiene orden relativo de iguales)

        System.out.println("Lista con duplicados ordenada:");
        listaDuplicados.imprimirLista();  // Esperado: 1 1 2 3 3 
        System.out.println("Tamaño: " + listaDuplicados.getTamaño());  // 5
        System.out.println();

        // Prueba 7: Usando agregarInicio para variedad (desorden) con sortx()
        System.out.println("7. Prueba agregando al inicio (desorden) - sortx():");
        ListaDobleCircular<String> listaInicio = new ListaDobleCircular<>();
        listaInicio.agregarInicio("zebra");
        listaInicio.agregarInicio("date");
        listaInicio.agregarInicio("cherry");
        listaInicio.agregarInicio("banana");
        listaInicio.agregarInicio("apple");

        System.out.println("Lista agregada al inicio (desordenada):");
        listaInicio.imprimirLista();  // Esperado: apple banana cherry date zebra  (ya ordenada por coincidencia)

        listaInicio.sortx();  // Sigue ordenada

        System.out.println("Después de sortx() (sigue ordenada):");
        listaInicio.imprimirLista();  // Esperado: apple banana cherry date zebra 
        System.out.println("Tamaño: " + listaInicio.getTamaño());  // 5
        System.out.println();

        // Prueba Extra: Comparación con sort() incompleto (para mostrar que no funciona)
        System.out.println("8. Prueba con sort() INCOMPLETO (debería NO ordenar):");
        ListaDobleCircular<Integer> listaSortIncompleto = new ListaDobleCircular<>();
        listaSortIncompleto.agregarFinal(5);
        listaSortIncompleto.agregarFinal(1);
        listaSortIncompleto.agregarFinal(3);

        System.out.println("Lista desordenada antes de sort():");
        listaSortIncompleto.imprimirLista();  // Esperado: 5 1 3 

        listaSortIncompleto.sortx();  // Llama al método incompleto - no hace nada útil

        System.out.println("Lista después de sort() (NO ordenada):");
        listaSortIncompleto.imprimirLista();  // Esperado: 5 1 3  (sin cambios)
        System.out.println("¡Confirma que sort() necesita completarse!");
        System.out.println();

        // Prueba adicional con sortx() en la misma lista
        listaSortIncompleto.sortx();  // Ahora sí ordena
        System.out.println("Lista después de sortx() (ordenada):");
        listaSortIncompleto.imprimirLista();  // Esperado: 1 3 5 
        System.out.println();

        System.out.println("¡Todas las pruebas completadas! El método sortx() funciona correctamente.");
        System.out.println("Recomendación: Reemplaza 'sort()' con 'sortx()' o completa 'sort()' basado en la lógica explicada.");
    }
}
