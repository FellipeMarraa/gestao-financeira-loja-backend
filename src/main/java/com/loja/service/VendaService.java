package com.loja.service;

import com.loja.domain.Despesa;
import com.loja.domain.Venda;
import com.loja.repositories.DespesaRepository;
import com.loja.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Venda findVendaById (Integer id){

        return vendaRepository.findVendaById(id);

    }

    public Venda insert (Venda venda){

        return  vendaRepository.save(venda);

    }

    public Venda update (Venda venda){

        Venda newVenda = findVendaById(venda.getId());

        updateData(newVenda,venda);

        return vendaRepository.save(newVenda);
    }

    private void updateData(Venda newVenda, Venda venda) {

        if (venda.getData() == null){
            venda.setData(newVenda.getData());
        } else {
            newVenda.setData(venda.getData());
        }

//        if (venda.getTotal() == ){
//            venda.setTotal(newVenda.getTotal());
//        } else {
//            newVenda.setTotal(venda.getTotal());
//        }
    }

    public List<Venda> findAll(){

        return vendaRepository.findAll();

    }

    public void delete(Integer id){

        findVendaById(id);
        try {
           vendaRepository.deleteById(id);
        }catch (Exception e ){
            throw e;
        }
    }


}
