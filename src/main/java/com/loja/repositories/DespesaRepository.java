package com.loja.repositories;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Integer> {
}
