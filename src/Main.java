public class Main {
    public static void main(String[] args) {

    /*   Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    */

    int numeroIf = 0;

    if (numeroIf>0){
        System.out.println("El número es positivo");
    } else if (numeroIf>0) {
        System.out.println("El número es negativo");
    } else {
        System.out.println("El número es igual a 0");
    }

    /*Crea un bucle While, este bucle tendrá que tener como condición que la
      variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
      Incrementar el valor de la variable en uno cada vez que se ejecute.
      Mostrarlo por pantalla cada vez que se ejecute.
    */

    int numeroWhile = -10;

    while (numeroWhile<3) {
        System.out.println("El número es: " + numeroWhile);
        numeroWhile++;

    }




    }
}