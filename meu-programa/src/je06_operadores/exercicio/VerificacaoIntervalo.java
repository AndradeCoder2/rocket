package je06_operadores.exercicio;

import java.util.Scanner;

public class VerificacaoIntervalo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = sc.nextInt(); //Usuario inserir a String.

        if (n1 >= 10 && n1 <=20){
            System.out.println("O número está dentro do intervalo");
        }else{
            System.out.println("O número está fora do intervalo");
        }

        if (n1 % 2 == 0){
            System.out.println("sse número é par");
        }else {
            System.out.println("Esse número e impar");
        }
    }
}
