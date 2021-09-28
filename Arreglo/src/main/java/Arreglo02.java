public class Arreglo02 {
    public static void main(String[] args) {


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
