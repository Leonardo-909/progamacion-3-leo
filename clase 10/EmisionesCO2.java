public class EmisionesCO2 {

    public static void main(String[] args) {

        // Factores de emisión de CO₂ por tipo de combustible (en kg por vehículo)
        double gasolina = 2.31; // Cada vehículo a gasolina emite 2.31 kg de CO₂
        double diesel = 2.68;   // Cada vehículo a diésel emite 2.68 kg de CO₂
        double gas = 2.75;      // Cada vehículo a gas emite 2.75 kg de CO₂

        // Camiones Livianos - 400000 vehículos
        int livianos = 400000;
        System.out.println("Camiones Livianos:");
        calcularEmisiones(livianos, 30, 40, 30, gasolina, diesel, gas);

        // Camiones Medianos - 280000 vehículos
        int medianos = 280000;
        System.out.println("\nCamiones Medianos:");
        calcularEmisiones(medianos, 25, 40, 35, gasolina, diesel, gas);

        // Camiones Pesados - 380000 vehículos
        int pesados = 380000;
        System.out.println("\nCamiones Pesados:");
        calcularEmisiones(pesados, 10, 40, 50, gasolina, diesel, gas);

        // Tractocamiones - 1150000 vehículos
        int tractocamiones = 1150000;
        System.out.println("\nTractocamiones:");
        calcularEmisiones(tractocamiones, 5, 90, 5, gasolina, diesel, gas);

        // Volquetas - 936000 vehículos
        int volquetas = 936000;
        System.out.println("\nVolquetas:");
        calcularEmisiones(volquetas, 10, 40, 50, gasolina, diesel, gas);
    }

    // Método que calcula y muestra las emisiones de CO₂ según el tipo y cantidad de vehículos
    public static void calcularEmisiones(int cantidad, int porGasolina, int porDiesel, int porGas,
                                         double factorGasolina, double factorDiesel, double factorGas) {

        // Cálculo de la cantidad de vehículos por tipo de combustible (usando porcentajes)
        int cantGasolina = cantidad * porGasolina / 100;
        int cantDiesel = cantidad * porDiesel / 100;
        int cantGas = cantidad * porGas / 100;

        // Cálculo de emisiones de CO₂ por tipo de combustible
        double emisGasolina = cantGasolina * factorGasolina;
        double emisDiesel = cantDiesel * factorDiesel;
        double emisGas = cantGas * factorGas;

        // Mostrar los resultados en consola
        System.out.println("- Gasolina: " + cantGasolina + " vehículos -> " + emisGasolina + " kg de CO₂");
        System.out.println("- Diesel: " + cantDiesel + " vehículos -> " + emisDiesel + " kg de CO₂");
        System.out.println("- Gas: " + cantGas + " vehículos -> " + emisGas + " kg de CO₂");
    }
}