import java.util.Random;
import java.util.Scanner;

public class Arreglo02 {
    public static void main(String[] args) {


    }
    public static int ingresarLargoArreglo(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el largo de su arreglo");

        return teclado.nextInt();
    }

    public static int[] generarArreglo(int largo){

        if(largo < 2 || largo > 10){
            return null;
        }

        return new int[largo];
    }

    public static int[] llenarArreglo(int[] myArr){

        for(int i = 0; i < myArr.length; i++){
            myArr[i] = new Random().nextInt(100);
        }

        return myArr;
    }

    public static void mostrarParesAdyacentes(int[] myArr) {
        System.out.println("Los pares adyacentes son: ");
        for (int i = 1; i < myArr.length; i++) {
            System.out.println("(" + myArr[i-1] +","+myArr[i]+")");
        }
    }
    public static String darEntrada() {

        System.out.println("Ingrese un número");
        return new Scanner(System.in).nextLine();
    }

    public static Integer darEntradaInt() {

        try {
            return Integer.parseInt(darEntrada());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: vuelva a ingresar el número");
            return darEntradaInt();
        }
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido al menú :D ");
        System.out.println("----------------------------------------");
        System.out.println("¿Qué desea hacer? ");
        System.out.println("[1] Mostrar pares adyacentes ");
        System.out.println("[2] Mostrar el mayor valor de producto ");
        System.out.println("[3] Salir ");
        System.out.println("----------------------------------------");
    }
    public static void iniciar() {

        int eleccion = -1;

        do {
            int[] arreglo = llenarArreglo(generarArreglo(ingresarLargoArreglo()));
            mostrarMenu();
            eleccion = darEntradaInt();

            switch (eleccion) {
                case 1 -> {
                    mostrarParesAdyacentes(arreglo);
                }
                case 2 -> {
                    System.out.println(mayorProductoAdyacentes(arreglo));
                }
                case 3 -> {
                    salir();
                }
                default -> System.out.println("Se ha ingresado una opción no válida");
            }

        } while (eleccion != 3);
    }
    public static void salir() {
        System.out.println("Gracias por usar la aplicacion");
        System.out.println("Adios ...");

    }


    public static int mayorProductoAdyacentes(int[] myArr) {

        int mayor = myArr[0] * myArr[1];

        for (int i = 2; i < myArr.length; i++) {

            int temporal = myArr[i-1] * myArr[i];

            if (temporal > mayor) {
                mayor = temporal;
            }
        }
        return mayor;
    }


}
