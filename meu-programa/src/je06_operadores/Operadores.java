package je06_operadores;

public class Operadores {


    public static void main(String[] args) {
        int numero1 = 44;
        int numero2 = 23;

        if(numero1 == numero2){
            System.out.println("Número 1 é igual ao numero 2");
        }

        if (numero1 > numero2){
            System.out.println("Número 1 é maior que o numero 2");
        }

        if (numero1 < numero2){
            System.out.println("Número 1 menor que número 2");
        }

        if (numero1 != numero2){
            System.out.println("Número 1 é diferente de número 2");
        }

        //Utilizando valor BOOLEANO
        int idadePaulo = 17;
        boolean idadeMaior = idadePaulo > 20;
        System.out.println("Paulo é maior de idade? " + idadeMaior);
    }

}
