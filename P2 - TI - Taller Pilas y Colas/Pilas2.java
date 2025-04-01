import java.util.Stack;

public class Pilas2 {
    public static void main(String[] args) {
        Stack<String> p = new Stack<>();
        
        // Agregamos elementos a la pila
        p.push("perro");
        p.push("gato");
        p.push("ratón");
        p.push("elefante");
        p.push("jirafa");

        // Llamamos al método para mostrar la pila
        mostrarPila(p);
    }

    public static void mostrarPila(Stack<String> p) {
        Stack<String> aux = new Stack<>();

        // Sacamos elementos de p, los mostramos y los metemos en la pila auxiliar
        while (!p.isEmpty()) {
            String elemento = p.pop();
            System.out.println(elemento);
            aux.push(elemento);
        }

        // Devolvemos los elementos a la pila original
        while (!aux.isEmpty()) {
            p.push(aux.pop());
        }
    }
}