package br.com.banco.dio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Endereco {

    private String estado;
    private String cidade;
    private String bairro;
    private String complemento;
    private int cep;
}
