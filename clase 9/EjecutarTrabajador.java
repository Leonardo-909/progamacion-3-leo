import java.util.Stack;

public class EjecutarTrabajador {
    public static void main(String[] args) {

        Stack<Trabajador> trabajadores = new Stack<>();
        // Agregar trabajadores a la pila

        Trabajador t1 = new Trabajador("1.111.542032", "Leonardo Angel Gomez", 2200.00);
        Trabajador t2 = new Trabajador("1.111.542033", "Maria Fernanda Lopez", 2500.00);
        Trabajador t3 = new Trabajador("1.111.542034", "Carlos Alberto Torres", 3000.00);

        trabajadores.push(t1);
        trabajadores.push(t2);
        trabajadores.push(t3);

        // System.out.println(trabajadores);

        System.out.println(trabajadores.size());

        double inc = 0.20; //incremento del 20%

        for (int i = 0; i < trabajadores.size(); i++) {
            System.out.println("Nombre:" + trabajadores.elementAt(i).getNombre()+ 
            "Salario inicial:" + trabajadores.elementAt(i).getSalario() +
            " Salario final después del incremento: " + trabajadores.elementAt(i).pagar(inc) + "\n");
        }

    }
}
