package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.domain.Produto;
import com.udemy.compras.domain.ProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ProdutoService service;

    public Produto produto(Long id) {
        return service.findById(id);
    }

    public List<Produto> produtos() {
        return service.findAll();
    }

    public Produto saveProduto(ProdutoInput input) {
        ModelMapper modelMapper = new ModelMapper();
        Produto produto = modelMapper.map(input, Produto.class);

        return service.save(produto);
    }

    public Boolean deleteProduto(Long id) {
        return service.deleteById(id);
    }

}