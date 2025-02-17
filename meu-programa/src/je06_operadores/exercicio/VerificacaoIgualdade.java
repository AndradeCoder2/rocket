package je06_operadores.exercicio;

import java.util.Scanner;

public class VerificacaoIgualdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite duas Strings");

        System.out.println("Digite o primeiro nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o segundo nome: ");
        String nome1 = sc.nextLine();

        if(nome.equals(nome1)){
            System.out.println("As strings são iguais");
        }else {
            System.out.println("As strings são diferentes");
        }

        //  Dois jeitos de comparar Strings.
        String str2 = "teste";
        String str1 = "teste";

        System.out.println(str1 == str2);

    }
}
