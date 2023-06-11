package com.loja.service;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import com.loja.domain.Transacao;
import com.loja.repositories.LojaRepository;
import com.loja.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public Transacao findTransacaoById (Integer id){

        return transacaoRepository.findTransacaoById(id);

    }

    public Transacao insert (Transacao transacao){

        return  transacaoRepository.save(transacao);

    }

    public Transacao update (Transacao transacao){

        Transacao newTransacao = findTransacaoById(transacao.getId());

        updateData(newTransacao,transacao);

        return transacaoRepository.save(newTransacao);
    }

    private void updateData(Transacao newTransacao, Transacao transacao) {

        if (transacao.getData() == null){
            transacao.setData(newTransacao.getData());
        } else {
            newTransacao.setData(transacao.getData());
        }

//        if (transacao.getValor() != ){
//            transacao.setValor(newTransacao. getValor());
//        } else {
//            newTransacao.setValor(transacao.getValor());
//        }

        if (transacao.getTipo() == null){
            transacao.setTipo(newTransacao.getTipo());
        } else {
            newTransacao.setTipo(transacao.getTipo());
        }
    }

    public List<Transacao> findAll(){

        return transacaoRepository.findAll();
    }

    public void delete(Integer id){

        findTransacaoById(id);
        try {
           transacaoRepository.deleteById(id);
        }catch (Exception e ){
            throw e;
        }
    }



}
