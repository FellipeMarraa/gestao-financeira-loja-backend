package com.loja.repositories;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import com.loja.domain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Integer> {
}