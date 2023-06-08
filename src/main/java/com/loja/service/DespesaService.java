package com.loja.service;

import com.loja.domain.Despesa;
import com.loja.repositories.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {


    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa findDespesaById (Integer id){

        return despesaRepository.findDespesaById(id);

    }

    public Despesa insert (Despesa despesa){

        return  despesaRepository.save(despesa);

    }

    public Despesa update (Despesa despesa){

        Despesa newDespesa = findDespesaById(despesa.getId());

        updateData(newDespesa,despesa);

        return despesaRepository.save(newDespesa);

    }

    private void updateData(Despesa newDespesa, Despesa despesa) {

        if (despesa.getData() == null){
            despesa.setData(newDespesa.getData());
        } else {
            newDespesa.setData(despesa.getData());
        }

//        if (despesa.getValor() != ){
//            despesa.setValor(newDespesa.getValor());
//        } else {
//            newDespesa.setValor(despesa.getValor());
//        }

        if (despesa.getDescricao() == null){
            despesa.setDescricao(newDespesa.getDescricao());
        } else {
            newDespesa.setDescricao(despesa.getDescricao());
        }

        if (despesa.getTipo() == null){
            despesa.setTipo(newDespesa.getTipo());
        } else {
            newDespesa.setTipo(despesa.getTipo());
        }
    }

    public List<Despesa> findAll(){

        return despesaRepository.findAll();

    }

    public void delete(Integer id){

        findDespesaById(id);
        try {
            despesaRepository.deleteById(id);
        }catch (Exception e ){
            throw e;
        }

    }

}
