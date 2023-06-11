package com.loja.resources;

import com.loja.domain.Despesa;
import com.loja.domain.Loja;
import com.loja.service.DespesaService;
import com.loja.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/loja")
public class LojaResource {

    @Autowired
    private LojaService lojaService;

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Loja> findById(@PathVariable Integer id) {

        Loja loja = lojaService.findLojaById(id);
        return ResponseEntity.ok().body(loja);

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Loja> insert(@RequestBody Loja loja) {

        lojaService.insert(loja);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Loja loja, @PathVariable Integer id) {
        loja.setId(id);
        lojaService.update(loja);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        lojaService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Loja>> findAll() {

        List<Loja> loja = lojaService.findAll();
        return ResponseEntity.ok().body(loja);
    }

}
