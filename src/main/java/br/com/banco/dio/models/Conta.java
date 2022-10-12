package br.com.banco.dio.models;

import br.com.banco.dio.interfaces.IConta;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int NUMERO_AGENCIA = 2022;
    private static int NUMERO_CONTA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    protected Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.NUMERO_AGENCIA;
        this.numero = NUMERO_CONTA++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Banco: %s", this.banco.getNome()));
    }
}
