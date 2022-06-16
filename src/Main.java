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

    System.out.println("-------------");
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

    System.out.println("-------------");
    //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

    int numeroDoWhile = 2;

    do {
        numeroDoWhile++;
        System.out.println("El número es: " + numeroDoWhile);

    } while (numeroDoWhile<3);



    System.out.println("-------------");
    /*Para el bucle For, crea una variable numeroFor,
    esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
    se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */



    for (int numeroFor =0; numeroFor<=3; numeroFor++ ){

        System.out.println("El número es: " + numeroFor);

    }

    System.out.println("-------------");
    /*Por último, para el Switch, deberás crear la variable estacion,
    y distintos case para las cuatro estaciones del año.
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
    informando de la estación en la que está.
    También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */

     String estacion = "Primavera";

     switch (estacion){
         case "Primavera":
             System.out.println("La estación es: " + estacion);
             break;
         case "Verano":
             System.out.println("La estación es: " + estacion);
             break;
         case "Otoño":
             System.out.println("La estación es: " + estacion);
             break;
         case "Invierno":
             System.out.println("La estación es: " + estacion);
             break;
         default: System.out.println("Esto no es una estación");

     }

    }
}