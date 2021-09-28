import java.util.Random;
import java.util.Scanner;

public class Arreglo01 {

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

}
