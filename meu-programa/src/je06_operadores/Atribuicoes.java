package je06_operadores;

import java.util.Date;

public class Atribuicoes {
    public static void main(String[] args) {
        String nome = "Paulo";
        int idade = 20;
        double peso = 78.0;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); // Precisamos importar ( import java.util.Date )

        //Podemos fazer atribuições atraves de expressões
        String nome1 = "Paulo" + " Cesar ";//Aqui ele esta concatenando.
        System.out.println(nome1);
        //Por ser um valor literal podemos obter os métodos de uma String

    }
}
