package com.udemy.compras.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findAllByCliente(Cliente c);

    List<Compra> findAllByClienteAndQuantidade(Cliente c, int quantidade);

}
