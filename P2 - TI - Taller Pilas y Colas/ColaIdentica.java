import java.util.Queue;
import java.util.LinkedList;

public class Cola {

    // Método que compara si dos colas son idénticas
    public static boolean sonIdenticas(Queue<Integer> cola1, Queue<Integer> cola2) {
        // Si las colas tienen diferentes tamaños, no pueden ser idénticas
        if (cola1.size() != cola2.size()) {
            return false;
        }
        
        // Compara los elementos de las colas uno a uno
        while (!cola1.isEmpty()) {
            // Si los elementos no son iguales, las colas no son idénticas
            if (!cola1.poll().equals(cola2.poll())) {
                return false;
            }
        }
        
        // Si no se encontraron diferencias, las colas son idénticas
        return true;
    }

    public static void main(String[] args) {
        // Creamos dos colas de enteros
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        
        // Añadimos elementos a la primera cola
        cola1.offer(1);
        cola1.offer(2);
        cola1.offer(3);
        
        // Añadimos los mismos elementos a la segunda cola
        cola2.offer(1);
        cola2.offer(2);
        cola2.offer(3);

        // Llamamos al método sonIdenticas y mostramos el resultado
        System.out.println(sonIdenticas(cola1, cola2));  // Debería imprimir 'true'
    }
}
