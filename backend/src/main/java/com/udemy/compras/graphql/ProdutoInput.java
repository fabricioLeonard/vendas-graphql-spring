package com.udemy.compras.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProdutoInput {

    private Long id;
    private String nome;
    private Double valor;

}
