package com.loja.repositories;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import com.loja.domain.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface LojaRepository extends JpaRepository<Loja,Integer> {

    @Transactional
    Loja findLojaById(Integer id);

}
