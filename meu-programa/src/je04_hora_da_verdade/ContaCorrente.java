package je04_hora_da_verdade;

import je01_sintaxe_semanticas.Conta;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    // Atributos
    int numero;
    int agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo = true;

    double consultarSaldo(){
        return saldo; //só precise retornar o saldo, apenas isso!
    }

//    List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {

//        //Extrato é uma compocisão de varios registros
//        //Quando pensarmos em um retorno que retornara mais de um objeto,
//        //devemos pensar no tipo ( list )
//
//        return true;
//    }


    void cancelar(){
        //algoritimo irá manipular o atributo
        //ativo para que se torne false
    }

    void transferir(Conta destino, double valorTransferido){

    }








}
