package com.loja.resources;

import com.loja.domain.Transacao;
import com.loja.domain.Venda;
import com.loja.service.TransacaoService;
import com.loja.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/venda")
public class VendaResource {

    @Autowired
    private VendaService vendaService;

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Venda> findById(@PathVariable Integer id) {

        Venda venda = vendaService.findVendaById(id);
        return ResponseEntity.ok().body(venda);

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Transacao> insert(@RequestBody Venda venda) {

        vendaService.insert(venda);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Venda venda, @PathVariable Integer id) {
        venda.setId(id);
        vendaService.update(venda);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        vendaService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Venda>> findAll() {

        List<Venda> venda = vendaService.findAll();
        return ResponseEntity.ok().body(venda);
    }


}
