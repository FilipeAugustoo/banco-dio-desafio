package br.com.banco.dio.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Banco {
    private String nome;

    private static int QUANT_CONTAS = 0;
    private Endereco sedeBanco;

    public Banco(String nome, Endereco sedeBanco) {
        this.nome = nome;
        this.sedeBanco = sedeBanco;

        this.QUANT_CONTAS++;
    }

    public static int getQuantContas() {
        return Banco.QUANT_CONTAS;
    }
}
