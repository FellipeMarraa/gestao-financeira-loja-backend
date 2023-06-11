package com.loja.service;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import com.loja.repositories.DespesaRepository;
import com.loja.repositories.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public Loja findLojaById (Integer id){

        return lojaRepository.findLojaById(id);

    }

    public Loja insert (Loja loja){

        return  lojaRepository.save(loja);

    }

    public Loja update (Loja loja){

        Loja newLoja = findLojaById(loja.getId());

        updateData(newLoja,loja);

        return lojaRepository.save(newLoja);

    }

    private void updateData(Loja newLoja, Loja loja) {

        if (loja.getNome() == null){
            loja.setNome(newLoja.getNome());
        } else {
            newLoja.setNome(loja.getNome());
        }

        if (loja.getEndereco() == null){
            loja.setEndereco(newLoja.getEndereco());
        } else {
            newLoja.setEndereco(loja.getEndereco());
        }

        if (loja.getCnpj() == null){
            loja.setCnpj(newLoja.getCnpj());
        } else {
            newLoja.setCnpj(loja.getCnpj());
        }
    }

    public List<Loja> findAll(){

        return lojaRepository.findAll();

    }

    public void delete(Integer id){

        findLojaById(id);
        try {
           lojaRepository.deleteById(id);
        }catch (Exception e ){
            throw e;
        }
    }
}
