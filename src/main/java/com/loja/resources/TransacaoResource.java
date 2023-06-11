package com.loja.resources;

import com.loja.domain.Loja;
import com.loja.domain.Transacao;
import com.loja.service.LojaService;
import com.loja.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transacao")
public class TransacaoResource  {

    @Autowired
    private TransacaoService transacaoService;

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Transacao> findById(@PathVariable Integer id) {

        Transacao transacao = transacaoService.findTransacaoById(id);
        return ResponseEntity.ok().body(transacao);

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Transacao> insert(@RequestBody Transacao transacao) {

        transacaoService.insert(transacao);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Transacao transacao, @PathVariable Integer id) {
       transacao.setId(id);
        transacaoService.update(transacao);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        transacaoService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Transacao>> findAll() {

        List<Transacao> transacao = transacaoService.findAll();
        return ResponseEntity.ok().body(transacao);
    }


}
