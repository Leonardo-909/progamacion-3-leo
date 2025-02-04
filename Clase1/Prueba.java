public class Prueba{
    public static void main(String[] args) {
        int[] a = {4, 8, 2, 1, 6, 5,};
        System.out.println(sumaParesImparesArreglo(a));
    }

    public static String sumaParesImparesArreglo(int[]a){
        int sumaPares = 0, sumaImpares = 0;
        String cad="";

        for(int i = 0; i < a.length; i++){
            if (a[i]%2 == 0) {
                sumaPares += a[i];
            }else{
                sumaImpares += a[i];
            }
        }
        cad = "la suma de los numeros pares = " + sumaPares + "suma de los numeros impares = " + sumaImpares;
        return cad;
    }
    public static String sumaExtremosArreglo(int[] a){
        String cad= "";
        //verificamos si el arreglo es par o impar
        if ((a.length%2 ==0)) {
            //el arreglo es par
            for(int i =0; i < a.length/2; i++){
                cad+=(a[i]+(a[a.length-1-i]))+ " ";
            }
        }else{
            //el arreglo es impar
            cad+="Arreglo impar";
        }
        return cad;

    }
}
