package br.com.banco.dio.models;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {super(cliente, banco);}

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(super.saldo >= valor) {
            if(super.banco.getNome().equals(contaDestino.banco.getNome())) {
                super.sacar(valor);
                contaDestino.depositar(valor);
            } else {
                super.sacar(valor + (valor * 0.05));
                contaDestino.depositar(valor);
            }
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Da Conta Corrente");
        super.imprimirInfosComuns();
    }
}
