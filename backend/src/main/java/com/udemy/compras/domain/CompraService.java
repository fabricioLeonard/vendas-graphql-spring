package com.udemy.compras.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository repository;

    public Compra findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Compra> findAll(){
        return repository.findAll();
    }

    @Transactional
    public Compra save(Compra compra){
        return repository.save(compra);
    }

    @Transactional
    public Boolean deleteById(Long id){
        if (repository.findById(id).isPresent()){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Compra> findAllByCliente(Cliente c) {
        return repository.findAllByCliente(c);
    }

    public List<Compra> findAllByClienteAndQuantidade(Cliente c, int quantidade) {
        return repository.findAllByClienteAndQuantidade(c, quantidade);
    }
}
