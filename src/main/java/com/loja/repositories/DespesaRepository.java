package com.loja.repositories;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Integer> {

    @Transactional
    Despesa findDespesaById(Integer id);

}
