package je06_operadores.exercicio;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse número é: par");
        }else {
            System.out.println("Esse número é: impar");
        }
    }
}
