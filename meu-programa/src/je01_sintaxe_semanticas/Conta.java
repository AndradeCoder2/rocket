package je01_sintaxe_semanticas;

public class Conta {
    // Variavel da classe Conta
     double saldo=30.0;

    //Criando metodo
    public void sacar(double valor) {
        // Variavel do metodo
        saldo -= valor;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual: " + saldo);

    }


}
    /*
    * Aqui está ocorrendo esse metodo pois não podemos chamar um metodo dentro de outro metodo.
    * double saldo = 30.0; nós conseguimos chamar o ( saldo ) pois ele e uma variavel global.
    * Assim estando disponivel no nosso código inteiro, para ser utilizada.*/
