package com.loja.repositories;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import com.loja.domain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Integer> {

    @Transactional
    Venda findVendaById(Integer id);

}
