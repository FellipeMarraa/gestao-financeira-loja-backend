package com.loja.repositories;

import com.loja.domain.Despesa;
import com.loja.domain.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao,Integer> {

    @Transactional
    Transacao findTransacaoById(Integer id);
}
