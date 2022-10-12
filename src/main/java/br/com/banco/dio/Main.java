package br.com.banco.dio;

import br.com.banco.dio.models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Banco bancoDio = new Banco("Dio", new Endereco("São Paulo", "Araraquara", "Av. 7 de Setembro", "371 - Centro", 14800390));
        Banco bancoAlura = new Banco("Alura", new Endereco("Brasília", "Asa Sul", "Setor Comercial Sul 8 Bloco B50", "Venancio 2000 521", 70333900));
        Endereco endereco = new Endereco("São Paulo", "Campinas", "Piriri", "Perto do mercadinho", 6567875);
        Cliente venilton = new Cliente("Filipe", "DEV", 1212334564, LocalDate.of(2004, 8, 24), endereco);

        Conta cc = new ContaCorrente(venilton, bancoDio);
        Conta poupanca = new ContaPoupanca(venilton, bancoAlura);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println(Banco.getQuantContas());
    }
}