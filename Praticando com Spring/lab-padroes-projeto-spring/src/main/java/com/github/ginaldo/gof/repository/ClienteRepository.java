package com.github.ginaldo.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.ginaldo.gof.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
