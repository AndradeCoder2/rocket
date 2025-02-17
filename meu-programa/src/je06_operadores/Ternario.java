package je06_operadores;

public class Ternario {
    public static void main(String[] args) {
        String nome = "Paulo";
        int idade = 18;
        final int maior_Idade = 18;//Colocamos maiorIdade como (final), não podendo mudar o valor da variavel.
        boolean MAIOR_IDADE = idade >= maior_Idade;
        String mensagem = nome +  (MAIOR_IDADE ? " é de maior" : "não é de maior");
        System.out.println(mensagem);

        String nome1 = "Paulo";
        int idade1 = 18;
        final int idade2 = 18;
        boolean IDADE_MAIOR = idade1 >= idade2;
        String mensagem1 = nome1 + (IDADE_MAIOR ? " é maior de idade é tem já pode dirigir" : "não é maior de idade" );
        System.out.println(mensagem1);





    }
}

