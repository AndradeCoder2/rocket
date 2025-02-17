package je06_operadores;

public class Unarios {
    public static void main(String[] args) {

        System.out.println("Operador Unário Decremento:");
        int numero = 5;
        //Imprimindo o numero negativo.
        System.out.println(- numero);

        //Imprimindo o decremento.
        System.out.println(-- numero);

        System.out.println("\nOperador Unário Incremento:");
        int numero1 = 5;
        //Imprimindo o numero positivo.
        System.out.println(+ numero1);

        //Incremento
        System.out.println(++ numero1);

        System.out.println("\nOperador Unário negação:");
        boolean desligada = true;
        System.out.println( "A luz está ligada: " + desligada);
        desligada = !desligada;
        System.out.println("A luz está desligada: " + desligada);




    }
}
