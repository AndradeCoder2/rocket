package je06_operadores.exercicio;

import java.util.Scanner;

//Peça dois números e diga se são iguais, se o primeiro é maior que o segundo ou se o segundo é maior que o primeiro.
public class ComparandoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else {
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}

