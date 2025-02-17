package je06_operadores.exercicio;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        //Verificar se um ano é bissexto: Peça um ano e diga se ele é bissexto ou não.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int anoBissexto = sc.nextInt();

        if(anoBissexto % 4 != 0 && anoBissexto % 400 != 0){
            System.out.println("O ano " + anoBissexto + " é considerado bissexto");

        }else {
            System.out.println("O ano " + anoBissexto + " não é bissexto");
        }
    }
}
