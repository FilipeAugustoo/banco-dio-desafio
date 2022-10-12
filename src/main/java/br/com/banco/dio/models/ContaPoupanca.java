package br.com.banco.dio.models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(super.saldo >= valor) {
            if(super.banco.getNome().equals(contaDestino.banco.getNome())) {
                super.sacar(valor);
                contaDestino.depositar(valor);
            } else {
                super.sacar(valor + (valor * 0.1));
                contaDestino.depositar(valor);
            }
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Da Conta Poupança");
        super.imprimirInfosComuns();
    }
}
