package br.com.banco.dio.interfaces;

import br.com.banco.dio.models.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
