
import java.util.Scanner;

public class OperacionesConArreglos {
    private Scanner scanner = new Scanner(System.in);

    public String mostrarElementos(int[] a) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            cad += "a[ " + i + " ] = " + a[i] + "\n";
        }
        return cad;
    }

    public int sumarElementos(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    public double promedioElementos(int[] a) {
        double suma = 0.0, promedio = 0.0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        promedio = suma / a.length;
        return promedio;
    }


    public int[] llenarArregloAleatorios(int tam) {
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }  
    
    public void Ejercicio2(int e){
        double[] sueldos = new double[e];
        double[] asignaciones = new double[e];
        double[] deducciones = new double[e];
        double[] pagoNeto = new double[e];
    
        for (int i = 0; i < e; i++) {
            System.out.println("\n Empleado "+ (i+1));
            System.out.println("Sueldo: ");
            sueldos[i] = scanner.nextDouble();
            System.out.println("Asignaciones: ");
            asignaciones[i] = scanner.nextDouble();
            System.out.println("Deducciones: ");
            deducciones[i] = scanner.nextDouble();
    
            pagoNeto[i] = sueldos[i] + asignaciones[i] - deducciones[i];
            }
            System.out.println("\nPago neto por empleado: ");
            for(int i = 0; i < e; i++) {
                System.out.println("Empleado " +(i + 1)+": " + String.format("%.2f", pagoNeto[i]));
            }   
    }

        public void Ejercicio3(int s){
            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sumaPares = 0, sumaImpares = 0;
    
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    sumaPares += numero;
                } else {
                    sumaImpares += numero;
                }
        }
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }

}
