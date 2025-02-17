package je06_operadores.exercicio;

import java.util.Scanner;

public class IncrementarDecrementar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Peça um número, incremente-o em 1 e exiba o resultado. Em seguida, decremente o valor original em 1 e mostre o resultado.

        int numero = sc.nextInt();

        int incremento = numero + 1;
        int decremento = numero - 1;

        System.out.println("Número foi incrementado " + incremento);
        System.out.println("Número foi decrementado " + decremento);


    }
}
