package je06_operadores.exercicio;

import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calcular a área e o perímetro de um retângulo: Solicite o comprimento e a largura, calcule e exiba a área e o perímetro.

        System.out.println("Digite o valor da area: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor da base: ");
        int b = sc.nextInt();

        int area = a * b;
        int perimetro = (a + b) / 2;

        System.out.println("A area desse retangulo é de: " + area);
        System.out.println("O perimetro desse retangulo é de: " + perimetro);





    }
}
