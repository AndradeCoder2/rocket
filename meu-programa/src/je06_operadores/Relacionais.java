package je06_operadores;

public class Relacionais {
    public static void main(String[] args) {
        String nome = "Arthur";
        //Usando 0 (==)
        if (nome == "Arthur"){
            System.out.println("As duas variáveis são iguais!");
        }else {
            System.out.println("Essa variável é incompativel!");
        }

        int a = 10;
        int b = 5;
        System.out.println(a == b); //Igual a...
        System.out.println(a > b); //Maior que
        System.out.println(a < b);//Menor de


        //Verificando se a variável e (diferente) (!=)
        int numero = 30;
        int numero1 = 566;
        System.out.println(numero != numero1); // true

    }
}
