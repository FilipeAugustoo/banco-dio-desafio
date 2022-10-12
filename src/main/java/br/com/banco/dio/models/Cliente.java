package br.com.banco.dio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Cliente {

    private String nome;
    private String profissao;
    private int cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;
}
