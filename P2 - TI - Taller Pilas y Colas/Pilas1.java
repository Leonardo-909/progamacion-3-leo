import java.util.Stack; 

public class Pilas1 {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>(); // Creamos una pila de enteros
        int x = 4, y; // Declaramos dos variables enteras

        p.push(x); // Apilamos el valor de x (4) en la pila
        System.out.println("\n" + p.peek()); // Mostramos el elemento en la cima de la pila (4)
        
        y = p.pop(); // Sacamos el elemento de la pila y lo guardamos en y
        p.push(32); // Apilamos el número 32
        p.push(p.pop()); // Sacamos el 32 y lo volvemos a meter (no cambia nada)

        // Desapilamos e imprimimos los elementos hasta que la pila esté vacía
        do {
            System.out.println("\n" + p.pop());
        } while (!p.isEmpty()); // Se ejecuta mientras la pila no esté vacía
    }
}