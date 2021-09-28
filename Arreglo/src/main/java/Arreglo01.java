import java.util.Random;
import java.util.Scanner;

public class Arreglo01 {

    public static int ingresarLargoArreglo(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el largo de su arreglo");

        return teclado.nextInt();
    }

    public static int[] generarArreglo(int largo){

        if(largo <= 0){
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


    public static int guardarParesAdyacentes(int[] myArr){

        int[] myArr2 = generarArreglo(myArr.length-1);
        myArr2 = copiarArreglo(myArr, myArr2);


    }

    public static int[] copiarArreglo(int[] myArr, int[] myArr2){

        if(myArr2.length > myArr.length) {
            return null;
        }

        for (int i = 0; i < myArr2.length; i++) {
            myArr2[i] = myArr[i];
        }

        return myArr2;
    }

    //Creamos otro arreglo para poder tener la contabilidad de los pares

    public static void mostrarParesAdyacentes(int[] myArr){

        int[] myArr2 = generarArreglo(myArr.length-1);
        myArr2 = copiarArreglo(myArr, myArr2);

        for(int i = 0; i < myArr2.length; i++){

        }

    }

}
